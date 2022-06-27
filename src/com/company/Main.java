package com.company;

public class Main {
    Employee[] employees = new Employee[10];

    public void createEmployes() {
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "1", 30000.0);
        employees[1] = new Employee("Alekseev Aleksie Alekseevich", "2", 45000.0);
        employees[2] = new Employee("Bobrov Viktor Romanovich", "3", 40000.0);
        employees[3] = new Employee("Smernov Aleksie Alekseevich", "4", 60000.0);
        employees[4] = new Employee("Kirov Anton Alekseevich", "5", 25500.0);
        employees[5] = new Employee("Terekhin Igor Yurievich", "1", 33000.0);
        employees[6] = new Employee("Mirov Vasiliy Vasilievich", "2", 49000.0);
        employees[7] = new Employee("Kim Danil Alexsandrovich", "3", 55000.0);
        employees[8] = new Employee("Babuk Kirill Stepanovich", "1", 50000.0);
        employees[9] = new Employee("Nikitin Valentin Antonovich", "5", 37500.0);
    }

    public static void getEmployeesInfo(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toSting());
        }
    }

    public static double getSummSalaryEmployee(Employee[] employees) {
        double summ = 0;
        for (int i = 0; i < employees.length; i++) {
            summ += employees[i].getSalaryEmployee();
        }
        return summ;
    }

    public static Employee findMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];

        for (int i = 0; i < employees.length; i++) {
            if (minSalary.getSalaryEmployee() >= employees[i].getSalaryEmployee()) {
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    public static Employee findMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];

        for (int i = 0; i < employees.length; i++) {
            if (maxSalary.getSalaryEmployee() <= employees[i].getSalaryEmployee()) {
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    public static void getListEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getEmployeeName());
        }
    }

    public static double getMidSalary(Employee[] employees) {
        return Main.getSummSalaryEmployee(employees) / employees.length;
    }


    public static void main(String[] args) {
        Main main1 = new Main();
        main1.createEmployes();
        Main.getEmployeesInfo(main1.employees);
        System.out.println("Сумма на зарплаты за один месяц " + Main.getSummSalaryEmployee(main1.employees));
        Employee employeeMin = Main.findMinSalary(main1.employees);
        System.out.println("Cотрудник с минимальной зарплатой: " + employeeMin.getEmployeeName() + " c зарлатой: " + employeeMin.getSalaryEmployee());
        Employee employeeMax = Main.findMaxSalary(main1.employees);
        System.out.println("Cотрудник с максимальной зарплатой: " + employeeMax.getEmployeeName() + " c зарплатой: " + employeeMax.getSalaryEmployee());
        System.out.println("Среднее значение зарплаты " + Main.getMidSalary(main1.employees));
        Main.getListEmployee(main1.employees);


    }
}


