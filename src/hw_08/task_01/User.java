package hw_08.task_01;

public class User {

    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 5) {
            this.password = password;
        } else {
            System.out.println("Error. Your password is to little");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error. Age cannot be negative number");
        }
    }


    public void makePurchase(double purchasePrice) {
        amountSpentMoney = amountSpentMoney + purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("The total amount of money spent is: " + amountSpentMoney);
    }

    public void printData() {
        System.out.println("The name of User is: " + userName +
                "\nUser age: " + getAge() +
                "\nUser email: " + email +
                "\nUser Password: " + getPassword() +
                "\nActive User: " + isActive);
    }
}
