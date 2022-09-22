public class Main {
    public static void main(String[] args) {
        //value type
        int number1 = 10; int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2); //result: 10

        //reference type
        int[] nums1 = new int[]{1, 2, 3}; int[] nums2 = new int[]{4, 5, 6};
        nums2 = nums1;
        nums1[0] = 10;
        System.out.println(nums2[0]); //result: 10
    }
}
