package Ejercicios;

public class DuplicatesArray {

    public static void main(String[] args) {

        int input[] = {1, 1, 2, 3,5,5,5,7,8};

        int i = 0;
        int j = 1;

        for (; j < input.length; ) {

            if (input[i] == input[j]) {
                j++;
            } else {
                input[++i] = input[j];
                j += 1;

            }

        }


        int output[] = new int[i + 1];
        for (int k = 0; k < output.length; k++) {
            output[k] = input[k];
        }
        for (int k : output) {
            System.out.println(k);
        }


    }
}
