import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean fileExists;
        boolean isDirectory;
        int countOfRightFilePath = 0;
        while(true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            fileExists = file.exists();
            isDirectory = file.isDirectory();
            if (!fileExists) {
                System.out.println("����� �� ����������!");
            } else if (isDirectory) {
                System.out.println("���� ���� � ����������!");
            } else {
                System.out.println("���� ������ �����");
                countOfRightFilePath++;
                System.out.println("��� ���� ����� " + countOfRightFilePath);
            }
        }
    }
}
