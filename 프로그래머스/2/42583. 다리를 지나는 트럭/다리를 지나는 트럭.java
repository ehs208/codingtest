import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<int[]> bridge = new LinkedList<>();
        Queue<Integer> trucks = new LinkedList<>();

        for(int car : truck_weights){
            trucks.offer(car);
        }

        int car_weight = 0;
        int time = 0;

        while (!trucks.isEmpty() || !bridge.isEmpty()) {
           if(!bridge.isEmpty() && bridge.peek()[0] <= time) {
            int[] temp = bridge.poll();
            car_weight -= temp[1];
        }
            if(!trucks.isEmpty() && bridge.size() + 1 <= bridge_length && car_weight + trucks.peek() <= weight) {
                int temp = trucks.poll();
                car_weight += temp;
                bridge.add(new int [] {time + bridge_length,temp});
            }
            time++;
            }

        
        
        return time;
    }
}