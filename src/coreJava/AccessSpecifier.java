package coreJava;
class Employee {
    public String employeeName;
    protected String jobTitle;
    private final int employeeId;

    public Employee(String name, int id, String jobTitle) {
        this.employeeName = name;
        this.employeeId = id;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return this.employeeName;
    }
    public int getId() {
        return this.employeeId;
    }
}

public class AccessSpecifier {
    public static void main(String[] args) {
        Employee rajeev = new Employee("Rajeev", 12556, "Software Engg");
        System.out.println(rajeev.employeeName +  rajeev.jobTitle);
    }
}
