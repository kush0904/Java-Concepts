package august.collections;

import java.util.*;

public class AddEmployee {
    private static Scanner input;
    private int n;
    private static final int TOTAL_DATA = 4;
    private Map<String, List<String>> map;
    private List<String> list;

    static {
        input = new Scanner(System.in);
    }

    public AddEmployee(int N) {
        n = N;
    }

    public int getN() {
        return n;
    }

    public void addEmployee(int total_employees) {
        String emp_id = null;
        map = new HashMap<>();

        for (int i = 0; i < total_employees; i++) {
            list = new ArrayList<>();
            System.out.print("Enter ID : ");
            emp_id = input.next();

            System.out.print("Enter Details : ");
            for (int e = 0; e < TOTAL_DATA; e++) {  // NAME - LOCATION - TEAM NAME - SALARY
                list.add(input.next());
            }
            map.put(emp_id, list);
        }
    }

    public void showDetails() {
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of employees : ");
        int total_employees = input.nextInt();
        AddEmployee details = new AddEmployee(total_employees);
        details.addEmployee(total_employees); // Add employee details
        details.showDetails(); // Display employee details
    }
}
