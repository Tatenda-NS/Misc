import java.util.Arrays;

public class AddOneImproved {

    //This solution works for any size of input.
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 7, 4, 8, 3, 6, 4, 7, 2, 1, 4, 7, 4, 8, 3, 6, 4, 7, 9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(addOneImproved(nums)));
    }

    public static int[] addOneImproved(int[] nums) {
        if (nums[nums.length - 1] < 9)
        {
            nums[nums.length - 1] += 1;
            return nums;
        }
        int[] intArray = new int[nums.length + 1];
        int carry = 1;
        for (int i = nums.length - 1; i >= 0; i--)
        {
            if (nums[i] < 9)
            {
                nums[i] += carry;
                return nums;
            } else
                nums[i] = 0;
        }
        intArray[0] = 1;
        return intArray;
    }
}
