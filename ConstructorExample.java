public class ConstructorExample {
    String name;

    ConstructorExample(String studentName) {
        name = studentName;
    }

    public static void main(String[] args) {
        ConstructorExample student =
                new ConstructorExample("Guru");

        System.out.println("Name: " + student.name);
    }
}
