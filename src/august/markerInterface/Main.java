package august.markerInterface;

public class Main {
    public static void main(String[] args) {
        Crud crud = new Crud(10);

        crud.addEmployee("1", "John Doe");
        crud.addEmployee("2", "Jane");

        crud.showEmployees();

        crud.deleteEmployee("1");

        crud.showEmployees();

        crud.updateEmployee("2","Jesse");
        crud.showEmployees();
    }
}
