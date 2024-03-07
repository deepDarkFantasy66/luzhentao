package com.example.learn.HashSet.args;

public class ArgsDemo {
    public static void main(String[] args){
        getSum(1, 2, 3, 4, 5);
        getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[] arr = {1, 2, 3, 4, 5};
        getSum(1,arr);
    }

    /**
     * 可变参数需要放在参数列表的最后，且只能有一个可变参数
     * 可变参数格式：数据类型...变量名
     * @param a
     * @param nums
     * @return
     */
    private static int getSum(int a,int... nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
        return sum;
    }
}
