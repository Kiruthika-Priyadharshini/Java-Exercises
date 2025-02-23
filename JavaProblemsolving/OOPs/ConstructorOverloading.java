package JavaProblemsolving.OOPs;

public class ConstructorOverloading {
    private String brand;
    private int storage;
    private int ram;

    public ConstructorOverloading(String brand) {
        this.brand = brand;
    }

    public ConstructorOverloading(String brand, int storage, int ram) {
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }

    public ConstructorOverloading(int storage, int ram) {
        this.brand = "Windows";
        this.storage = storage;
        this.ram = ram;
    }

    public ConstructorOverloading(int storage) {
        this.brand = "Windows";
        this.storage = storage;
        this.ram = 8;
    }

    public void display() {
        System.out.println("Laptop brand: " + brand + ", RAM: " + ram + ", Storage: " + storage);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(512);
        ConstructorOverloading obj2 = new ConstructorOverloading(1, 16);
        ConstructorOverloading obj3 = new ConstructorOverloading("Mac", 2, 32);

        obj1.display();
        obj2.display();
        obj3.display();

    }

}
