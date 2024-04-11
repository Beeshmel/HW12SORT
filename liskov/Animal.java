package liskov;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void voice(){
        System.out.println("Издать звук");
    }

    void play(){
        System.out.println(name + " играет...");
    }
}
