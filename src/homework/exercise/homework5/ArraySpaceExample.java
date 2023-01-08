package homework.exercise.homework5;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ','a'};

        int begin = 0;
        int end = spaceArray.length - 1;
        while (begin < end && spaceArray[begin] == ' ') {
            begin++;
        }
        while (begin < end && spaceArray[end] == ' ') {
            end--;
        }
        char[] result = new char[(end - begin) + 1];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            result[index++] = spaceArray[i];
        }
        for (char c : result) {
            System.out.print(c);
        }
        System.out.println();
    }
}
