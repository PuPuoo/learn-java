package chapter05;

public class Java03_Object {
    public static void main(String[] args) {
        // TODO 数组 冒泡排序
        // TODO 冒泡排序就像排队时老师比身高大小，两两交换
        int[] nums = {9,1,4,3,5,2};
        for (int num : nums) {
            System.out.println(num);
        }


        System.out.println("***************************");

        // 简化需求：将最大值放到数组最后
        /*for (int j = 0; j < nums.length-1; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                int num1 = nums[i];
                int num2 = nums[i + 1];
                // 若是左边值大则交换到右边
                if (num1 > num2) {
                    nums[i] = num2;
                    nums[i + 1] = num1;
                }
            }
        }*/

        // TODO 优化版本
        // 避免已经排好序的元素被重复比较

        // 外层循环控制总轮数
        for (int i = 0; i < nums.length - 1; i++) {
            // 内层控制两两比较
            for (int j = 0; j < nums.length - 1 - i; j++) { // -j是为了避免已经排好序的元素再次被比较
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }


        for (int num : nums) {
            System.out.println(num);
        }
    }
}
