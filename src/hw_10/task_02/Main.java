package hw_10.task_02;

public class Main {

    public static void main(String[] args) {
        Printable[] printableArray = new Printable[4];
        printableArray[0] = new Book("Java Programming");
        printableArray[1] = new Magazine("National Geographic");
        printableArray[2] = new Book("Harry Potter");
        printableArray[3] = new Magazine("Time");

        for (Printable item : printableArray) {
            item.print();
        }

        System.out.println("Printing only magazines:");
        Magazine.printMagazines(printableArray);
    }
}
