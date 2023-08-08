package august.markerInterface;

class Employee implements Creatable, Deletable, Readable, Updatable {
    private static int serialCounter = 1;
    private int serial;
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.serial = serialCounter++;
        this.id = id;
        this.name = name;
    }

    @Override
    public int getSerial() {
        return serial;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}