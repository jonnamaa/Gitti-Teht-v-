
public class AutoAppi {

	public static void main(String[] args) {
	
		Auto auto1 = new Auto("Mersu", "SLK", 70);
		auto1.kiihdyta();
		auto1.naytaTiedot();
	}

} // end of AutoAppi

class Auto 
{
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public Auto()
	{
		merkki = "";
		malli = "";
		bensanMaara =0;
	}
	
	public Auto(String asetaMerkki, String asetaMalli, int asetaBensa)
	{
		merkki = asetaMerkki;
		malli = asetaMalli;
		bensanMaara = asetaBensa;
	}
	
	
	public void jarruta()
	{
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta()
	{
		if(bensanMaara > 0) {
			System.out.println("Auto kiihtyy");
			bensanMaara = bensanMaara -1;
		}
		else
		{
			System.out.println("Auto ei voi kiihty�, ei bensaa.");
		}
		
	}
	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan m��r�: " + bensanMaara);
	}
	
	public void tankkaa(int maara)
	{
		bensanMaara = bensanMaara + maara;
	}
} // end of Auto class



