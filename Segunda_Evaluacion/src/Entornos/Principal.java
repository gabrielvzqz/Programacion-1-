package Entornos;

public class Principal {
	
	public static float add(float n1, float n2) {

		return n1 + n2;
	}
	public static char getFirstCharacterInUpperCase(String text) {
		
		if(text == null) return 0;

		if(text.equals("")) return 0;
		return text.toUpperCase().charAt(0);
	}
	public static float sum(float[] numberList) {
		if (numberList == null) return 0;
		if (numberList.length == 0) return 0;
		float acum = 0;
		for(int i=0; i<numberList.length; i++) {
			acum = acum +numberList[i];
		}
		return acum;
	}
	public static int getLargestValue(int[] values) {
		if (values==null) return 0; 
		int highest = 0;
		for (int i=0; i<values.length; i++) {
			if (values[i] > highest) {
				highest =values[i];
			}
		}
		 return highest;
	}
	public static void main(String[] args) {
		
	}
}
