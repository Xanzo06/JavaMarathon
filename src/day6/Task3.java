package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ольга Михайловна", "Русский язык");
        Student student = new Student("Лёша");

        teacher.evaluate(student);
    }
}
