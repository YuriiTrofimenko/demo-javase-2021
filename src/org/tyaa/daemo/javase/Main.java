/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.daemo.javase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author yurii
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        // primitive types (value types)
        /* byte b1 = 127; // -128
        short sh1 = 128;
        int x = 10;
        long l1 = 1000000000000000000L; */
        // long l1 = 1000000000000000000;
        /* float f1 = 1.0f;
        double d1 = 9999.99d;
        
        boolean boo1 = true;
        char ch1 = 'A'; */
 /*for (int i = 0; i < 26; i++) {
            System.out.printf("%s ", ch1++);
        }
        ch1 = 'А';
        for (int i = 0; i < 32; i++) {
            System.out.printf("%s ", ch1++);
        }*/
        // reference types
        // Integer i2 = 10;
        // Double d2 = i2.doubleValue();
        /* String s1 = "Hello Java!";
        String s2 = "Hello Java!"; */
 /* String s1 = "Hello Java!";
        String s2 = s1; */
 /* String s1 = new String("Hello Java!");
        String s2 = new String("Hello Java!");
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        // String s2 = new String("Hello Java!"); */
 /*Scanner sc = new Scanner(System.in);
        System.out.println(">");
        String data = sc.nextLine();
        System.err.println(data);*/
        // sc.close();
        /*sc = new Scanner(System.in);
        System.out.println(">");
        data = sc.nextLine();
        System.err.println(data);*/
        // приведение типов (cast)
        /* int i1 = 100;
        double d1 = i1; // присвоение с неявным приведением типа
        d1 = 99.99;
        i1 = (int) d1; // ... с явным
        
        Integer i2 = 200;
        Double d2 = i2.doubleValue();
        
        // приведение типов ссылок
        Object o1 = i2;
        // привести ссылку к типу Integer,
        // с ее помощью вызвать метод .doubleValue()
        // и так конвертировать Integer в Double
        System.out.println(((Integer) o1).doubleValue());
        
        System.out.println(112 % 10); // 110 and 2 -> 11.0 and 2
        System.out.println(112 % 100);
        System.out.println(7 % 2); */
        // 1 товар
        // 2 товара
        // 5 товаров
        /* switch (lastNumber) {
            case 0: {
                resultWord = "товаров";
                break;
            }
            case 2: {
                resultWord = "товара";
                break;
            }
            case 3: {
                resultWord = "товара";
                break;
            }
            case 4: {
                resultWord = "товара";
                break;
            }
            case 5: {
                resultWord = "товаров";
                break;
            }
            case 6: {
                resultWord = "товаров";
                break;
            }
            case 7: {
                resultWord = "товаров";
                break;
            }
            case 8: {
                resultWord = "товаров";
                break;
            }
            case 9: {
                resultWord = "товаров";
                break;
            }
            // default: {
                // ...
            // }
        } */
 /* System.out.println("Введите целое положительное число ");
        Scanner sc = new Scanner(System.in);
        Integer userInputInteger = sc.nextInt();
        Integer lastNumber = userInputInteger % 10;
        Integer lastTwoNumbers = userInputInteger % 100;
        String resultWord = "товаров";
        // не исключение?
        if (!(lastTwoNumbers >= 11 && lastTwoNumbers <= 14)) {
            // тогда выбираем, как изменить слово
            switch (lastNumber) {
                case 2:
                case 3:
                case 4: {
                    resultWord = "товара";
                    break;
                }
                case 1: {
                    resultWord = "товар";
                    break;
                }
            }
        }
        // иначе - оставляем с окончанием ов
        System.out.printf("В корзине %d %s", userInputInteger, resultWord); */
 /* String shouldContinueString = "";
        do {
            System.out.println("Введите целое положительное число ");
            Scanner sc = new Scanner(System.in);
            Integer userInputInteger = sc.nextInt();
            Integer lastNumber = userInputInteger % 10;
            Integer lastTwoNumbers = userInputInteger % 100;
            String resultWord = "товаров";
            // не исключение?
            if (!(lastTwoNumbers >= 11 && lastTwoNumbers <= 14)) {
                // тогда выбираем, как изменить слово
                switch (lastNumber) {
                    case 2:
                    case 3:
                    case 4: {
                        resultWord = "товара";
                        break;
                    }
                    case 1: {
                        resultWord = "товар";
                        break;
                    }
                }
            }
            // иначе - оставляем с окончанием ов
            System.out.printf("В корзине %d %s\n", userInputInteger, resultWord);
            System.out.println("Продолжить? (д/н)");
            shouldContinueString = sc.next();
        } while (shouldContinueString.equals("д")); */
 /* String shouldContinueString = "";
        do {
            System.out.println("Введите целое положительное число ");
            Scanner sc = new Scanner(System.in);
            Integer userInputInteger = sc.nextInt();
            Integer lastNumber = userInputInteger % 10;
            Integer lastTwoNumbers = userInputInteger % 100;
            String resultWord = "товаров";
            // не исключение?
            if (!(lastTwoNumbers >= 11 && lastTwoNumbers <= 14)) {
                // тогда выбираем, как изменить слово
                switch (lastNumber) {
                    case 2:
                    case 3:
                    case 4: {
                        resultWord = "товара";
                        break;
                    }
                    case 1: {
                        resultWord = "товар";
                        break;
                    }
                }
            }
            // иначе - оставляем с окончанием ов
            System.out.printf("В корзине %d %s\n", userInputInteger, resultWord);
            do {                
                System.out.println("Продолжить? (д/н)");
                shouldContinueString = sc.next();
            } while (!(shouldContinueString.equals("д") || shouldContinueString.equals("н")));
        } while (shouldContinueString.equals("д")); */
 /* for (int i = 0; i < 10; i++) {
            System.out.println("Row #" + i);
            for (int j = 0; j < 10; j++) {
                System.out.print("Col #" + j + " ");
                if (i == 4 && j == 5) {
                    break;
                }
            }
            System.out.println();
        } */
 /* MAIN_LOOP : for (int i = 0; i < 10; i++) {
            System.out.println("Row #" + i);
            for (int j = 0; j < 10; j++) {
                if (i == 4 && j == 5) {
                    // break MAIN_LOOP;
                    // continue MAIN_LOOP;
                    continue;
                }
                System.out.print("Col #" + j + " ");
            }
            System.out.println();
        } */
        // Task
        // Вывести предложение пользователю выбрать один из пунктов меню:
        // 1. сложение
        // 2. вычитание
        // 3. умножение
        // 4. деление,
        // указав одно из чисел: 1, 2, 3, 4
        // вывести результат расчета с числами 2 и 3,
        // например, 2 + 3, в зависимости от выбора номера действия пользователем
        // * добавить ввод пользователем чисел для расчета, например, a и b
        
        BufferedReader we = new BufferedReader(new InputStreamReader(System.in));
            double a = 0;
            boolean correctAValueFetched = false;
            do {
                try {
                    System.out.print("Введи переменную а ");
                    a = Double.parseDouble(we.readLine());
                    correctAValueFetched = true;
                 } catch (NumberFormatException e) {
                     
                 }
            } while (!correctAValueFetched);
        
            // по примеру с переменной a сделать бесконечный опрос пользователя,
            // пока он не введет правильные значения b и userInputInteger
            System.out.print("Введи переменную б ");
            double b = Double.parseDouble(we.readLine());
            
            Scanner sc = new Scanner(System.in);
            Integer userInputInteger = null;
            boolean correctUserInputIntegerValueFetched = false;
            do {
                try {
                    System.out.println("ВВедите цифру от 1 до 4: ");
                    userInputInteger = Integer.parseInt(sc.nextLine());
                    if (userInputInteger >= 1 && userInputInteger <= 4) {
                        correctUserInputIntegerValueFetched = true;
                    }
                 } catch (NumberFormatException e) {
                     
                 }
            } while (!correctUserInputIntegerValueFetched);

            switch (userInputInteger) {
                case 1: {
                    System.out.println(a + b);
                    break;

                }
                case 2: {
                    System.out.println(a * b);
                    break;
                }
                case 3: {
                    System.out.println(a - b);
                    break;
                }
                case 4: {
                    System.out.println(a / b);
                    break;
                }
            }
        
            // Генерация целых чисел из заданого интервала
            /* int a = 10;
            int b = 20;
            int size = b - a + 1;
            int[] integers = new int[size]; // создали массив с индексами от 0 до 9
            
            integers[0] = 10;
            integers[2] = 10; // в массиве integers найти позицию под индексом 2
            integers[3] = 101; */
            // и записать в нее значение 10
            
            // System.out.println(integers[2]);
            // System.out.println(integers[0]);
            
            /* for (int j = 0; j < integers.length; j++) {
                int integer = integers[j];
                // когда значение в текущей позиции равно 100
                // и в следующей позиции 101
                if (integer == 10 && integers[j + 1] == 101) {
                    // пропускает текущий шаг,
                    // не доходим до строки распечатки текущего значения
                    continue;
                    // если текущий элемент - не первый,
                    // и предыдущий 101,
                    // то прекращаем работу всего цикла
                // } else if (j - 1 > -1 && integers[j - 1] == 101) {
                } else if (j > 0 && integers[j - 1] == 101) {
                    break;
                }
                System.out.println(integer);
            } */
            
            // перебрать по очереди все элементы цикла
            /* for (int currentInt : integers) {
                System.err.println(currentInt);
            } */
            
            /* int counter = 0; 
            for (int i = a; i <= b; i++) {
                // System.out.println(i);
                integers[counter] = i;
                counter++;
            }
            System.out.println("...");
            for (int currentInt : integers) {
                System.err.println(currentInt);
            } */
        }

}
