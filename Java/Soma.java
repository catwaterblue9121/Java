/******************************************************************************
Hello Java
*******************************************************************************/
import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
		double a, b, soma;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite io primeiro número: ");
		a= ler.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		b = ler.nextDouble();
		
		soma = a + b;
		
		System.out.println("A soma é: " + soma);
	}
}
