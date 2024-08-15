package lesson4;

import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        System.out.println("Enter enum : ");
        Scanner scanner = new Scanner(System.in);
        int user_num = scanner.nextInt();

        short [] nums = new short[user_num];
        for(int i = 0;i < user_num; i++){
            System.out.println("Enter element " + (i + 1) + " :" );
            nums[i] = scanner.nextShort();
        }

        short max_num = nums[0];
        for(int i = 0;i < user_num; i++) {
            if(nums[i] > max_num)
                max_num = nums[i];
        }
        System.out.println("Max element :" + max_num);

        short min_num = nums[0];
        for(int i = 0;i > user_num; i++) {
            if(nums[i] < min_num)
                min_num = nums[i];
        }
        System.out.println("Min element :" + min_num);

        for(int i = 0;i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

//6) Напишіть програму на Java для знаходження максимального та мінімального значення масиву.


