import java.util.Scanner;

 class Employee{
    int age, phonenumber,salary;
    String name,address;
    public void salary(int a)
    {
   
       System.out.println("Salary is " +a);
    }
}
  class Officer extends Employee{
      
      String specialization;
     
    }
    class Manager extends Employee{
     
        String department;
    }


public class InheritanceDemo {

   
    public static void main(String[] args) {
      
       Scanner sc=new Scanner(System.in);
       Scanner obj=new Scanner(System.in);
       Officer o=new Officer();
       Manager m=new Manager();
       System.out.println("ENTER THE NAME OF OFFICER:");
       o.name=sc.nextLine();
        System.out.println("ENTER THE address OF THE OFFICER:");
       o.address=sc.nextLine();
       System.out.println("ENTER THE Specialization OF THE OFFICER:");
       o.specialization=sc.nextLine();
       System.out.println("ENTER THE age OF THE OFFICER :");
       o.age=sc.nextInt();
       System.out.println("ENTER THE SALARY OF THE OFFICER:");
       o.salary=sc.nextInt();
       System.out.println("THE NAME is "+o.name);
       System.out.println("THE AGE IS  "+o.age);
       System.out.println("THE address is "+o.address);
       o.salary(o.salary);
       System.out.println();
       System.out.println("ENTER THE NAME OF MANAGER: ");
       m.name=obj.nextLine();
       System.out.println("ENTER THE address OF THE MANAGER: ");
       m.address=obj.nextLine();
       System.out.println("ENTER THE department OF THE MANAGER: ");
       m.department=obj.nextLine();
       System.out.println("ENTER THE age OF THE MANAGER : ");
       m.age=obj.nextInt();
       System.out.println("ENTER THE SALARY OF THE MANAGER: ");
       m.salary=obj.nextInt();
       System.out.println("THE NAME is "+m.name);
       System.out.println("THE AGE IS  "+m.age);
       System.out.println("THE address is "+m.address);
        System.out.println("THE department is "+ m.department);
       m.salary(m.salary);
    }
}
