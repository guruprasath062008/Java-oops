class Student {
    String name = "Guru";
    int age = 19;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
