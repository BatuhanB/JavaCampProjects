public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,12,33,43};
        int target = 12;
        FindNumber(nums,target);
    }

    public static void FindNumber(int[] nums,int target){
        boolean isExist = false;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                isExist = true;
                index = i;
                break;
            }
        }
        SetMessage(isExist,target,index);
    }

    public static void SetMessage(boolean isExist,int target,int index){
        if (isExist){
            System.out.println("The target number => " + target + " is found at index: " + index );
        }else{
            System.out.println("The number that you are looking for is not exist in current array!");
        }
    }
}
