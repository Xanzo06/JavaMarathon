package day9.Task1;

public class Teacher extends Human{
    private String nameItem;

    public Teacher(String name, String nameItem) {
        super(name);
        this.nameItem = nameItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
