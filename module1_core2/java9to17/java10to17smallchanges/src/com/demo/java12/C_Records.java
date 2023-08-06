package com.demo.java12;

import java.util.Objects;

//version
//class Employee{
//    private int id;
//    private String name;
//    private double salary;
//
//    public Employee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, salary);
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}
//records is not mutable , aka final class and it is used as DTO

//interface FooClass{
//    void foof();
//}
// record Employee(int id, String name, double salary) implements FooClass{
//     @Override
//     public void foof() {
//     }
// }
//normal ctr
//compact ctr
//cannonical ctr
record Employee(int id, String name, double salary) {

        //compact ctr
        public Employee{
            if(name==null || salary<=0)
                throw new IllegalArgumentException("....");
        }
        //cannonical ctr
//        public Employee(String name, double salary){
//            if(name!=null || salary>4000){
//                this.name=name;
//                this.salary=salary;
//            }
//            throw new IllegalArgumentException("....");
//        }

        ////default ctr
        public Employee(){
            this(0,"foo",2000);
        }

}

public class C_Records {
    public static void main(String[] args) {
//        Employee e1=new Employee(1,null,6000);
//        System.out.println(e1);


//        Employee e1=new Employee(1,"raj",6000);
//        Employee e2=new Employee(1,"raj",6000);
//
//        System.out.println(e1);
//        System.out.println(e1);
//        System.out.println(e1.equals(e2));
        //System.out.println(e1.id()+ e1.name()+": "+ e1.salary());

        //No setter : as it is immutable
        //ctr, getter, aka final class
    }
}

