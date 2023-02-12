package homework.chapter9.iface;

public class TestIface2 {

    public static void main(String[] args) {

        Callback callback = new Client();
        callback.callback(42);
        AnotherClient anotherClient = new AnotherClient();

        callback = anotherClient;
        callback.callback(42);
    }
}
