package practicecodes;

public class ConstructorExample {
    int age;
    String name;
//Default constructor
    ConstructorExample() {
        this.name = "mithun";
        this.age = 25;
    }
//parameterized constructor
    ConstructorExample(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args) {

        ConstructorExample obj = new ConstructorExample();
        ConstructorExample obj1 = new ConstructorExample("mithun", 25);
        System.out.println(obj.name + " " + obj.age);
        System.out.println(obj1.name + " " + obj1.age);

    }


}
