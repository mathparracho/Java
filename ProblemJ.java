import java.util.Scanner;
public class Main {
    
    
	public static void main(String[] args){
	    
	    int opcao, idade, sexo, cmulher, chomem;
        float salario,sumsalary, avg, perc, cforty, cfunc;
        cfunc = 0; cmulher = 0; chomem = 0; sumsalary = 0; cforty = 0;
	   
	    boolean check = false;
	    while (!check){

    		
    		Scanner myObj = new Scanner(System.in);
    		System.out.print("\t\t\t M E N U D E O P Ç Õ E S \n\n");
    		System.out.print("  1 - Insira dados de um funcionário \n");
    		System.out.print("  2 - Informe a soma dos salários \n");
    		System.out.print("  3 - Informe a quantidade de funcionários lidos \n");
    		System.out.print("  4 - Informe a quantidade de funcionários do sexo masculino lidos \n");
    		System.out.print("  5 - Informe a quantidade de funcionários do sexo feminino lidos \n");
    		System.out.print("  6 - Saia da Estrutura de Repetição! \n");
    		System.out.print("Informe a opção: ");
    		opcao = myObj.nextInt(); System.out.print("\n");
    		
    		
    		switch(opcao) {
            case 1:
                cfunc++;
                
                System.out.print("Informe a idade: ");  idade = myObj.nextInt();
                System.out.print("Informe a sexo (0 - Masculino / 1 - Feminino): ");  sexo = myObj.nextInt();
                System.out.print("Informe o salário bruto: ");  salario = myObj.nextFloat();
                
                sumsalary += salario;
                if (sexo == 1) cmulher++; else chomem++;
                if (idade >= 40) cforty++;
                break;
            case 2:
                System.out.printf("Soma de salários = %.2f",sumsalary);
                System.out.print("\n");
                break;
            case 3:
                System.out.printf("Quantidade de funcionários = %d",cfunc);
                System.out.print("\n");
                break;
            case 4:
                System.out.printf("Quantidade de Funcionários do sexo Masculino =  %d",chomem);
                System.out.print("\n");
                break;
            case 5:
                System.out.printf("Quantidade de Funcionários do sexo Feminino =  %d",cmulher);
                System.out.print("\n");
                break;
            case 6:
                System.out.print("Saindo do Menu...");
                
                if (cfunc==0){
                    System.out.print("Nenhum funcionário foi adicionado!");
                    check = true;
                    break;
                }else{
                    avg = sumsalary / cfunc;
                    perc = (cforty / cfunc) * 100;
                    System.out.print("Últimas informações!\n");
                    System.out.printf("Soma de salários = %.2f \n",sumsalary); 
                    System.out.printf("Quantidade de funcionários = %f \n",cfunc);
                    System.out.printf("Quantidade de Funcionários do sexo Masculino =  %d \n",chomem);
                    System.out.printf("Quantidade de Funcionários do sexo Feminino =  %d \n",cmulher);
                    System.out.printf("Quantidade de Funcionários com mais de 40 anos =  %f \n",cforty);
                    System.out.printf("Média de salários =  %.2f \n",avg);
                    System.out.printf("Porcentagem de Funcionários com mais de 40 anos = %.1f%s \n",perc,"%");
                    check = true;
                    break;
                }
            default:
                System.out.print("Opção Inválida! \n\n");
		    }    
		}
	}
}
