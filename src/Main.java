import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("������� ������ �����: ");
        int first_number = new Scanner(System.in).nextInt();
        System.out.println("������� ������ �����: ");
        int second_number = new Scanner(System.in).nextInt();
        int sum = first_number + second_number;
        int difference = first_number - second_number;
        int multiplication = first_number * second_number;
        double division = (double) first_number / second_number;
        System.out.println("�����: " + sum);
        System.out.println("��������: " + difference);
        System.out.println("������������: " + multiplication);
        System.out.println("�������: " + division);
    }
}
