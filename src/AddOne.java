import java.util.Arrays;
import java.util.stream.Stream;

// This solution works when nums the input array is less than the Integer.MAX_VALUE 2147483647
public class AddOne {
    public static void main(String[] args) {
        int nums[] = {2,1,4,7,4,8,3,6,4,4};
        System.out.println(Arrays.toString(addOne(nums)));
    }

    private static int[] addOne(int[] nums) {
        String str = "";
        for (int num : nums)
        {
            str = str + num;
        }
        int sum = Integer.parseInt(str) + 1;
        String[] strArray = Integer.toString(sum).split("");
        int[] intArray = Stream.of(strArray).mapToInt(Integer::parseInt).toArray();
        return intArray;
    }
}
