import java.util.Scanner; 

public class Main{
	public static void main(String[] args){
		int v1,v2,v3,v4,v5,maior,menor;
		Scanner myObj = new Scanner(System.in);
		System.out.print("digite o primeiro valor: ");  v1 = myObj.nextInt();
		maior = v1; menor = v1;
		System.out.print("digite o segundo valor: ");   v2 = myObj.nextInt();
		if (v2 < menor){
		    menor = v2;
		}
		if (v2 > maior){
		    maior = v2;
		}
		System.out.print("digite o terceiro valor: ");  v3 = myObj.nextInt();
		if (v3 < menor){
		    menor = v3;
		}
		if (v3 > maior){
		    maior = v3;
		}
		System.out.print("digite o quarto valor: ");    v4 = myObj.nextInt();
		if (v4 < menor){
		    menor = v4;
		}
		if (v4 > maior){
		    maior = v4;
		}
		System.out.print("digite o quinto valor: ");    v5 = myObj.nextInt();
		if (v5 < menor){
		    menor = v5;
		}
		if (v5 > maior){
		    maior = v5;
		}
		System.out.printf("o maior valor digitado foi: " + maior + '\n');
		System.out.printf("o menor valor digitado foi: " + menor);
	}
}
