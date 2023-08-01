package pacote;


import java.util.Scanner;


public class CalculadoraSwitch{

	public static void main(String[] args) {

		// Problema: elabore uma solu��o para implementar uma calculadora das 04 opera��es b�sicas: somar, dividir, subtrair e multiplicar 
		//utilizando a estrutura switch/case. Nessa solu��o o usu�rio dever� informar apenas dois valores e escolher a opera��o que deseja realizar e
		//em um menu de op��es elaborado com switch/case. Para essa solu��o, considere os seguintes crit�rios:
		//a) O usu�rio dever� informar valores dentro de um intervalo fechado de 1 a 100
		//b) No caso da divis�o � poss�vel que o resultado seja um valor decimal
		//c) Caso o usu�rio escolha uma opera��o diferente das disponibilizadas, o resultado dever� ser opera��o inv�lida.
		Scanner sc = new Scanner(System.in); // C�DIGO PARA PEGAR DADOS DO CONSOLE.	
		double valor1, valor2, resultado; // DEFININDO VARI�VEIS
		int operacao;
		System.out.println("Informe seu primeiro valor dentro de um intervalo fechado de 1 a 100"); // PEGANDO PRIMEIRO VALOR INFORMADO PELO USU�RIO
		valor1 = sc.nextDouble(); // GUARDANDO VALOR INFORMADO
		System.out.println("Informe seu segundo valor dentro de um intervalo fechado de 1 a 100"); // PEGANDO SEGUNDO VALOR INFORMADO PELO USU�RIO
		valor2 = sc.nextDouble();
		if (valor1 >= 1 && valor1 <= 100              // COLOCANDO CONDI��O NOS VALORES
				&& valor2 >= 1 && valor2 <=100) {


			System.out.print("aperte o bot�o indicado para escolher uma das 4 opera��es" // PEDINDO AO USU�RIO PARA ESCOLHER UMA DAS 04 OPERA��ES  

					+ "\n(1) SOMA"
					+ "\n(2) SUBTRA��O"
					+ "\n(3) MULTIPLICA��O"
					+ "\n(4) DIVIS�O");


			operacao = sc.nextInt(); // SALVANDO VALOR EM OPERA��O


			switch(operacao) {      // COLOCANDO O C�DIGO SWITCH PARA ORGANIZAR AS OPERA��ES


			case 1:
				resultado = valor1 + valor2 ;
				System.out.println("Resultado da soma = " + resultado);
				break;



			case 2:
				resultado = valor1 - valor2 ;
				System.out.println("Resultado da subtra��o = " + resultado);
				break;


			case 3:
				resultado = valor1 * valor2 ;
				System.out.println("resultado da multiplica��o = " + resultado);
				break;


			case 4:
				resultado = valor1 / valor2 ;
				System.out.println("resultado da divis�o = " + resultado);
				break;


			default:
				System.out.println("Opera��o inv�lida!!!");
			}


		}else{


			System.out.println("opera��o inv�lida");


			sc.close();


		}

	}

}
