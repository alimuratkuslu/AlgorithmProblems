package Stack;

import java.util.*;

public class CarFleet {

    public static void main(String[] args){

        int[] p1 = new int[]{10,8,0,5,3};
        int[] s1 = new int[]{2,4,1,1,3};

        int[] p2 = new int[]{3};
        int[] s2 = new int[]{3};

        int[] p3 = new int[]{0,2,4};
        int[] s3 = new int[]{4,2,1};

        System.out.println(carFleet(12, p1, s1)); // 3
        System.out.println(carFleet(10, p2, s2)); // 1
        System.out.println(carFleet(100, p3, s3)); // 1
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Float> stack = new Stack<>();

        for(int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }

        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(map);

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            float time = (float) (target - entry.getKey()) / entry.getValue();
            stack.push(time);

            if(stack.size() >= 2) {
                float top = stack.pop();
                float beforeTop = stack.peek();
                stack.push(top);

                if(top <= beforeTop) {
                    stack.pop();
                }
            }
        }

        return stack.size();
    }
}
