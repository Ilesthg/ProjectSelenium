package Ejercicios;

public class ss {
    public static void main(String[] args) {
//%1X Da el  1 ultimo numero
// %1XX Da los 2 ultimos numeros
// %1XXX Da los ultimos 3 numeros

        //  - /10 Da los numeros excepto el ultimo
        //    /100 Da  los numeros excepto los ultimos 2
             //1000 Da  los numeros excepto los ultimos 3
        //

// /*
        int n =12345;
       int a, i=0,j=0;
       a=n;
        while (a > 0){
        i =a%10;
        j = (j*10) + i;
            a = a/10;
        }
System.out.println("Reverse number is: " + j);
    }
}
