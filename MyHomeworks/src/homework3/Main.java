package TokmakovHW3;

/**
 * Created by Denis on 17.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        //Call static method for encountering odd digits using FOR
        oddSumFor();

        //Call static method for encountering odd digits using WHILE
        oddSumWhile();

        //Call static method for printing 15 elements of Fibonacci row using FOR
        printFibRowFor();

        //Call static method for printing 15 elements of Fibonacci row using WHILE
        printFibRowWhile();

        // Call static method for accounting evens from 10 including 100, except 33, 44, 55, 66, 77, 88 using FOR
        evenSumFor();

        // Call static method for accounting evens from 10 including 100, except 33, 44, 55, 66, 77, 88 using WHILE
        evenSumWhile();
    }

    /*
    1. Вывести на экран сумму нечетных чисел в диапазоне от 13 до 73(включительно)
     */

    //Static method for encountering Odd digits using FOR
    public static void oddSumFor () {
        int sum = 0;
        for (int i = 13; i <= 73; i++){
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Сумма нечетных чисел (используя цикл FOR) в диапазоне от 13 и до 73 включительно равна: " + sum);
    }

    //Static method for encountering Odd digits using WHILE
    public static void oddSumWhile () {
        int sum = 0;
        int i = 13;
        while (i <= 73){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("Сумма нечетных чисел (используя цикл WHILE) в диапазоне от 13 и до 73 включительно равна: " + sum);
    }

    /*
    2. Вывести на экран последовательность Фибоначчи (первые 15 чисел), разделяя каждое значение пробелом.
     */

    //Static method for printing 15 elements of Fibonacci's row using FOR
    public static void printFibRowFor () {
        int a = 1;
        int b = 1;
        int sumFib = 0;

        System.out.println("Первые 15 чисел последовательности Фибоначчи (используя цикл FOR) имеют вид:");
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= 13; i++){
            sumFib = a + b;
            a = b;
            b = sumFib;
            System.out.print(sumFib + " ");
        }
        System.out.println();
    }

    //Static method for printing 15 elements of Fibonacci's row using WHILE
    public static void printFibRowWhile () {
        int i = 1;
        int a = 1;
        int b = 1;
        int sumFib = 0;

        System.out.println("Первые 15 чисел последовательности Фибоначчи (используя цикл WHILE) имеют вид:");
        System.out.print(a + " " + b + " ");
        while (i <= 13) {
            sumFib = a + b;
            a = b;
            b = sumFib;
            System.out.print(sumFib + " ");
            i++;
        }
        System.out.println();
    }

    /*
    3. Посчитать сумму чётных чисел от 10 до 100(включительно), пропустив числа 33, 44, 55, 66, 77, 88.
     */

    // Static method for accounting evens from 10 including 100, except 33, 44, 55, 66, 77, 88 using FOR
    public static void evenSumFor () {
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if ((i % 2 == 0) && ((i != 44) || (i != 66) || (i != 88))) {
                sum = sum + i;
            }
        }
        System.out.println("Сумма чётных чисел (используя цикл FOR) от 10 до 100(включительно), без учета 33, 44, 55, 66, 77, 88 равна: " + sum);
    }

    // Static method for accounting evens from 10 including 100, except 33, 44, 55, 66, 77, 88 using WHILE
    public static void evenSumWhile () {
        int sum = 0;
        int i = 10;
        while (i <= 100) {
            if ((i % 2 == 0) && ((i != 44) || (i != 66) || (i != 88))) {
                sum = sum + i;
                i = i + 2;
            }
        }
        System.out.println("Сумма чётных чисел (используя цикл WHILE) от 10 до 100(включительно), без учета 33, 44, 55, 66, 77, 88 равна: " + sum);
    }
}
