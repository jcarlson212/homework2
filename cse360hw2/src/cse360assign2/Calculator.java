/**
 * @author Jason Carlson
 * @class CSE 360
 * @instructor Debra Calliss
 * @assignment #2
 * @classID 344
 */



package cse360assign2;

/**
 * 
 * The Calculator class contains basic methods that a calculator would have.
 * This includes adding, subtracting, dividing.
 * 
 */
public class Calculator {

	private int total;
	
	/**
	 * Constructor for the calculator. Initializes total to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total 
	 * @return 0
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a given integer to the total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtracts a given integer from the total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies the total by a given value
	 * @param value
	 */
	public void multiply (int value) {
		total = total*value;
	}
	
	/**
	 * Divides the total by a given integer (uses integer division).
	 * If the parameter is 0, then it sets the total to zero
	 * @param value
	 */
	public void divide (int value) {
		
		if (value != 0) {
			
			total = total / value;
			
		}else {
			
			total = 0;
			
		}
		
	}
	
	/**
	 * Returns history
	 * @return string of history
	 */
	public String getHistory () {
		return "";
	}
	
}
