
public class AutoOhjelma {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		auto1.tankkaa(5);
		auto1.naytaTiedot();
		
		Auto auto2 = new Auto("Jaguar", "XE", 30);
		
		auto2.naytaTiedot();

	}

}//mainin loppu

 class Auto{

	 public String merkki;
	 public String malli;
	 public int bensanMaara;
	 
	 public Auto() {
		 
		 merkki = "";
		 malli = "";
		 bensanMaara = 0;
	 }
	 
	 public Auto(String brand, String model, int fuelValue) {
		 
		 merkki = brand;
		 malli = model;
		 bensanMaara = fuelValue;
		 
	 }
	 
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
	 
	 public void tankkaa(int tankkaus) {
		 
		 bensanMaara = bensanMaara + tankkaus;
	 }
	 
}