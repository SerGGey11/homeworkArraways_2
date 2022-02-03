package com.company;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
//
        int[] arr1 = generateRandomArray();
        int max = arr1[0];
        int min = arr1[0];
        for (int i : arr1) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальные затраты за день" + min + " рублей");
        System.out.println("Максимальные затраты за день" + max + " рублей");
//
        int[] arr2 = generateRandomArray();
        int sum2 = 0;
        for (int i : arr2){
            sum2 += i;
        }
        float average = sum2 / (float) arr2.length;
        System.out.println("Средняя сумма трат за месяц составляет: " + average + " рублей");
        //
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'} ;

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }



    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100_000);
            arr[i] = num + 100_000;
        }
        return arr;
    }
}


