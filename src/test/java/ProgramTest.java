import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import org.junit.jupiter.api.Test;

public class ProgramTest {

    @Test
    public void testCaseOne() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{7, 6, 4, -1});
        expectedList.add(new Integer[]{7, 6, 1, 2});

        int[] numbers = new int[]{7, 6, 4, -1, 1, 2};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 16);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseTwo() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{1, 2, 3, 4});

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 10);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseThree() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{5, -5, -2, 2});
        expectedList.add(new Integer[]{5, -5, 3, -3});
        expectedList.add(new Integer[]{-2, 2, 3, -3});

        int[] numbers = new int[]{5, -5, -2, 2, 3, -3};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 0);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseFourTest() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{-2, 1, 2, 3});
        expectedList.add(new Integer[]{-2, -1, 3, 4});
        expectedList.add(new Integer[]{-2, -1, 2, 5});
        expectedList.add(new Integer[]{-2, -1, 1, 6});

        int[] numbers = new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 4);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseFour() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{-2, -1, 1, 6});
        expectedList.add(new Integer[]{-2, 1, 2, 3});
        expectedList.add(new Integer[]{-2, -1, 2, 5});
        expectedList.add(new Integer[]{-2, -1, 3, 4});

        int[] numbers = new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 4);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseFive() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{-1, 22, 7, 2});
        expectedList.add(new Integer[]{22, 4, 7, -3});
        expectedList.add(new Integer[]{-1, 18, 11, 2});
        expectedList.add(new Integer[]{18, 4, 11, -3});
        expectedList.add(new Integer[]{22, 11, 2, -5});

        int[] numbers = new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 30);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseSix() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{-5, 2, 15, 8});
        expectedList.add(new Integer[]{-3, 2, -7, 28});
        expectedList.add(new Integer[]{-10, -3, 28, 5});
        expectedList.add(new Integer[]{-10, 28, -6, 8});
        expectedList.add(new Integer[]{-7, 28, -6, 5});
        expectedList.add(new Integer[]{-5, 2, 12, 11});
        expectedList.add(new Integer[]{-5, 12, 8, 5});

        int[] numbers = new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 20);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseSeven() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{});

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 100);

        validateListOfArrays(expectedList, actualList);
    }

    @Test
    public void testCaseEight() {
        Program program = new Program();
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{2, 3, 5, -5});
        expectedList.add(new Integer[]{1, 4, 5, -5});
        expectedList.add(new Integer[]{2, 4, 5, -6});
        expectedList.add(new Integer[]{1, 3, -5, 6});
        expectedList.add(new Integer[]{2, 3, 6, -6});
        expectedList.add(new Integer[]{1, 4, 6, -6});

        int[] numbers = new int[]{1, 2, 3, 4, 5, -5, 6, -6};
        List<Integer[]> actualList = program.fourNumberSum(numbers, 5);

        validateListOfArrays(expectedList, actualList);
    }

    private boolean validateListOfArrays(List<Integer[]> expectedList, List<Integer[]> actualList) {
        Stack<Integer[]> expectedAsStack = new Stack<>();
        expectedAsStack.addAll(expectedList);
        int equals = 0;

        for(Integer[] expected: expectedAsStack) {
            for (Integer[] actual : actualList) {
                if(Arrays.equals(expected, actual))
                    equals++;
            }
        }

        return actualList.size() == equals;
    }
}
