package practicecodes;

abstract class Abstractclass {

    public abstract void abstractmethod(); // no implementation
    }


public class AbstractClassMethod extends  Abstractclass{

    public void abstractmethod(){
        System.out.println("Hello World"); // implementation
    }

    public static void main(String[] args) {
        Abstractclass obj=new AbstractClassMethod();
        obj.abstractmethod();
    }
}
