
public class AutoOhjelma {

	public static void main(String[] args) {
		

	}

}//mainin loppu

class Auto{

	 public String merkki;
	 public String malli;
	 public int bensanMaara;
	 
	 
public void jarruta() {
		 
		 System.out.println("Auto jarruttaa");
	 }
	 
	 public void kiihdyta() {
		 
		 if (bensanMaara > 0) {
		 System.out.println("Auto kiihtyy");
		 
		 bensanMaara = bensanMaara -1;
		 }
		 
		 else {
			 System.out.println("Tankkaa auto");
		 }
		 
	 }
	 
	 public void naytaTiedot() {
		 
		 System.out.println("Auton merkki: " + merkki);
		 System.out.println("Auton malli: " + malli);
		 System.out.println("Polttoainetta tankissa: " + bensanMaara + " litraa");
	 }
	 
}
