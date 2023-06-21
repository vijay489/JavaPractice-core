package org.example.pojo;


public class EmployeeDepartments {
    private String empID;
    private String location;
    private long salary;
    private String depId;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String age;

    public EmployeeDepartments(){

    }

    public EmployeeDepartments(String empID, String location, long salary, String depId,String age) {
        this.empID = empID;
        this.location = location;
        this.salary = salary;
        this.depId = depId;
        this.age = age;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }




}
