package homework.chapter13.javaRush;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileListExample {

    public static void main(String[] args) throws IOException {

        List<String> lists = Files.readAllLines(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\pushkin.txt"), StandardCharsets.UTF_8);

        for (String list : lists) {
            System.out.println(list);
        }
    }
}
