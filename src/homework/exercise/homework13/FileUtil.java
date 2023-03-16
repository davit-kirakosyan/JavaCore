package homework.exercise.homework13;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
//    private static File file = new File("D:\\java2023\\JavaCore\\src\\homework\\exercise\\homework13\\newFile");
    ;

    public static void main(String[] args) {
//        fileSearch();
//        contentSearch();
//        printSizeOfPackage();
//        findLines();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        boolean result = false;
        System.out.println("please input path name");
        String pathName = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        File file = new File(pathName);
        if (!file.exists() || file.isFile()) {
            result = false;
        }
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            result = false;
        }
        for (File last : files) {
            if (last.getName().equals(fileName)) {
                result = true;
            }
        }
        System.out.println(result);
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please input path name");
        String pathName = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(pathName);
        if (!file.exists() || file.isFile()) {
            System.out.println("Directory is not exists!");
        } else {
            File[] files = file.listFiles();
            for (File last : files) {
                if (last.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(last))) {
                        String line = "";
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(String.format("file name: %s", last.getName()));
                            }
                        }
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please input path name");
        String pathName = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(pathName);
        if (file.isFile()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
                bufferedWriter.write(keyword);
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input path name");
        String pathName = scanner.nextLine();
        File file = new File(pathName);

        if (!file.exists() || file.isDirectory()) {
            int sum = 0;
            for (File listFile : file.listFiles()) {
                sum += listFile.length();
            }

            System.out.println(sum);
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("please input path name");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        File file = new File(path,fileName);
            try {
                if (file.createNewFile()){
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(content);
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }
    }

