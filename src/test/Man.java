package test;

public class Man {
    private String name;
    private String position;
    private int age;
    private double height;

    public Man(String name, String position, int age, double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    public void showInfo() {
        System.out.println("Имя : " + name);
        System.out.println("Должность : " + position);
        System.out.println("Возраст : " + age);
        System.out.println("Рост : " + height);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть больше 0");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getHeight() {
        return height;
    }
}
