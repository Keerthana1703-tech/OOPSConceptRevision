class StudentObject {
    String name;

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        StudentObject student1 = new StudentObject();

        student1.name = "Keerthana";
        student1.display();
    }
}