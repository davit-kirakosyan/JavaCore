package homework.exercise.repetition.braceChecker;

public class BraceChecker {

    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        char list;
        char charAt;
        for (int i = 0; i < text.length(); i++) {
            charAt = text.charAt(i);
            if (charAt == '(' || charAt == '{' || charAt == '[') {
                stack.push(charAt);
            } else if (charAt == ')') {
                list = (char) stack.pop();
                if (list == 0) {
                    System.err.println("Error at " + i + " index Closed " + charAt + " but not open.");
                } else if (list != '(') {
                    System.err.println("Error: opened " + list + " but closed " + charAt + " at " + i);
                }
            } else if (charAt == '}') {
                list = (char) stack.pop();
                if (list == 0) {
                    System.err.println("Error at " + i + " index Closed " + charAt + " but not open.");
                } else if (list != '{') {
                    System.err.println("Error: opened " + list + " but closed " + charAt + " at " + i);
                }
            } else if (charAt == ']') {
                list = (char) stack.pop();
                if (list == 0) {
                    System.err.println("Error at " + i + " index Closed " + charAt + " but not open.");
                } else if (list != '[') {
                    System.err.println("Error: opened " + list + " but closed " + charAt + " at " + i);
                }
            }
        }
        while ((list = (char) stack.pop()) != 0) {
            System.err.println("Error: opened " + list + " but not closed");
        }
    }
}
