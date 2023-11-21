package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class PGM_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int bridgeWeight = 0;
        int truckIndex = 0;
        Queue<Integer> bridge = new LinkedList<>();
        for(int i=0;i<bridge_length;i++){
            bridge.add(0);
        }

        while(truckIndex<truck_weights.length){
            //다리를 건넘
            bridgeWeight -= bridge.poll();

            int truckWeight = truck_weights[truckIndex];
            if(bridgeWeight + truckWeight <= weight){
                bridge.add(truckWeight);
                bridgeWeight += truckWeight;
                truckIndex++;

            }else{
                bridge.add(0);
            }
            time++;

        }
        while(bridgeWeight >0){
            bridgeWeight -= bridge.poll();
            time++;
        }
        return time;


    }
}
