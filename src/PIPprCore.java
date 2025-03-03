//package cpas;

public class PIPprCore {
	
	private int cod;
	
	public PIPprCore(int cod){
		this.cod = cod;
	}
	
	public int getCod(){
		return this.cod;
	}
	
	public void incrementareCod(){
		this.cod++;
	}
	
	/**
	 * calculeaza suma a doua numere
	 * @param x primul parametru
	 * @param y al doilea parametru
	 * @return	rezultat
	 */
	
	static public int sum(int x, int y){
		return x+y;
	}
	
	static public int sumElemente(final int[] lista){
		// ToDo: de implementat suma elementelor dintr-un masiv
		
		return 0;
	}
	
	static public boolean esteEmailValid(String email){
		// ToDo: de implementat verificarea unei adrese de mail
		return true;
	}
}
