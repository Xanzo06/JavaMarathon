package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Борис", "БАП-123");

        Teacher teacher = new Teacher("Ольга Михайловна", "Математика");

        System.out.println("Название группы студента: " + student.getGroupName() + "\nПреподаватаель: " + teacher.getNameItem());

        student.printInfo();
        teacher.printInfo();
    }

}
