package homework.exercise.homework6.charExample;

public class CharArrayExampleTest {

    public static void main(String[] args) {

        CharArrayExample example = new CharArrayExample();
        char[] chars = {'j','a','v','a','l','o','l', 'y'};
        example.countSinvel(chars,'a');
        example.printMidOfArray(chars);
        example.printArrayLastToLByY(chars);
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        example.printArrayIsNotSpace(text);
        System.out.println();
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        example.beginEndIndexOfArray(spaceArray);
    }
}
