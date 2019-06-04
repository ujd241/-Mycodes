package practicecodes;

class Overridden {
    public void samemethod() {
        System.out.println(" Hi ");
    }
}

//Since both the classes, child class and parent class have the same method name as samemethod.
// Which of the method will be called is determined at runtime by JVM.
public class DynamicPolymorphism extends Overridden {
    public void samemethod() {
        System.out.println(" Hello World"); //

    }

    public static void main(String[] args) {
        Overridden obj = new DynamicPolymorphism();
        obj.samemethod();


    }
}
