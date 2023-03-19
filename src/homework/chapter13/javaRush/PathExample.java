package homework.chapter13.javaRush;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) {

        Path testFilePatch = Paths.get("D:\\java2023\\JavaCore\\src\\homework\\chapter13\\javaRush\\newPath\\textFile.txt");
//        System.out.println(testFilePatch.getFileName());
//        System.out.println(testFilePatch.getParent());
//        System.out.println(testFilePatch.getRoot());
//        System.out.println(testFilePatch.endsWith("newPath\\textFile.txt"));
//        System.out.println(testFilePatch.endsWith("estFile.txt"));
//        System.out.println(testFilePatch.startsWith("D:\\java2023"));
        System.out.println(testFilePatch.isAbsolute());
    }
}
