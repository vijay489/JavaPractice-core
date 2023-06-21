package org.example.java8;

import org.example.pojo.EmployeeDepartments;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DisplayEmpByDepID {
    public static void main(String[] args) {
        EmployeeDepartments e1 = new EmployeeDepartments("emp1","us",200,"dep1","20");
        EmployeeDepartments e2 = new EmployeeDepartments("emp2","us",200,"dep2","23");
        EmployeeDepartments e3 = new EmployeeDepartments("emp3","us",200,"dep1","12");
        EmployeeDepartments e4 = new EmployeeDepartments("emp4","us",200,"dep2","25");
        EmployeeDepartments e5 = new EmployeeDepartments("emp5","IN",200,"dep1","43");
        EmployeeDepartments e6 = new EmployeeDepartments("emp6","us",200,"dep3","32");

        List<EmployeeDepartments> empDepList = new ArrayList<>();
        empDepList.add(e1);
        empDepList.add(e2);
        empDepList.add(e3);
        empDepList.add(e4);
        empDepList.add(e5);
        empDepList.add(e6);

        displayEmpDepDetails(empDepList);
    }

    private static void displayEmpDepDetails(List<EmployeeDepartments> empDepList) {
        empDepList.stream().filter(emp -> emp.getLocation().equalsIgnoreCase("us"))
                 .sorted(Comparator.comparing(EmployeeDepartments::getDepId))
                 .collect(Collectors.groupingBy(EmployeeDepartments::getDepId,LinkedHashMap::new,
                          Collectors.summingLong(EmployeeDepartments::getSalary)))
                .forEach((key,value) -> System.out.println(key+" ,"+value));

        EmployeeDepartments youngEmp = empDepList.stream().min(Comparator.comparing(EmployeeDepartments::getAge)).get();
        System.out.println("Young employee id = "+youngEmp.getEmpID() + ", age :"+youngEmp.getAge());

    }
}
