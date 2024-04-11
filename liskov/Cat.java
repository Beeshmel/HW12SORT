package liskov;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        super(name);

    }

    public void voice(){
        System.out.println("Мяу");
    }
}
