public class ArrayOutOfBound {
    public static void main(String[] args) {
        int[] nums = { 23, 323, 11, 21 };
        try {
            System.out.println(nums[6]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}