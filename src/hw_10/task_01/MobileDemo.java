package hw_10.task_01;

public class MobileDemo {

    public static void main(String[] args) {
        Model phone = new Model("Samsung", "Galaxy S21");
        phone.call("123456789");
        phone.sendMessage("123456789", "Hello!");
        phone.browseInternet();
    }
}