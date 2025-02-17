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
                System.out.println("Файла не существует!");
            } else if (isDirectory) {
                System.out.println("Путь ведёт к директории!");
            } else {
                System.out.println("Путь указан верно");
                countOfRightFilePath++;
                System.out.println("Это файл номер " + countOfRightFilePath);
            }
        }
    }
}
