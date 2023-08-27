package august.exceptionHandling;

public class ThrowsExample {

    private String name;

    ThrowsExample(String name) {
        this.name = name;
    }
    public String getName(){

        if(name==null){
            throw new NullPointerException("The name is null");
        } else {
            return name;
        }
    }

    public int getNameLength() throws NullPointerException{
        return name.length();
    }

    public void sendDetails(){
        int size = 0;
        try {
            size = getNameLength();
        }catch (NullPointerException e) {
            System.out.println("name is null, check again");
        }
        System.out.println(size+10);
    }
    public static void main(String[] args) {

        String name = null;
        ThrowsExample obj = new ThrowsExample(name);
        System.out.println(obj.getName());
        System.out.println(obj.getNameLength());
        obj.sendDetails();
    }
}
