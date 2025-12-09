package day5;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int yearOfIssue, String model, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
