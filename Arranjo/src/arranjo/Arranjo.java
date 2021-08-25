/**
 * 
 */
package arranjo;

import java.util.Arrays;


/**
 * @author Marcelo Campos RA:1905076
 * Paulo Ricardo Costa da Silva RA:1905013
 * Geovane Laera RA:1902679
 * 
 *
 */
public class Arranjo {
	Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

	public Integer menor() {
		Arrays.sort(a);
		
		int min =a[0];
	    return min;
	}

	public Integer maior() {
		Arrays.sort(a);
		
		int max =a[a.length-1];
	    return max;
	}

	public Integer soma() {
		int sum = 0;
		for (int value: a) {
			sum += value;
		}		
		return sum;
	}

	public Integer repeticoes(int i) {
		int count = 0;
	      for(int item : a)
	      {
	         if(item == i)
	         {
	            count++;
	         }
	      }
	      return count;
	}

}
