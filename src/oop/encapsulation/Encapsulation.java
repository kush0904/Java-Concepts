package oop.encapsulation;

public class Encapsulation {
    int serialNo;

    public Encapsulation() {
        serialNo = 10;
        System.out.println("Serial No: " + serialNo); // 10
        System.out.println("Serial No: " + ++serialNo); // 11 (changed value of serialNo)
        System.out.println("Serial No: " + (1 + serialNo)); // 12 (does not change the value of serialNo)
    }

    public Encapsulation(int serialNo) {
        this.serialNo = serialNo;
        System.out.println("Serial No: " + this.serialNo);
    }

    public void Method() {
        System.out.println("Serial No: " + serialNo); // 11
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.Method();
        System.out.println("Value through object: " + obj.serialNo);

        obj.setSerialNo(100);
        System.out.println(obj.getSerialNo());

        Encapsulation obj2 = new Encapsulation(20);
    }
}
