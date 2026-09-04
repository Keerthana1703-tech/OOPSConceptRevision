class AnimalParent2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogChild2 extends AnimalParent2 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        DogChild2 dog = new DogChild2();

        dog.sound();
    }
}