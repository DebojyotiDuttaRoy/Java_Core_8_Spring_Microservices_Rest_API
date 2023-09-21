package com.java8;
import java.util.*;

class Employee {
	
    private String empName;
    private int empID;
    
    public Employee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    public String getEmpName() {return empName;}
    public int getEmpID() {return empID; }
    
    @Override
    public String toString(){
        return "\nEmployee [empName = "+empName+", empID = "+empID+"]";
    }
}

public class L2_Sort_collection_by_Lambda {
    public static void main(String[] args) {
        //============== Sort a collection using Lambda Expression ==============
        List<Employee> lst= new ArrayList<Employee>();
        lst.addAll(
                Arrays.asList(
                        new Employee("Drew",101),
                        new Employee("Alex",102),
                        new Employee("Yaman",103),
                        new Employee("James",104),
                        new Employee("Robin",105)
                )
        );
        System.out.println(lst);
        //-------------------------- By Anonymous Class --------------------------
        /*->
        Comparator<Employee>comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        };
        Collections.sort(lst,comp);
        System.out.println(lst);
        //------------------------- By Lambda Expression -------------------------
        Collections.sort(lst,(e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
        System.out.println(lst);*/
        //------------------------ By :: Method Reference ------------------------
        Collections.sort(lst, Comparator.comparing(Employee::getEmpName));
        System.out.println(lst);
    }
}
