package lt.codeacademy;

public class Cat extends Animal{

   static int age = 15;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    private void printDefaultAge() {
        System.out.println(super.age);
    }

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(Animal.age);

    }
}
