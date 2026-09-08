package classes;

public class Cat {
    private String name;
    private String color;
    private int age ;

    public Cat(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public String meow(){
        return "miau miau caramba!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
