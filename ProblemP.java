import java.util.Scanner; 

public class Main{
	public static void main(String[] args){
		float n1,n2,n3,n4,media;
		Scanner myObj = new Scanner(System.in);
		System.out.print("digite o valor da primeira nota de 1 a 10 ");     n1 = myObj.nextFloat();
		System.out.print("digite o valor da segunda nota de 1 a 10 ");      n2 = myObj.nextFloat();
		System.out.print("digite o valor da terceira nota de 1 a 10 ");     n3 = myObj.nextFloat();
		System.out.print("digite o valor da quarta nota de 1 a 10 ");       n4 = myObj.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >= 6){
				System.out.print("o aluno foi aprovado!");
		}
		else{
		    System.out.print("o aluno foi reprovado!");
		}
	}
}
