/**
 * Using single-character output statements, write a program that produces
 * an upside down pyramid.
 * 
 * ex: 	*******
 * 		 *****
 *        ***
 *         *
 *      
 * @author joshventocilla
 */
public class UpsideDownPyramid {
	
	public void printPyramid() {
		
		final int ROW = 10;
		
		for(int i=ROW; i>0; i--) {		// ROW
			
			/* print out the I */
			for(int j=0; j<i;j++) {		// COLUMN
				System.out.print("I");	
			}
			
			System.out.println();
			
			/* print out the spaces */
			for(int k=0; k<=ROW-i; k++) {
				System.out.print(" ");
				k++;
			}
			
			i--;
			
		}
		
	}

}
