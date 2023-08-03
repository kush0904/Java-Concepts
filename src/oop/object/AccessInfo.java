package oop.object;

public class AccessInfo {
    public static void main(String[] args) {

        StdInfo std1 = new StdInfo();
        std1.setStudentName("Kush");
        std1.setNumber(123);

        System.out.println("Name : " + std1.getStudentName());
        System.out.println("Number : " + std1.getNumber());
        //  System.out.println(std1.number); This will not work because the number is private in another class


        StdInfo std2 = new StdInfo();
        std2.setStudentName("XYZ");
        std2.setNumber(567);

        System.out.println("Name : " + std2.getStudentName());
        System.out.println("Number : " + std2.getNumber());


        StdInfo std3 = std2;  // assigning values of std2 to std3 (referencing)
        std3.setNumber(1000); // only changes for std3 not std2
        System.out.println("Name : " + std3.getStudentName());
        System.out.println("Number : " + std3.getNumber());
    }
}
