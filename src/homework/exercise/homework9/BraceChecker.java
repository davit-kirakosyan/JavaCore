package homework.exercise.homework9;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        char last;
        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            switch (charAt) {
                case '[':
                case '{':
                case '(':
                    stack.push(charAt);
                    break;
                case ']':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + " index Closed " + charAt + " but not open.");
                    } else if (last != '[') {
                        System.err.println("Error: opened " + last + " but closed " + charAt + " at " + i);
                    }
                    break;
                case '}':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + " index Closed " + charAt + " but not open.");
                    } else if (last != '{') {
                        System.err.println("Error: opened " + last + " but closed " + charAt + " at " + i);
                    }
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last == 0) {
                        System.err.println("Error at " + i + " index Closed " + charAt + " but not open.");
                    } else if (last != '(') {
                        System.err.println("Error: opened " + last + " but closed " + charAt + " at " + i);
                    }
                    break;
                default:
            }
        }
        for (int i = 0; i < (last = (char) stack.pop()); i++) {
            if (i != 0) {
                System.err.println("Error: opened " + last + " but not closed");
            }
        }
    }
}

