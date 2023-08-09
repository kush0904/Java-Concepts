package august.annotations.customAnnotations;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ToDo obj = new ToDo();

        if(obj.getClass().isAnnotationPresent(ToDoGo.class)){
            obj.createToDoList();
        }
        else{
            obj.notAllowed();
        }
    }
}
