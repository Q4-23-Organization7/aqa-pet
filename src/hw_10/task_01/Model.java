package hw_10.task_01;

public class Model extends MobilePhone {

    private final String modelName;

    public Model(String brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    public void browseInternet() {
        System.out.println("Browsing internet from " + getBrand() + " " + modelName);
    }
}
