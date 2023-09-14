package Homework;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1: ");
        int a = scanner.nextInt();
        if (a >= 7) {
            System.out.println("Привет !");
        } else {
            System.out.println("Привета нет ");
        }

    }
}
