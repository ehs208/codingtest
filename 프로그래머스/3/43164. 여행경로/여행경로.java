import java.util.*;
class Solution {
    
    String[][] tickets;
    boolean[] isVisited;
    ArrayList<ArrayList<String>> allRoutes = new ArrayList<>();
    int ticketNum;
    
    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        this.isVisited = new boolean[tickets.length];
        this.ticketNum = tickets.length;
        
        ArrayList<String> initialRoute = new ArrayList<>();
        initialRoute.add("ICN");
        
        dfs("ICN", 0, initialRoute);
        
        Collections.sort(allRoutes, (r1, r2) -> {
            int size = Math.min(r1.size(), r2.size());
            for (int i = 0; i < size; i++) {
                int cmp = r1.get(i).compareTo(r2.get(i));
                if (cmp != 0) return cmp;
            }
            return Integer.compare(r1.size(), r2.size());
        });
        
        return allRoutes.get(0).toArray(new String[0]);
    }
    
    public void dfs(String start, int cnt, ArrayList<String> routes) {
        if(cnt == ticketNum) {
            allRoutes.add(new ArrayList<>(routes));
            return;
        }
        
        for(int i = 0; i < ticketNum; i++) {
            if(!isVisited[i] && tickets[i][0].equals(start)) {
                isVisited[i] = true;
                routes.add(tickets[i][1]);
                
                dfs(tickets[i][1], cnt+1, routes);
                
                routes.remove(routes.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}
