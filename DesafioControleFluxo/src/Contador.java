import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intervalo de intercessão entre dois números");
		try {
		System.out.println("Digite o primeiro número:");
		int primeiroNumero = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int segundoNumero = sc.nextInt();
			contar(primeiroNumero, segundoNumero);
		}catch(InputMismatchException e) {
			System.out.println("Você deve inserir apenas números inteiros!");
		}catch(ParametrosInvalidosException e) {
			System.out.println("O primeiro número deve ser maior que o segundo!");
		}finally {
			System.out.println("FIM");
		}
		
	}
	static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
		if(primeiroNumero > segundoNumero) {
			throw new ParametrosInvalidosException("O primeiro Número deve ser menor que o segundo!");
		}
		else {
		for(int i = primeiroNumero; i <= segundoNumero; i++) {
			System.out.println(i);
			}
		}
	}
	
	
	
	}