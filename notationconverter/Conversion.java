public class Conversion {
	
	private int unconverted;
	private String hexConverted;
	private String binConverted;
	private String octConverted;
	private String decConverted;
	
	public Conversion(int unconverted) {
		this.unconverted = unconverted;
		
		hexConverted = "";
		hexConversion(unconverted);
		
		binConverted = "";
		binConversion(unconverted);
		
		octConverted = "";
		octConversion(unconverted);
		
		decConverted = "";
		decConversion(unconverted);
	}
	
	private void hexConversion(int uncoverted) {
		hexConverted = Integer.toHexString(unconverted).toUpperCase();
	}
	
	public String getHexConversion() {
		return hexConverted;
	}
	
	private void binConversion(int uncoverted) {
		binConverted = Integer.toBinaryString(unconverted).toUpperCase();
	}
	
	public String getBinConversion() {
		return binConverted;
	}
	private void octConversion(int uncoverted) {
		octConverted = Integer.toOctalString(unconverted).toUpperCase();
	}
	
	public String getOctConversion() {
		return octConverted;
	}
	
	private void decConversion(int uncoverted) {
		decConverted = String.valueOf(unconverted);
	}
	
	public String getDecConversion() {
		return decConverted;
	}
}