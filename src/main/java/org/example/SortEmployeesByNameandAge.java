package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByNameandAge {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList();
        Country country1 = new Country();
        country1.setCountryName("India");
        country1.setCountryId("IND");

        Country country2 = new Country();
        country2.setCountryName("United states");
        country2.setCountryId("USA");

        Employee emp1= new Employee("John",26,country1);
        Employee emp2= new Employee("Vijay",23,country2);


        employees.add(emp1);
        employees.add(emp2);

       // john - us , vijay - india
        employees.stream().map(emp -> emp.getName()+" - "+emp.getCountry().getCountryName())
                .collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("List before sorting : ");
        for(Employee e: employees)
        {
            System.out.println(e.getName()+" - "+e.getAge());
        }

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getName().compareTo(o2.getName()) ==0)
                {
                    return o1.getAge() - o2.getAge();
                } else
                    return o1.getName().compareTo(o2.getName());

               /* if(o2.getAge() - o1.getAge() == 0)
                    return o2.getName().compareTo(o1.getName());
                else
                    return o2.getAge() - o1.getAge();*/
            }
        });

        System.out.println("--------------------------");
        System.out.println("List after sorting : ");
        for(Employee e: employees)
        {
            System.out.println(e.getName()+" - "+e.getAge());
        }
    }
}
