package company_app_design;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */
    public static void main(String[] args) {

        EmployeeInfo employeeInfo1 = new EmployeeInfo(1);
        System.out.println(("the employee id is " + employeeInfo1.employeeId()));

        EmployeeInfo employeeInfo2 = new EmployeeInfo("Auooz", 1);
        System.out.println(("the employee name is " + employeeInfo2.employeeName()));

        EmployeeInfo employeeInfo = new EmployeeInfo();
        System.out.println(employeeInfo.calculateSalary());
        System.out.println(employeeInfo.benefits());
        System.out.println(employeeInfo.assignDepartment());



    }
}
