import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] slidingMaximum(final int[] A, int B) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return -1;
                }
                else if(o1 == o2){
                    return 0;
                }
                return 1;
            }
        });

        int SIZE = (B >= A.length ? 1 : A.length - B + 1);
        int[] result = new int[SIZE];
        int QUEUESIZE =Math.min(B, A.length);
        for(int index = 0; index < QUEUESIZE; index++){
            priorityQueue.add(A[index]);
        }
        result[0] = priorityQueue.peek();

        for(int index = QUEUESIZE; index < A.length; index++){
            priorityQueue.remove(A[index - QUEUESIZE]);
            priorityQueue.add(A[index]);
            result[index - QUEUESIZE + 1] = priorityQueue.peek();
        }
        return result;
    }
}
