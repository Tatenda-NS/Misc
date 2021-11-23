import java.util.Arrays;

public class TwoSum {
    public static int[] sum(int[] nums, int target) {
        if (nums.length < 1)
            return nums;

        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 5, 6, 7, 8};
        int target = 20;
        System.out.println(Arrays.toString(sum(nums, target)));
    }
}
