public class Wilder {
    
    private String firstname;
    private boolean aware;
    
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    
    public String getFirstname() {
        return firstname;
    }
    public boolean getAware() {
        return aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setAware(boolean aware) {
        this.aware = aware;
    }
    
    public String whoAmI(){
        return "Je m'appelle "+ this.getFirstname() + " et je " + (this.getAware() ? "suis aware" : "ne suis pas aware");
    }
    
}