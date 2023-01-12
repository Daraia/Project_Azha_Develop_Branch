package Serhan;

public abstract class Serhan002 {

    private String name;
    private int age;
    private String nationality;
    private double salary;
    private final char gender;

    public Serhan002(String name, int age, String nationality, double salary, char gender) {
        setName(name);
        setAge(age);
        setNationality(nationality);
        setSalary(salary);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
