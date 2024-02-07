package hw_10.task_01;

public class MobilePhone implements Mobile {
    public String brand;

     public MobilePhone(String brand) {
        this.brand = brand;
    }

    public MobilePhone() {
    }

    public String getBrand() {
        return brand;
    }

    public void call(String number) {
        System.out.println("Calling " + number + " from " + brand);
    }

    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + " from " + brand + ": " + message);
    }

    void browseInternet() {

    }
}
