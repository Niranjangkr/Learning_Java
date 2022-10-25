
public interface NSSActivities {
	public static final int extrahours=5;
	
	public abstract void bloodDonation(int hrs);
	public abstract void nationalDays(int hrs);
	 
	public default void rules(){
	  System.out.println("Rule1...");
	  System.out.println("Rule1...");
	  //extrahours=10;
	 }
}

