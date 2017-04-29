package design;

import java.util.Scanner;

public class EmployeeInfo extends CnnPolitics implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

    /*
	 * declare few static and final fields and some non-static fields
	 */
    static String company_Name = "CNN";
    public static final String company_Founder = "Bolton";
    public static String company_CEO = "Micheal";
    public String company_location;

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */

    public EmployeeInfo(String company_CEO) {
        this.company_CEO = company_CEO;
    }

    public EmployeeInfo(String company_CEO, String company_location) {
        this.company_CEO = company_CEO;
        this.company_location = company_location;
    }

    public static String getCompany_Name(String company_Name) {
        return company_Name;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.company_Name = companyName;
    }

    public static String getCompanyFounder() {
        return company_Founder;
    }

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */

    public static int calculateEmployeeBonus() {
        int total = 0;
        int salary = 50000;
        int bestPerformance = 10 / 100;
        int averagePerformance = 8 / 100;
        if (bestPerformance > averagePerformance) {
            total = salary / bestPerformance;
            System.out.println("Employee Best performance bonus:" + (total));
        } else
            total = salary / averagePerformance;
        System.out.println("Employee average performance bonus:" + (total));

        return total;
    }
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */

    public static int calculateEmployeePension() {
        int total = 0;
        int salary = 50000;
        int firstYearWork = 1;
        int secondYearWork = 2;
        int firatYearPension = 5 / 100;
        int secondYearPension = 10 / 100;
        if (secondYearWork > firstYearWork && secondYearPension > firatYearPension) {
            total = salary / secondYearPension;
            System.out.println("Second year pension would be " + total);
        } else
            total = salary / firatYearPension;
        System.out.println("First year pension would be " + total);
        return total;
    }

    @Override
    public int employeeId() {
        int employee_id = 8;
        while (employee_id != 0) {
            System.out.println(employeeId());
        }
        return 0;
    }

    @Override
    public String employeeName() {
        String employee_name = "Steve";
        do {
            System.out.println("Employee Name " + employee_name);
        } while (employee_name == "Steve");
        return null;
    }

    @Override
    public void assignDepartment() {
        String department = "Finance";
        if ("Finance".equals(department)) {
            System.out.println("Hudas working department " + department);
        } else if ("Accounting".equals(department)) {
            System.out.println("Sharif working department " + department);
        } else if ("Humen Resource".equals(department)) {
            System.out.println("Kafil working department " + department);
        } else if ("Management".equals(department)) {
            System.out.println("Lilis working department " + department);
        } else if("Maintenance".equals(department)) {
            System.out.println("Cinkun working department " + department);
        }
    }

    @Override
    public int calculateSalary() {
        double workingHours = 0, rate = 50, overTime, total;
        Scanner scanner = new Scanner(System.in);
        workingHours = scanner.nextInt();
        if (workingHours > 32 && workingHours < 40) {
            total = workingHours * rate;
        } else if (workingHours > 40) {
            overTime = workingHours -= 40;
            total = workingHours * rate + overTime * 1.5;
        }
        return 0;
    }

    @Override
    public void benefitLayout(int choice) {

        System.out.println("CNN employees benifit include: 1, Medical , 401K, Employee Discount, Time off, Educational Assistent");

        String benefits = " ";

        switch (choice) {
            case 1:
                benefits = "Health Insurance";
                System.out.println("$10 Generic co-pay\n" +
                        "$20 Formulary co-pay\n" +
                        "$35 Non-Formulary co-pay");
                break;
            case 2:
                benefits = "Dental Insurance";
                System.out.println("Twice-yearly oral exams, " +
                        "x-rays every 36 months, and preventative treatment are all 100% covered. Other procedures " +
                        "are covered under a 50-80% co-insurance feature of the plan design. For a complete summary of dental benefits,");
                break;
            case 3:
                benefits = "Vision Insurance";
                System.out.println("Cobham provides safety glasses free of charge to those \n" +
                        "employees who work in areas that require them.");
                break;
            case 4:
                benefits = "Flexible Spending Accounts (FSA)";
                System.out.print("FSAs allow employees to pay for certain medical expenses and/or childcare costs on a pre-tax basis. " +
                        "FSAs are one of the best tax breaks available. When you reduce your tax liability, you increase your disposable income.");
                break;
            default:
                benefits = "Educational Assistance";
                System.out.println("CNN offer a tuition reimbursement program that covers undergraduate and graduate programs.");
                break;
        }
    }

    @Override
    public void usaPolitics() {
        System.out.println("Physics theory is vital political issue of Americal politics history");
    }
}