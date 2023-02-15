package homework.chapter9.defaults;

public interface MyIf {

    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }

    static int getDefaultNumber(){
        return 0;
    }
}
