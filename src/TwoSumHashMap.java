import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashMap {
    public static int[] sum(int[] nums, int target) {
        if (nums.length < 1)
            return nums;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(target - nums[i]))
            {
                return new int[]{map.get(target - nums[i]), i};
            }
            else
            {
                map.put(nums[i], i);
            }
        }
        return new int[]{0,0}; //nothing found
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 5, 6, 7, 8};
        int target = 11;
        System.out.println(Arrays.toString(sum(nums, target)));
    }
}
