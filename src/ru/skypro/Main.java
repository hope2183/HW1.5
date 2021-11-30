package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// TASK 1

        int []numbers = new int [3];
        numbers [0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] fractions = {1.57, 7.654, 9.986};

        float[] myVariable = {0.25f, 0.75f, 1.1f};

    // TASK 2
        for (int i = 0; i < numbers.length; i++){
            if (i!= numbers.length-1) {
                System.out.print(numbers[i] + ", ");
            }else
                System.out.print(numbers[i]);

        }
        System.out.println();

            for (int i = 0; i < fractions.length; i++) {
            if (i!= fractions.length-1) {
                System.out.print(fractions[i] + ", ");
            } else
                System.out.print(fractions[i]);
            }
        System.out.println();

        for (int i = 0; i < myVariable.length; i++) {
            if (i!= myVariable.length-1){
                System.out.print(myVariable[i]+", ");
            } else
                System.out.print(myVariable[i]);
        }

        System.out.println();

    // TASK 3

        for (int i = numbers.length-1; i >=0; i--) {
            if (i!=0) {
                System.out.print(numbers[i] + ", ");
            }   else
                System.out.print(numbers[i]);
            }
        System.out.println();

        for (int i = fractions.length-1; i >=0 ; i--) {
            if (i!=0){
                System.out.print(fractions[i]+", ");
            } else
                System.out.print(fractions[i]);
        }
        System.out.println();

        for (int i = myVariable.length-1; i >=0 ; i--) {
            if (i!=0){
                System.out.print(myVariable[i]+", ");
            } else
                System.out.print(myVariable[i]);
        }

        System.out.println();
    //TASK 4

        for (int i = 0; i < numbers.length; i++) {
            if (i!= numbers.length-1&&numbers[i]%2==0) {
                System.out.print(numbers[i] + ", ");
            }else if (i!= numbers.length-1&&numbers[i]%2!=0){
                numbers[i]+=1;
                System.out.print(numbers[i] + ", ");
            }else if (i== numbers.length-1&&numbers[i]%2!=0){
                numbers[i]+=1;
                System.out.print(numbers[i]);
            }else
                System.out.print(numbers[i]);
        }
        System.out.println();

            }

    }


