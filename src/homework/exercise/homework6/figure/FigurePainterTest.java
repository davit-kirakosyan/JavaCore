package homework.exercise.homework6.figure;

public class FigurePainterTest {


    public static void main(String[] args) {
        FigurePainter figurePainter = new FigurePainter();

        figurePainter.figureFirst(5, '.', true);
        figurePainter.figureSecond(5, '*', true);
        figurePainter.figureThird(5, '/', true);
        figurePainter.figureForth(5, '-', true);
        figurePainter.figureFifth(5, '`', true);
        figurePainter.figureSixth(5, '`', true);
        figurePainter.figureSeventh(5, '`', true);
        figurePainter.figureEighth(5, '`', false);

    }
}
