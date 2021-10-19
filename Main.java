package ru.vsu.cs.okshina_v_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int width = readWidth();

        correctnessSize(width);
        printImage(width);
    }

    private static int readWidth(){
        System.out.println("Введите ширину изображения");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value <= 0){
            System.out.println("Данные не корректны, введенное значение меньше 0, построение изображения невозможно");
            System.exit(0);
        }

        return value;
    }

    private static void correctnessSize(int width){
        if ((width<3) || (width % 2 == 0)){
            System.out.println("Данные не корректны, введнное значение меньше 3 или является четным числом, построение изображения невозможно");
            System.exit(0);

        }
    }

    private static void printImage(int width){
        for (int i = 1;i <= width;i++){
            System.out.print("*");
        }

        System.out.println();

        for (int j = width;j >= 2;j -= 2){
            for (int k = j/2;k >= 1;k--){
                System.out.print("*");
            }

            for (int s = width-j/2 - j/2;s >= 1;s--){
                System.out.print(" ");
            }

            for (int k = j/2;k >= 1;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
