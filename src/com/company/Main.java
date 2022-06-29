package com.company;

public class Main {
    private static Employee[] employees = new Employee[10];

    private static void getEmployeesInfo() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toSting());
        }
    }

     private static void getEmployeesInfo(int departmenName) {
         Employee[] xranilishe = filterByDeparment(employees, departmenName);
         for (int i = 0; i < xranilishe.length; i++) {
             // if (xranilishe[i] != null) {
                 System.out.println(xranilishe[i].toSting());
             //}

         }
     }

    private static double getSummSalaryEmployee() {
        double summ = 0;
        for (int i = 0; i < employees.length; i++) {
            summ += employees[i].getSalaryEmployee();
        }
        return summ;
    }

    private static Employee findMinSalary() {
        Employee minSalary = employees[0];

        for (int i = 0; i < employees.length; i++) {
            if (minSalary.getSalaryEmployee() >= employees[i].getSalaryEmployee()) {
                minSalary.setSalaryEmployee(employees[i].getSalaryEmployee());
            }
        }
        return minSalary;
    }

    private static Employee findMaxSalary() {
        Employee maxSalary = employees[0];

        for (int i = 0; i < employees.length; i++) {
            if (maxSalary.getSalaryEmployee() <= employees[i].getSalaryEmployee()) {
                maxSalary.setSalaryEmployee(employees[i].getSalaryEmployee());
            }
        }
        return maxSalary;
    }

    private static void getListEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getEmployeeName());
        }
    }

    private static double getMidSalary() {
        return Main.getSummSalaryEmployee() / employees.length;
    }

    private static void indexSalary(Employee[] employees, double index) {
        for (int i = 0; i < employees.length; i++) {
            double zp = employees[i].getSalaryEmployee();
            employees[i].setSalaryEmployee(zp += zp / 100 * index);
        }
    }

    private static Employee[] filterByDeparment(Employee[] employees, int nomerDepartment) {
        Employee[] employees2 = new Employee[10];
        int b = 0;
        for (int i = 0; i < employees.length; i++) {
            if (nomerDepartment == employees[i].getDepartmentName()) {
                employees2[b++] = employees[i]; // 1 варик
            }
        }
        Employee[] employees3 = new Employee[b];
        System.arraycopy(employees2, 0, employees3, 0, b);
        return employees3;
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 30000.0);
        employees[1] = new Employee("Alekseev Aleksie Alekseevich", 2, 45000.0);
        employees[2] = new Employee("Bobrov Viktor Romanovich", 3, 40000.0);
        employees[3] = new Employee("Smernov Aleksie Alekseevich", 4, 60000.0);
        employees[4] = new Employee("Kirov Anton Alekseevich", 5, 25500.0);
        employees[5] = new Employee("Terekhin Igor Yurievich", 1, 33000.0);
        employees[6] = new Employee("Mirov Vasiliy Vasilievich", 2, 49000.0);
        employees[7] = new Employee("Kim Danil Alexsandrovich", 3, 55000.0);
        employees[8] = new Employee("Babuk Kirill Stepanovich", 1, 50000.0);
        employees[9] = new Employee("Nikitin Valentin Antonovich", 5, 37500.0);
        getEmployeesInfo();
        System.out.println("сумма затра на месяц: " + getSummSalaryEmployee());
        System.out.println("min: " + findMinSalary().getSalaryEmployee());
        System.out.println("MAx: " + findMaxSalary().getSalaryEmployee());
        System.out.println("средняя зарлпата: " + getMidSalary());
        getListEmployee();
    }
}


