/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.daemo.javase;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        
        /* if (args.length == 2) {
            String aString = args[0];
            String bString = args[1];
            if (aString.matches("^[0-9]{1,}$") && bString.matches("^[0-9]{1,}$")) {
                System.out.println(Integer.valueOf(aString) + Integer.valueOf(bString));
            } else {
                System.out.println("Wrong input: must be two numbers!");
            }
        } */

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
        
        /* BufferedReader we = new BufferedReader(new InputStreamReader(System.in));
            double a = 0;
            boolean correctAValueFetched = false;
            do {
                try {
                    System.out.print("Введи переменную а ");
                    a = Double.parseDouble(we.readLine());
                    correctAValueFetched = true;
                 } catch (NumberFormatException e) {
                     
                 }
            } while (!correctAValueFetched); */
        
            // по примеру с переменной a сделать бесконечный опрос пользователя,
            // пока он не введет правильные значения b и userInputInteger
            /* System.out.print("Введи переменную б ");
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
            } */
        
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
            
            
            /* 2D Arrays */
            
            /*
            
            1 0
            0 1
            
            */
            
            /* // создание массива с двумя вложенными массивами с данными внутри
            int[][] tableArray1 = {{1, 0}, {0, 1}};
            // перебор ссылок на все подмассивы
            for(int[] rowArray : tableArray1) {
                // получаем очередной подмассив
                // перебор всех значений текущего подмассива
                for(int value : rowArray) {
                    // вывод текущего значения без перхода на следующую строку
                    System.out.print(value + " ");
                }
                // когда все значения текущего подмассива выведены в одну строку -
                // переходим на следующую
                System.out.println();
            } */
            
            
            // String placeholder = "\t";
            // String placeholder = "     ";
            // i - номера строк
            /* for (int i = 0; i < 11; i++) {
                // j - номера колонок (ячеек в строке)
                for (int j = 0; j < 11; j++) {
                    // если номер строки - первый (индекс = 0) -
                    // выводим номер колонки (ячейки)
                    if (i == 0) {
                        // System.out.print(j + placeholder);
                        System.out.printf("%4d", j);
                    } else if (j == 0) {
                        // System.out.print(i + placeholder);
                        System.out.printf("%4d", i);
                    } else {
                        // System.out.print((i * j) + placeholder);
                        System.out.printf("%4d", i * j);
                    }
                }
                // когда вложенным циклом завершен вывод одной строки -
                // // переходим на следующую
                System.out.println();
            } */
            
            // Table v2
            // создание пустого корневого массива для заполнения ссылками
            // на подмассивы строк (в этот момент их еще нет!)
            /* int[][] tableArray2 = new int[11][];
            for (int i = 0; i < 11; i++) {
                // j - номера колонок (ячеек в строке)
                // создание одного пустого подмассива для заполнения данными текущей строки
                // и сохранение ссылки на него в текущую ячейку (под текущим индексом i)
                // ссылки на новый подмассив
                int[] rowArray = new int[11]; // в текущей строке - 11 ячеек
                tableArray2[i] = rowArray;
                for (int j = 0; j < 11; j++) {
                    // если номер строки - первый (индекс = 0) -
                    // выводим номер колонки (ячейки)
                    if (i == 0) {
                        rowArray[j] = j;
                    } else if (j == 0) {
                        rowArray[j] = i;
                    } else {
                        rowArray[j] = i * j;
                    }
                }
            }
            
            // вывод в консоль всего содержимого массива массивов для проверки
            // for-each
            for(int[] rowArray : tableArray2) {
                // получаем очередной подмассив
                // перебор всех значений текущего подмассива
                for(int value : rowArray) {
                    // вывод текущего значения без перхода на следующую строку
                    System.out.printf("%4d", value);
                }
                // когда все значения текущего подмассива выведены в одну строку -
                // переходим на следующую
                System.out.println();
            } */
            
            // используя двумерный массив значений типа char,
            // заполните его результатами игры в крестики-нолики с
            // размерностью 3 на 3:
            // XOX
            // 0XX
            // O O
            // и выведете в консоль вложенными циклами for-each (for)
            
            
            /* Bubble Sort */
            
            /* Integer[] integers = {1, 3, -5, 0, 200};
            // признак: упорядоченный ли массив?
            // считаем, что нет
            Boolean isOrdered = false;
            // минимум один раз начинаем проверку на упорядоенность
            do {
                // предполагаем, что упорядочен, и переставлять нечего
                isOrdered = true;
                // проверяем, так ли это,
                // проходя от начала до конца по массиву
                for (int i = 0; i < integers.length - 1; i++) {
                    // если текущий элемент меньше следующего -
                    if (integers[i] < integers[i + 1]) {
                        // переставляем местами элементы -
                        // текущий и следующий
                        Integer temporaryInteger = integers[i + 1];
                        integers[i + 1] = integers[i];
                        integers[i] = temporaryInteger;
                        // заключаем, что массив был еще не упорядочен,
                        // а значит, и после данных перестановок может
                        // остаться неупорядоченным,
                        // и требует следующей проверки
                        isOrdered = false;
                    }
                }
            } while (!isOrdered); // если хотя бы один раз при проходе массива
            // из начала в конец пришлось переставить местами  два элемента -
            // требуется новая проверка - упорядочен ли он теперь
        
            
            for (int i = 0; i < integers.length; i++) {
                System.out.println(integers[i]);
            } */
            
            /* String s1 = "ABC";
            String s2 = "XYZ";
            // s1 is less than s2
            System.out.println(s1.compareTo(s2) > 0); // if false - s1 is not greather than s2 */
            
            // strings[i].compareTo(strings[i] + 1) > 0
            
            // Задача
            // скопировать и изменить алгоритм сортировки так,
            // чтобы на входе у него был массив строк,
            // а на выходе - тот же массив, но с упорядоченными строками
            // (по алфавиту или обратно)
            
            /* String s = "Hello Java Strings!";
            System.out.println(s.length()); */

            /* Text Files */

            /* Scanner scanner = new Scanner(System.in);
            System.out.println("Input file name then press Enter");
            System.out.println(">");
            String fileNameString = scanner.nextLine();
            File file = new File(fileNameString + ".txt");
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.append("Hello ");
                fileWriter.append("Java");
                fileWriter.append("!");
            }
            System.out.println("Result:");
            try (BufferedReader bufferedReader =
                         new BufferedReader(new FileReader(file))) {
                bufferedReader.lines().forEach(System.out::println);
            } */

            /* Bin Files */
            //final byte INT_RATIO = 4;
            //final byte SHORT_RATIO = 2;
            // final String FILE_NAME = "data.bin";
            //final String FILE_NAME = "10f";

            /* int[] values = {100500, 0, 500};
            try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("data.bin"))) {
                for (int i = 0; i < values.length; i++) {
                    System.out.println(values[i]);
                    outputStream.writeInt(values[i]);
                }
            } */
            // System.out.println("Result:");
            /* try (DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_NAME))) {
                final int availableBytes = inputStream.available();
                for (int i = 0; i < availableBytes / INT_RATIO; i++) {
                    System.out.println(inputStream.readInt());
                }
            } */

        /* try (DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_NAME))) {
            final int availableBytes = inputStream.available();
            // System.out.println("***");
            // System.out.println("***");
            for (int i = 0; i < availableBytes / SHORT_RATIO; i++) {
                System.out.println(inputStream.readShort());
            }
        } */
        
        /* final int[] paramsArray = new int[66];
        getParamsJ(FILE_NAME, paramsArray);
        for (int i = 0; i < paramsArray.length; i++) {
            System.out.println(paramsArray[i]);
        } */
        
        // String[] chars = {"XYZ", "ABC", "EFG"};
        /* String[] strings = {"USA", "Poland", "Ukraine", "GB"};
        // признак: упорядоченный ли массив?
        // считаем, что нет
        Boolean isOrdered = false;
        // минимум один раз начинаем проверку на упорядоенность
        do {
            // предполагаем, что упорядочен, и переставлять нечего
            isOrdered = true;
            // проверяем, так ли это,
            // проходя от начала до конца по массиву
            for (int i = 0; i < strings.length - 1; i++) {
                // если текущий элемент меньше следующего -
                if (strings[i].compareTo(strings[i + 1]) < 0) {
                    // переставляем местами элементы -
                    // текущий и следующий
                    String temporaryString = strings[i + 1];
                    strings[i + 1] = strings[i];
                    strings[i] = temporaryString;
                    // заключаем, что массив был еще не упорядочен,
                    // а значит, и после данных перестановок может
                    // остаться неупорядоченным,
                    // и требует следующей проверки
                    isOrdered = false;
                }
            }
        } while (!isOrdered); // если хотя бы один раз при проходе массива
        // из начала в конец пришлось переставить местами  два элемента -
        // требуется новая проверка - упорядочен ли он теперь


        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        } */
        
        /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
        } */
        /* for (int i = 0; i < 10;) {
            System.out.println(i);
        } */
        /* for (int i = 0;;) {
            System.out.println(i);
        } */
        /* int i = 0;
        for (;i < 10;) {
            System.out.println(i);
            i += 2;
        } */
        /* int i = 0;
        for (;;) {
            System.out.println(i);
            i += 2;
            if (i == 10) {
                break;
            }
        } */
        /* int i = 0;
        for (;;) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
            if (i == 10) {
                break;
            }
        } */
        
        /* int i = 0;
        MAIN_FOR : for (int j = 0; j < 3; j++) {
            for (;;) {
                //if (i % 2 != 0) {
                //    System.out.println(i);
                //}
                // если во вложенном цикле номер шага == 10
                if (i == 10) {
                    // выход из вложенного цикла
                    break;
                }
                // если во внешнем цикле номер шага == 1, при этом
                // во вложенном цикле номер шага == 5
                if (j == 1 && i == 5) {
                    // break;
                    // break MAIN_FOR;
                    // завершаем работу программы
                    System.exit(0);
                }
                // иначе - если номер вложенного цикла - четное число -
                if (i % 2 == 0) {
                    // увеличиваем номер шага вложенного цикла на 1
                    i++;
                    // пропускаем шаг, переходим на начало вложенного цикла
                    // для выполнения следующего шага
                    continue;
                }
                System.out.println(i);
                i++;
            }
            // после выполнения вложенного цикла каждый раз сбрасывать
            // счетчик его шагов в 0
            i = 0;
            System.out.println("***");
        } */
        
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Введите значение а: ");
        Integer a = null;
        Integer b = null;
        try {
            a = new Scanner(System.in).nextInt();
            b = Integer.valueOf(args[2]);
        } catch (InputMismatchException ex) {
            System.err.println("a - не целое число");
        }  catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("не передан третий параметр при запуске программы");
        } catch (NumberFormatException ex) {
            System.err.println("b - не целое число");
        } catch (Exception ex) {
            System.err.println("неизвестная ошибка");
        }
        if (a != null && b != null && a > b) {
            // Integer limit = a - b;
            for (Integer i = b; i <= a; i++) {
                if (integers.size() > 150) {
                    break;
                }
                integers.add(i);
            }
            System.out.println("Результат: ");
            System.out.println("l = " + String.valueOf(a).length());
            for (int i = 0; i < integers.size(); i++) {
                System.out.printf("%" + (String.valueOf(a).length() + 1) + "d", integers.get(i));
                // System.out.println("debug: " + i + " -> " + i % 15);
                if (i != 0 && (i + 1) % 15 == 0) {
                    System.out.println();
                }
            }
        }
        
        // System.out.println("The End.");
    }

    private static void getParamsJ(String filePathString, int[] paramsArray) {
        try (@SuppressWarnings("resource") FileChannel channel
                     = new FileInputStream(filePathString + ".prm").getChannel()) {
            int i_channels = 0;
            ByteBuffer buffer =
                    ByteBuffer.allocate(128 * 1024)
                            .order(ByteOrder.nativeOrder());
            while (channel.read(buffer) > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    paramsArray[i_channels] = buffer.getShort();
                    i_channels++;
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
