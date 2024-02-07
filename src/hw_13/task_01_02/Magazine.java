package hw_13.task_01_02;

import java.util.function.Consumer;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }

    public static void printMagazines(Printable[] printable) {
        Consumer<Printable> magazinePrinter = Printable::print;
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                magazinePrinter.accept(item);
            }
        }
    }
}