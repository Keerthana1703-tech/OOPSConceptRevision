class AnimalParent {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogChild extends AnimalParent {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        DogChild dog = new DogChild();

        dog.eat();
        dog.bark();
    }
}