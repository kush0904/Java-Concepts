package august.markerInterface;

public class Crud {
    private Employee[] employees;

    public Crud(int size) {
        employees = new Employee[size];
    }

    public int addEmployee(String id, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(id, name);
                return 1;
            }
        }
        return 0;
    }

    public int deleteEmployee(String id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId().equals(id)) {
                System.out.println("Deleted the employee data with id : " + id);
                employees[i] = null;
                return 1;
            }
        }
        return 0;
    }

    public void showEmployees() {
        for (Employee emp : employees) {
            if (emp instanceof Readable) {
                System.out.println("S.No : " + emp.getSerial() + "\nEmployee Id : " + emp.getId() + "\nEmployee Name : " + emp.getName() + "\n");
            }
        }
    }

    public void updateEmployee(String id, String name) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId().equals(id) && emp instanceof Updatable) {
                System.out.println("Updated the employee data with id : " + id);
                emp.setName(name);
            }
        }
    }
}
