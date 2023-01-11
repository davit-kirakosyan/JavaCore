package homework.exercise.homework6.figure;

public class FigurePainter {


    public void figureFirst(int n, char c, boolean isNewLine) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }

    public void figureSecond(int n, char c, boolean isNewLine) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }

    public void figureThird(int n, char c, boolean isNewLine) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }

    public void figureForth(int n, char c, boolean isNewLine) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }

    public void figureFifth(int n, char c, boolean isNewLine) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }

    public void figureSixth(int n, char c, boolean isNewLine) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }


    public void figureSeventh(int n, char c, boolean isNewLine) {
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i * 2; j >= 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }


    public void figureEighth(int n, char c, boolean isNewLine) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i * 2; j >= 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }
}
