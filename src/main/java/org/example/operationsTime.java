package org.example;

public class operationsTime {
    public static void main(String[] args) {
        int[] numbersBig = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbersBig[i] = i;
        }
        long startTimeBig = System.nanoTime();
        Operations.min(numbersBig);
        long endTimeBig = System.nanoTime();
        long durationBig = endTimeBig - startTimeBig;
        System.out.println("Время нахождения минимального значения с 1000000 элементами " + durationBig + " нс");

        int[] numbersSmall = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmall[i] = i;
        }
        long startTimeSmall = System.nanoTime();
        Operations.min(numbersSmall);
        long endTimeSmall= System.nanoTime();
        long durationSmall = endTimeSmall - startTimeSmall;
        System.out.println("Время нахождения минимального значения с 10 элементами " + durationSmall + " нс");

        if (durationSmall < 10000000) {
            System.out.println("Время выполнения операции слишком долгое: " + durationSmall + " нс");
        }

        System.out.println();

        int[] numbersThird = new int[10000];
        for (int i = 0; i < 10000; i++) {
            numbersThird[i] = i;
        }
        long startTimeThird = System.nanoTime();
        Operations.max(numbersThird);
        long endTimeThird = System.nanoTime();
        long durationThird = endTimeThird - startTimeThird;
        System.out.println("Время нахождения максимального значения с 10000 элементами " + durationThird + " нс");

        int[] numbersSecond = new int[5000];
        for (int i = 0; i < 5000; i++) {
            numbersSecond[i] = i;
        }
        long startTimeSecond = System.nanoTime();
        Operations.max(numbersSecond);
        long endTimeSecond = System.nanoTime();
        long durationSecond = endTimeSecond - startTimeSecond;
        System.out.println("Время нахождения максимального значения с 5000 элементами " + durationSecond + " нс");

        int[] numbersFourth = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbersFourth[i] = i;
        }
        long startTimeFourth = System.nanoTime();
        Operations.max(numbersFourth);
        long endTimeFourth = System.nanoTime();
        long durationFourth = endTimeFourth - startTimeFourth;
        System.out.println("Время нахождения максимального значения с 1000 элементами " + durationFourth + " нс");

        int[] numbersOne = new int[500];
        for (int i = 0; i < 500; i++) {
            numbersOne[i] = i;
        }
        long startTimeOne = System.nanoTime();
        Operations.max(numbersOne);
        long endTimeOne = System.nanoTime();
        long durationOne = endTimeOne - startTimeOne;
        System.out.println("Время нахождения максимального значения с 500 элементами " + durationOne + " нс");

        int[] numbersFifth = new int[100];
        for (int i = 0; i < 100; i++) {
            numbersFifth[i] = i;
        }
        long startTimeFifth = System.nanoTime();
        Operations.max(numbersFifth);
        long endTimeFifth = System.nanoTime();
        long durationFifth = endTimeFifth - startTimeFifth;
        System.out.println("Время нахождения максимального значения с 100 элементами " + durationFifth + " нс");


        int[] numbersBigMax = new int[50];
        for (int i = 0; i < 50; i++) {
            numbersBigMax[i] = i;
        }
        long startTimeBigMax = System.nanoTime();
        Operations.max(numbersBigMax);
        long endTimeBigMax = System.nanoTime();
        long durationBigMax = endTimeBigMax - startTimeBigMax;
        System.out.println("Время нахождения максимального значения с 50 элементами " + durationBigMax + " нс");

        int[] numbersSmallMax = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmallMax[i] = i;
        }
        long startTimeSmallMax = System.nanoTime();
        Operations.max(numbersSmallMax);
        long endTimeSmallMax= System.nanoTime();
        long durationSmallMax = endTimeSmallMax - startTimeSmallMax;
        System.out.println("Время нахождения максимального значения с 10 элементами " + durationSmallMax + " нс");
        System.out.println();

        int[] numbersBigSum = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbersBigSum[i] = i;
        }
        long startTimeBigSum = System.nanoTime();
        Operations.sum(numbersBigSum);
        long endTimeBigSum = System.nanoTime();
        long durationBigSum = endTimeBigSum - startTimeBigSum;
        System.out.println("Время суммирования 1000000 элементов " + durationBigSum + " нс");

        int[] numbersSmallSum = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmallSum[i] = i;
        }
        long startTimeSmallSum = System.nanoTime();
        Operations.sum(numbersSmallSum);
        long endTimeSmallSum= System.nanoTime();
        long durationSmallSum = endTimeSmallSum - startTimeSmallSum;
        System.out.println("Время суммирования 10 элементов " + durationSmallSum + " нс");
        System.out.println();

        int[] numbersBigMult = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbersBigMult[i] = i;
        }
        long startTimeBigMult = System.nanoTime();
        Operations.mult(numbersBigMult);
        long endTimeBigMult = System.nanoTime();
        long durationBigMult = endTimeBigMult - startTimeBigMult;
        System.out.println("Время перемножения 1000000 элементов " + durationBigMult + " нс");

        int[] numbersSmallMult = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmallMult[i] = i;
        }
        long startTimeSmallMult = System.nanoTime();
        Operations.mult(numbersSmallMult);
        long endTimeSmallMult= System.nanoTime();
        long durationSmallMult = endTimeSmallMult - startTimeSmallMult;
        System.out.println("Время перемножения 10 элементов " + durationSmallMult + " нс");
        System.out.println();
    }
}
