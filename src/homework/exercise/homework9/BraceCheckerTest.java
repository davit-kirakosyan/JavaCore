package homework.exercise.homework9;

public class BraceCheckerTest {

    public static void main(String[] args) {

        String text = "H{{{{{{{{{e)l))))))lo fr[[[[[[[[[[o((({{{{{[[[[]]]]]]]]]]]]]m [Java)";

        BraceChecker braceChecker = new BraceChecker(text);

        braceChecker.check();
    }

}
