// Java code​​​​​​‌​‌‌‌‌‌‌​​‌​‌​​‌​​​​‌​​‌​ below
/***************************************************
 * Write your answer here, and then test your code.
 * Count the number of each type of employee.
 ****************************************************/

class Answer {

    /***************************************************
     * Change these boolean values to control whether you see
     * the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = true;
    static boolean showHints = false;

    static EmployeeReport generateReport(Employee[] employees) {

        int managerCount = 0;
        int engineerCount = 0;
        int internCount = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Manager) {
                managerCount += 1;
            } else if (employees[i] instanceof Intern) {
                internCount += 1;
            } else if (employees[i] instanceof Engineer) {
                engineerCount += 1;
            }

        }

        return new EmployeeReport(managerCount, engineerCount, internCount);
    }
}

/***************************************************
 * Do not change any of the classes below
 ****************************************************/

class Employee {
}

class Manager extends Employee {
}

class Engineer extends Employee {
}

class Intern extends Employee {
}

class EmployeeReport {
    private int numberOfManagers;
    private int numberOfEngineers;
    private int numberOfInterns;

    public EmployeeReport() {
        setNumberOfManagers(0);
        setNumberOfEngineers(0);
        setNumberOfInterns(0);
    }

    public EmployeeReport(int numberOfManagers, int numberOfEngineers, int numberOfInterns) {
        setNumberOfManagers(numberOfManagers);
        setNumberOfEngineers(numberOfEngineers);
        setNumberOfInterns(numberOfInterns);
    }

    public int getNumberOfManagers() {
        return numberOfManagers;
    }

    public void setNumberOfManagers(int numberOfManagers) {
        this.numberOfManagers = numberOfManagers;
    }

    public int getNumberOfEngineers() {
        return numberOfEngineers;
    }

    public void setNumberOfEngineers(int numberOfEngineers) {
        this.numberOfEngineers = numberOfEngineers;
    }

    public int getNumberOfInterns() {
        return numberOfInterns;
    }

    public void setNumberOfInterns(int numberOfInterns) {
        this.numberOfInterns = numberOfInterns;
    }
}
