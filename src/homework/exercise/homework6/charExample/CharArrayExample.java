package homework.exercise.homework6.charExample;

public class CharArrayExample {

    public void countSinvel(char[] chars, char c) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(c + " count of: " + count);
    }

    public void printMidOfArray(char[] chars) {
        System.out.print(chars[(chars.length / 2) - 1]);
        System.out.println(chars[chars.length / 2]);
    }

    public void printArrayLastToLByY(char[] chars) {
        boolean result = false;
        if (chars[chars.length - 2] == 'l' &&
                chars[chars.length - 1] == 'y') {
            result = true;
        }
        System.out.println(result);
    }
//            4) Ունենք հետևյալ մասիվը՝
//    char[] text = {' ',' ','b','a','r','e','v',' ',' '};
//    պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.

    public void printArrayIsNotSpace(char[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }

    public void beginEndIndexOfArray(char[] array) {
        int beginIndex = 0;
        int endIndex = array.length - 1;
        while (beginIndex < endIndex && array[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && array[endIndex] == ' ') {
            endIndex--;
        }

        char[] text = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i <= endIndex; i++) {
            text[index++] = array[i];
        }
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }
    }
}
