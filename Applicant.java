public class Applicant extends Person {
    private boolean isProcessed;
    
    public boolean isProcessed() {
        return isProcessed;
    }


    public void setProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }


    public Applicant(int age, String firstName, String lastName, String type){
        super(age, firstName, lastName, type);
        this.isProcessed=false;
    }
}
