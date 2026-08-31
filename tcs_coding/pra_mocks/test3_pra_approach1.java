package tcs_coding.pra_mocks;


import java.util.Scanner;

public class test3_pra_approach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Department[] depts = new Department[n];
        for(int i=0 ; i<n ; i++) {
            sc.nextLine();
            String deptName = sc.nextLine();
            int no_of_emps = sc.nextInt();
            Employee[] emp = new Employee[no_of_emps];

            for(int j=0 ; j<no_of_emps ; j++) {
                int empId = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                String designation = sc.nextLine();
                double salary = sc.nextDouble();
                int projectsCompleted = sc.nextInt();
                double rating = sc.nextDouble();
                
                emp[j] = new Employee(empId, name, designation, salary, projectsCompleted, rating);        
            }
       
            depts[i] = new Department(deptName, emp );
        }
        findTopPerformerFromAllDepartments(depts);
        updateSalariesBasedOnPerformance(depts);
        sc.close();

    }


    public static void findTopPerformerFromAllDepartments(Department[] departments) {
        Employee highPerf=null;
        String topDepartment = null;
        for(int i=0 ; i<departments.length ; i++) {
            Employee[] emp = departments[i].getEmployees();
            
            
            for(int j=0 ; j<emp.length ; j++) {
                if(highPerf==null || emp[j].getRating() > highPerf.getRating()) {
                    highPerf = emp[j];
                    topDepartment = departments[i].getDepartmentName();
                }
                else if(emp[j].getRating() == highPerf.getRating()) {
                    if(emp[j].getProjectsCompleted() > highPerf.getProjectsCompleted()) {
                        highPerf = emp[j];
                        topDepartment = departments[i].getDepartmentName();
                    }
                } else {
                    continue;
                }
            }
            
        }
        System.out.println("Top performer:\n"+"DepartmentName: "+topDepartment+"\nEmployeeId: "+highPerf.getEmployeeId()+"\nName: "+highPerf.getName()+"\nSalary: "+highPerf.getSalary()+"\nprojectsCompleted: "+highPerf.getProjectsCompleted()+"\nRating: "+highPerf.getRating());
    }

    public static void updateSalariesBasedOnPerformance(Department[] departments) {
        for(int i=0 ; i<departments.length; i++) {
            Employee[] emp = departments[i].getEmployees();

            for(int j=0 ; j<emp.length ; j++) {
                if(emp[j].getRating() >= 4.5) {
                    double updateSalary = emp[j].getSalary() + (emp[j].getSalary()*0.1);
                    emp[j].setSalary(updateSalary);
                    System.out.println(emp[j].getName()+" new salary: "+emp[j].getSalary());
                }

            }
        }
    }


}


class Employee{
    int employeeId;
    String name;
    String designation;
    double salary;
    int projectsCompleted;
    double rating;

    Employee(int employeeId, String name, String designation, double salary, int projectsCompleted, double rating) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.projectsCompleted = projectsCompleted;
        this.rating = rating;
    }

    //setters and getters
    public int getEmployeeId() {return employeeId;}
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDesignation() {return designation;}
    public void setDesignation(String designation) {this.designation = designation;}
    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}
    public int getProjectsCompleted() {return projectsCompleted;}
    public void setProjectsCompleted(int projectsCompleted) {this.projectsCompleted = projectsCompleted;}
    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}
}

class Department {
    String departmentName;
    Employee[] employees;

    Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    //getters and setters
    public String getDepartmentName() {return departmentName;}
    public Employee[] getEmployees() {return employees;}
    public void setDepartmentName(String departmentName) {this.departmentName = departmentName;}
    public void setEmployees(Employee[] employees) { this.employees = employees;}
}