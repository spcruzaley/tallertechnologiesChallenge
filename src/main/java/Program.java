import java.util.LinkedList;
import java.util.List;

public class Program {

    public List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        LinkedList<Integer[]> linkedList = new LinkedList<>();

        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    for (int l = k+1; l < array.length; l++) {
                        if(array[i]+array[j]+array[k]+array[l] == targetSum) {
                            Integer[] arrayWithAnswer = new Integer[]{array[i],array[j],array[k],array[l]};
                            linkedList.addFirst(arrayWithAnswer);
                        }
                    }
                }
            }
        }

        return linkedList;
    }

}
