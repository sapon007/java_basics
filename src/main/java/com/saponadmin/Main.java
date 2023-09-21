package com.saponadmin;

public class Main {

    public static void main(String[] args) {

        System.out.println("*******************");
        System.out.println("Целочисленные типы");
        System.out.println("*******************");
        byte aByte = 100;
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Максимальное значение для типа short: " + maxShort);
        System.out.println("Минимальное значение для типа short: " + minShort);
        int aInt = 100;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Максимальное значение для типа int: " + maxInt);
        long maxLong = Long.MAX_VALUE;
        System.out.println("Максимальное значение для типа long: " + maxLong);

        byte resByte = (byte) (aByte + 28);
        System.out.println("-------------------");
        System.out.println("Переполнение в byte: " + aByte + " + 28 = " + resByte); // Выводит -128
        System.out.println("-------------------");
        int resInt = aInt * 100;
        System.out.println(aInt + " * 100 = " + resInt);

        System.out.println("*******************");
        System.out.println("Числа с плавающей точкой");
        System.out.println("*******************");
        float aFloat = 3.141592653589f;
        float maxFloat = Float.MAX_VALUE;
        double aDouble = 3.141592653589;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Число ПИ float: " + aFloat);
        System.out.println("Число ПИ double: " + aDouble);
        System.out.println("Максиммальное значение для типа float: " + maxFloat);
        System.out.println("Максиммальное значение для типа double: " + maxDouble);
        float a = 2.5f;
        float b = 2.0f;
        float res = a * b;
        System.out.println(a + " * " + b + " = " + res);

        System.out.println("*******************");
        System.out.println("Вычисления с различными типами данных");
        System.out.println("*******************");
        int x = 100;
        double y = 3.14;
        System.out.println("100 * 3.14 = " + x * y);
        double resXY = x * y;
        System.out.println(resXY);

    }

}
