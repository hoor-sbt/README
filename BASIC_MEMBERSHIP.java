
package gym;


final public class BASIC_MEMBERSHIP extends GymMembership {
    private int monthlyCharge;
    private boolean swimming;

  public BASIC_MEMBERSHIP (String name, int numOfMonths , boolean swimming){
      super(name);
      setNumOfMonths(numOfMonths);
      this.swimming=swimming;
  }
   

    public int getMonthlyCharge() {
        return monthlyCharge;
    }

    public boolean isSwimming() {
        return swimming;
    }

    public void setMonthlyCharge(int monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }
    
    @Override
    public int getTotalCharge() {
      return getMonthlyCharge()*super.getNumOfMonths()+200;
    }

@Override
public String toString (){
      return String.format("Member type %s%n Mmber name %s%n member id: %d%n total charge", "VIP", getName(), getId(), getTotalCharge()); 
}
    
}
