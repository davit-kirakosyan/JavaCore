package homework.chapter13.javaRush;

import java.nio.file.Path;
import java.nio.file.Paths;

public class
PathExample3 {

    public static void main(String[] args) {

        Path testFilePatch1 = Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13");
        Path testFilePatch2 = Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\textFile.txt");
        System.out.println(testFilePatch1.relativize(testFilePatch2));
    }
}
