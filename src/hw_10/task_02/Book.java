package hw_10.task_02;

public class Book implements Printable{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }
}

