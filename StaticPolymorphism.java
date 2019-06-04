package practicecodes;


class Overriding {
    protected Object samemethod;

    public void disp(String name) {
        System.out.println(name);
    }

    public void disp(String name, int age) {
        System.out.println(name + " " + age);
    }

    protected void samemethod() {
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {

        Overriding obj = new Overriding();
        obj.disp("Mithun");
        obj.disp("Mithun", 25);


    }


}
