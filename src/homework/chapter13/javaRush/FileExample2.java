package homework.chapter13.javaRush;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileExample2 {

    public static void main(String[] args) throws IOException {


        //создание файла
        Path testFile1 = Files.createFile(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt"));
        System.out.println("Был ли файл успешно создан?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt")));

        //создание директории
        Path testDirectory2 = Files.createDirectory(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testDirectory2"));
        System.out.println("Была ли директория успешно создана?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testDirectory2")));



        //копируем файл с рабочего стола в директорию testDirectory2.
        testFile1 = Files.copy(testFile1, Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt"), REPLACE_EXISTING);

        System.out.println("Остался ли наш файл на рабочем столе?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFile111.txt")));

        System.out.println("Был ли наш файл скопирован в testDirectory?");
        System.out.println(Files.exists(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testDirectory2\\testFile111.txt")));

    }
}
