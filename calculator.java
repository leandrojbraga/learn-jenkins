package com.dlbraga.learning;

import java.util.Scanner;

public class calculator {

    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        Double n1 = 0.0;
        Double n2 = 0.0;
        String op = "";
        Double result = 0.0;
        
        System.out.println("Primeiro número:");
        n1 = reader.nextDouble();
        System.out.println("Segundo número:");
        n2 = reader.nextDouble();
        reader.nextLine();
        System.out.println("Operador (+,-,*,/):");
        op = reader.nextLine();

        switch (op) {
            case "+":
                result = sum(n1, n2);
                break;
            case "-":
                result = sub(n1, n2);
                break;
            case "*":
                result = mult(n1, n2);
                break;
            case "/":
                result = div(n1, n2);
                break;
            default:
                System.err.println("Operador não encontrado!");
        }

        System.out.println("Resultado:" + result);

    }

    public static Double sum(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double sub(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double mult(Double num1, Double num2) {
        return num1 * num2;
    }

    public static Double div(Double num1, Double num2) {
        return num2.equals(0.0) ? 0.0 : (num1 / num2);
    }

}
