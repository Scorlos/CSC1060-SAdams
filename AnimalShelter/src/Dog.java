public abstract class Dog implements AdoptableAnimal {
    String name;
    String description;
    double price;

    Dog(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public abstract String getBreed();
}
