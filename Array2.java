/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Array2
{
	public static void main(String[] args) {
		int[] numeros = new int[5];
	Scanner ler = new Scanner(System.in);
	//entrada de dados
	for(int i=0; i<numeros.length; i++){
	    System.out.println("Digite o " +(i+1)+ "numero: ");
	    numeros[i] = ler.nextInt();
	}
		
		for(int i=0; i<numeros.length; i++){
		    System.out.println("O " + (i+1) + " número é: " + numeros[i]);
		}
	}
}