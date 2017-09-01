package binding;

import java.beans.PropertyChangeEvent;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("John Jakson", 2000.00);

        computeTax(e.getSalary());

        e.addPropertyChangeListener(EmployeeTest::handlePropertyChange);

        e.setSalary(3000.00);
        e.setSalary(3000.00);
        e.setSalary(6000.00);
    }

    public static void handlePropertyChange(PropertyChangeEvent e) {
        String propertyName = e.getPropertyName();

        if("salary".equals(propertyName)) {
            System.out.println("Salary has changed.");
            System.out.println("Old: " + e.getOldValue());
            System.out.println("New: " + e.getNewValue());
            computeTax((Double) e.getNewValue());
        }
    }

    public static void computeTax(double salary) {
        final double TAX_PERCENT = 20.00;

        double tax = salary * TAX_PERCENT / 100.00;
        System.out.println("Salary: " + salary + ", Tax: " + tax);
    }
}
