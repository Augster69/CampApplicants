public class Camper extends Person {
    private int age;
    private String firstName;
    private String lastName;
    private String type;

    public Camper(int age, String firstName, String lastName, String type){
        super(age, firstName, lastName, type);
        this.isProcessed=false;
    }
}