package chapter05;

public class Java05_Object {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,9};

        // TODO 二分查找法
        int left = 0;
        int right = nums.length - 1;

        int target = 2;

        while (left <= right) {
            // 重置中间指针
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            } else if (nums[mid] < target) {
                left = mid + 1; // 往右边找
            }else {
                right = mid - 1; // 往左边找s
            }
        }


    }
}
