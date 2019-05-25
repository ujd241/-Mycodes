package practicecodes;

public class Website {     //Website is Class here

    String webname;   // webname and webage is fields or variables(instances)
    int webage;


    Website(String name, int age) {   // constructor for fields
        this.webname = name;
        this.webage = age;

    }

    public static void main(String[] args) {

        Website obj1 = new Website("mithun.com", 5);  // creating an object called obj1 and obj2
        Website obj2 = new Website("google.com", 18);
// accessing object data of obj1 and obj2 through referances
        System.out.println(obj1.webname + " and " + obj1.webage);
        System.out.println(obj2.webname + " and " + obj2.webage);


    }

}
