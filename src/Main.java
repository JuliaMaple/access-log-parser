import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int first_number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int second_number = new Scanner(System.in).nextInt();
        int sum = first_number + second_number;
        int difference = first_number - second_number;
        int multiplication = first_number * second_number;
        double division = (double) first_number / second_number;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + multiplication);
        System.out.println("Частное: " + division);
    }
}
