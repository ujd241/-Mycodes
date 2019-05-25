package practicecodes;

class Singer {
    String name = "CHANDAN SHETTY"; // variables of parent class
    String language = "KANNADA";

    void profession() {
        System.out.println("SINGER"); //method of parent class
    }
}

public class InheritanceSingle extends Singer {  // child class acquires parent class fields and methods
    String style = "RAPPER"; // parent class variable

    public static void main(String args[]) {
        InheritanceSingle obj = new InheritanceSingle();
        obj.profession();
        System.out.println(obj.language);
        System.out.println(obj.style);
        System.out.println(obj.name);


    }
}
