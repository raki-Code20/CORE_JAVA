public class Main {
    public static void main(String[] args) {
        person p = new person("Rakesh","Kumar");
        p.showName();
        Student s =  new Student("Rakesh","Kumar",9.75);
        s.display();
        employee e = new employee("Rakesh","Kumar",85000.0);
        e.getInfo();
    }
}
================================================================
================================================================
public class person {
    String fName;
    String lName;
    person(String fName,String lName){
        this.fName=fName;
        this.lName=lName;
    }
    void showName(){
        System.out.println(this.fName+" "+this.lName);
    }
}

====================================================================

====================================================================
public class employee extends person{
    double salary;
    employee(String fName,String lName,double salary){
        super(fName, lName);
        this.salary = salary;
    }
    void getInfo(){
        System.out.println(fName +" "+lName+" is earning "+this.salary);
    }
}
=====================================================================

=====================================================================
public class Student extends person{
    double gpa;
    Student(String  fName ,String lName,double gpa){
        super(fName,lName);
        this.gpa=gpa;
    }
    void  display(){
        System.out.println(fName+" "+lName+" is having "+gpa);
    }
}
========================================================================
************************************************************************
************************************************************************
========================================================================

Rakesh Kumar
Rakesh Kumar is having 9.75
Rakesh Kumar is earning 85000.0

Process finished with exit code 0
