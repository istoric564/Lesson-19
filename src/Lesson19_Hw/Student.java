package Lesson19_Hw;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private double averageScore;

    public Student(String name, String lastName, int age, double averageScore) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }
    public String getFullName(){
        return getName() + " " + getLastName();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }
}
