import java.util.Scanner;

public class tiposprimitivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome2 = teclado.nextLine();
		String nome = "Higor";
		float nota2 = teclado.nextFloat();
		float nota = 9.4f;
		System.out.println("A nota é "+nota);
		System.out.printf("A nota é %.2f\n",nota); //print formatado
		System.out.printf("A nota de %s é de %f\n", nome, nota);
		System.out.printf("A nota de %s é de %f", nome2, nota2);
		
	}
}
