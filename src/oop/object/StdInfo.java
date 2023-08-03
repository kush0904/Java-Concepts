package oop.object;

public class StdInfo {

    private String studentName;
    public int number;


    public StdInfo(){
        System.out.println("Welcome");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {

        // Moved the main content to another Java Class

        /*StdInfo std1 = new StdInfo();
        std1.setStudentName("Kush");
        std1.setNumber(123);

        System.out.println("Name : " + std1.getStud entName());
        System.out.println("Number : " + std1.getNumber());*/
    }
}
