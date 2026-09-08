package classes;

public class Cat extends AnimalAbstrato{
    private String color;
    private int age ;

    public Cat(int age, String color, String name) {
        super(name);
        this.age = age;
        this.color = color;
    }

    public String meow(){
        return "miau miau caramba!";
    }

    @Override
    public void emitirSom() {
        System.out.println("miau miau");
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

    @Override
    public String toString() {
        return "Cat" +
                "\nname: " + Cat.super.getName() +
                "\ncolor: " + color +
                "\nage: " + age;
    }
}
