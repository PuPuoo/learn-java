package chapter05;

public class Java04_Object {
    public static void main(String[] args) {
        // TODO 选择排序
        // 每一轮从剩下的元素中“选择最小值”，放到前面已经排好的序列末尾

        int[] nums = {9,3,6,1,2};

        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i; // 记录最小值的位置
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    // 更新当前最小值的位置
                    minIndex = j;
                }
            }

            // 如果当前位置不是最小值，则交换
            if (minIndex != i) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
