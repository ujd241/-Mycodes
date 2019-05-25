package practicecodes;


class InstanceVariables {    // Make the instance variables private so that they cannot be accessed directly from outside
    // the class. You can only set and get values of these variables through the methods of the class
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private String empoyer; // which is not having setter method

    public String getEmpoyer() {

        System.out.println(" Mithun pvt ltd ");
        return empoyer;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {

        InstanceVariables obj = new InstanceVariables();
        obj.setEmployeeId(100);
        obj.setEmployeeName("mithun");
        obj.setEmployeeAge(25);


        System.out.println(" employee details ");

        obj.getEmpoyer();// we can't set any value for it

        System.out.println(" employee ID : " + obj.getEmployeeId());
        System.out.println(" employee NAME : " + obj.getEmployeeName());
        System.out.println(" employee Age : " + obj.getEmployeeAge());


    }
}
