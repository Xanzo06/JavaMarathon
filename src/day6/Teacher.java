package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String item;

    public Teacher(String name, String item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int rand = random.nextInt(4) + 2;
        System.out.println("Преподователь: " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getItem()
                + " на оценку " + rand );
        if (rand == 5){
            System.out.println("отлично");
        }else if (rand == 4){
            System.out.println("хорошо");
        }else if (rand == 3){
            System.out.println("удовлетворительно");
        }else {
            System.out.println("неудовлетворительно");
        }

    }
}
