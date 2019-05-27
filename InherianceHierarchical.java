package practicecodes;

class A {
    public void methodA() {
        System.out.println(" method of class A");
    }
}

class B extends A {
    public void methodB() {
        System.out.println(" method of class B");
    }
}

class C extends A {
    public void methodC() {
        System.out.println(" method of class C");
    }
}

class D extends A {
    public void methodD() {
        System.out.println(" method of class D");
    }
}

class E extends A {
    public void methodE() {
        System.out.println(" method of class E");
    }
}


public class InherianceHierarchical {
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        D obj2 = new D();
        E obj3 = new E();
        //all classes can access method of A

        obj.methodA();
        obj1.methodA();
        obj2.methodA();
        obj3.methodA();


    }
}
