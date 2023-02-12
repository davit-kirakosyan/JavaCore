package homework.chapter9.iface;

public class TestIface {

    public static void main(String[] args) {

        Callback callback = new Client();
        callback.callback(42);
    }
}
