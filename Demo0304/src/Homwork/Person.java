package Homwork;

public class Person {
    private String id;
    private String name;
    private int age;
    private String address;
    private String sex;
    private double weight;
    private double height;


    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public Person() {
    }

    public Person(String id, String name, int age, String address, String sex, double weight, double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
