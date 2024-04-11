package liskov;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик");
        cat.voice();
        cat.play();
    }
}
