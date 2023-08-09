package august.annotations.customAnnotations;

@ToDoGo
public class ToDo {

    public ToDo(){
        System.out.println("TO DO");
    }

    public void createToDoList(){
        System.out.println("Creating...");
    }

    public void notAllowed(){
        System.out.println("Sorry, you are not allowed to do this!");
    }



}
