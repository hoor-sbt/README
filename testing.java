
package gym;

public class testing {
    public static void main(String[] args) {
    
       GymMembership obj = new  Vipmembership("GENIUS HOORY");
       
       GymMembership obj1 = new BASIC_MEMBERSHIP("loly", 1, true);
        GymMembership obj2 = new BASIC_MEMBERSHIP("loly", 1, false);
        
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
