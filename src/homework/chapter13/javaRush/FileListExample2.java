package homework.chapter13.javaRush;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileListExample2 {

    public static void main(String[] args) throws IOException {

        List<String> lists = Files.readAllLines(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\pushkin.txt"), StandardCharsets.UTF_8);

        List<String> result = new ArrayList<>();

        for (String list : lists) {
            if (list.startsWith("Как")){
                String s = list.toUpperCase();
                result.add(s);
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
