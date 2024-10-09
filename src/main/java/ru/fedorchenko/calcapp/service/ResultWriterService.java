package ru.fedorchenko.calcapp.service;

public class ResultWriterService {
    public static void printResult(String operation, int num1, int num2, int result, String name) {
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result + name);
    }
}