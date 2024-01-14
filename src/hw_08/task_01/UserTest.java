package hw_08.task_01;

import hw_08.task_01.User;

public class UserTest {

        public static void main(String[] args) {

            User firstUser = new User();
            firstUser.userName = "Tom";
            firstUser.setAge(25);
            firstUser.email = "test@test.com";
            firstUser.setPassword("qwerty");
            firstUser.isActive = true;
            firstUser.makePurchase(100);
            firstUser.makePurchase(350);


            User secondUser = new User();
            secondUser.userName = "Tom";
            secondUser.setAge(25);
            secondUser.email = "demo@demo.com";
            secondUser.setPassword("qwerty");
            secondUser.isActive = true;
            secondUser.makePurchase(150);
            secondUser.makePurchase(250);

            User thirdUser = new User("Rex");
            thirdUser.setAge(45);
            thirdUser.email = "email@email.com";
            thirdUser.setPassword("string");
            thirdUser.isActive = false;
            thirdUser.makePurchase(50);
            thirdUser.makePurchase(550);

            User nextUser = new User("Bob", "password");
            nextUser.setAge(55);
            nextUser.email = "gmail@gmail.com";
            nextUser.isActive = true;
            nextUser.makePurchase(99);
            nextUser.makePurchase(55);

            firstUser.printData();
            firstUser.printTotalAmountOfSpentMoney();
            System.out.println("----------------------");
            secondUser.printData();
            secondUser.printTotalAmountOfSpentMoney();
            System.out.println("----------------------");
            thirdUser.printData();
            thirdUser.printTotalAmountOfSpentMoney();
            System.out.println("----------------------");
            nextUser.printData();
            nextUser.printTotalAmountOfSpentMoney();


        }
}
