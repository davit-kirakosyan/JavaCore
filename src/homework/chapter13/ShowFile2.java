package homework.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {

    public static void main(String[] args) {

        int i;
        FileInputStream fin =null;

        if (args.length != 1){
            System.out.println("Использование: ShowFile test.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1){
                    System.out.print((char) i);
                }
            }while (i != -1);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        }catch (IOException e){
            System.out.println("Пpoизoшлa ошибка ввода-вывода");
        }finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            }catch (IOException e){
                System.out.println("Oшибкa чтения из файла");
            }
        }


    }
}
