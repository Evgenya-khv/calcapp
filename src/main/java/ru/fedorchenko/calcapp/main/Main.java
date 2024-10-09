package ru.fedorchenko.calcapp.main;

import ru.fedorchenko.calcapp.service.ResultWriterService;
import ru.fedorchenko.calcapp.util.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число x");
        int num1 = console.nextInt();

        Scanner console2 = new Scanner(System.in);
        System.out.println("Введите число y");
        int num2 = console2.nextInt();

        int res1 = Calculator.add(num1, num2);
        int res2 = Calculator.subtract(num1, num2);
        int res3 = Calculator.multiply(num1, num2);
        String str1 = " :сложение";
        String str2 = " :вычитание";
        String str3 = " :умножение";

        ResultWriterService.printResult("+", num1, num2, res1, str1);
        ResultWriterService.printResult("-", num1, num2, res2, str2);
        ResultWriterService.printResult("*", num1, num2, res3, str3);
    }
}
