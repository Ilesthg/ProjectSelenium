package Ejercicios;

import java.util.Scanner;

public class Factorial {



    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       // System.out.print("Ingresa numero que quieras factorial");
        int n = 5;

        int factorial =1;
        for (int i = 1; i < n; i++) {
            factorial += factorial * i;
        }
        System.out.println(factorial);


    }

}
