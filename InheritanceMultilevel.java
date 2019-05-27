package practicecodes;

class Language {   //first class
    public Language() {
        System.out.println(" programming language 1 ");
    }

    public void java() {
        System.out.println("core java"); //method of first class

    }

    public void oops() {
        System.out.println("multilevel inheritance");
    }
}

class Language2 extends Language { // class 2 extends class 1

    public Language2() {
        System.out.println(" programming language 2 ");
    }

    public void c() {
        System.out.println("c programming");

    }

    public void functions() {
        System.out.println("functions");
    }


}


public class InheritanceMultilevel extends Language2 { // class 3 extends class 2
    public static void main(String[] args) {
        InheritanceMultilevel obj = new InheritanceMultilevel(); // calling all classes
        obj.java();
        obj.oops();
        obj.c();
        obj.functions();

    }


}
