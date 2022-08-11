
package gym;

public class Vipmembership extends GymMembership {

    private int monthlyCharge;

    public Vipmembership(String name) {
        super(name);
        setNumOfMonths(12);
        setMonthlyCharge(1000);
    }

    public void setMonthlyCharge(int monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public int getMonthlyCharge() {
        return monthlyCharge;
    }
    
    
    
    @Override
    public String toString() {
        return String.format("Member type %s%n Mmber name %s%n member id: %d%n total charge", "VIP", getName(), getId(), getTotalCharge()); 
    }

    @Override
    public int getTotalCharge() {
        return getMonthlyCharge()*super.getNumOfMonths();
    }
    
}
