/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Array
{
	public static void main(String[] args) {
		int[] numeros = new int[5];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;	
		numeros[0] = 50;
		
		for(int i=0; i<numeros.length; i++){
		    System.out.println("O " + (i+1) + " número é: " + numeros[i]);
		}
	}
}