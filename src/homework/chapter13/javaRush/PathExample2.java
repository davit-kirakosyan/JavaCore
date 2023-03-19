package homework.chapter13.javaRush;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample2 {

    public static void main(String[] args) {

        Path path1 = Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\.\\textFile.txt");
        System.out.println(path1.normalize());

        Path path2 = Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\..\\textFile.txt");
        System.out.println(path2.normalize());
    }
}
