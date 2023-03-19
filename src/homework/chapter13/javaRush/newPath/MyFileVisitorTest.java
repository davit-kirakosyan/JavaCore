package homework.chapter13.javaRush.newPath;

import homework.chapter13.javaRush.MyFileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyFileVisitorTest {

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\testFolder"),
                new MyFileVisitor());
    }
}