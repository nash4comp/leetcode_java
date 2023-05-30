package A_Array_and_Hashing;
import java.util.HashSet;

class ContainsDuplicate 
{
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setOfNums = new HashSet<Integer>();
        for (int number : nums) {
            setOfNums.add(number);
        }
        if (nums.length == setOfNums.size()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 5, 2, 3, 4};
        System.out.println(containsDuplicate(arr));
    }
}
