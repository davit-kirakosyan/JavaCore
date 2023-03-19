package homework.chapter13.javaRush;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
public class FileExample {

    public static void main(String[] args) throws IOException {


        //создание файла
        Path testFile1 = Files.createFile(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt"));
        System.out.println("Был ли файл успешно создан?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt")));

        //создание директории
        Path testDirectory = Files.createDirectory(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testDirectory"));
        System.out.println("Была ли директория успешно создана?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testDirectory")));

        //перемещаем файл с рабочего стола в директорию testDirectory. Перемещать надо с указанием имени файла в папке!
        testFile1 = Files.move(testFile1, Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testDirectory\\testFile111.txt"), REPLACE_EXISTING);

        System.out.println("Остался ли наш файл на рабочем столе?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt")));

        System.out.println("Был ли наш файл перемещен в testDirectory?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt")));


        //удаление файла
        Files.delete(testFile1);
        System.out.println("Файл все еще существует?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt")));

    }
}
