
package gym;

public abstract class GymMembership {

    private String name;
    private int id;
    private int numOfMonths;

    public GymMembership(String name ) {
        this.name = name;
        setId(generateID());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumOfMonths(int numOfMonths) {
        this.numOfMonths = numOfMonths;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumOfMonths() {
        return numOfMonths;
    }
    
    public abstract int getTotalCharge();
    
  final public int generateID(){
           return (int) (1000 + (Math.random()*((9999 - 1000)+ 1)));
    }

    
    
}
