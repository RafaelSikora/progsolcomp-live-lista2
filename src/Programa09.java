/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 09: Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%.
Venda a Prazo 30 dias - desconto de 5%.
Venda a Prazo 60 dias - mesmo preço.
Venda a Prazo 90 dias - acréscimo de 5%.
Venda com cartão de débito - desconto de 8%.
Venda com cartão de crédito - desconto de 7%.
* Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa09 {
    public static void main(String[] args) throws Exception {
        
  //Declarando as variaveis. 
  double valorVenda;
  int opcao;
  double valorFinal = 0;
  Scanner teclado = new Scanner (System.in);

  //Entrada de dados.
  System.out.print("Digite o valor da venda: ");
  valorVenda = teclado.nextDouble();
  System.out.println("Selecione a condição de pagamento:");
  System.out.println("1 - Venda à vista (desconto de 10%)");
  System.out.println("2 - Venda a prazo 30 dias (desconto de 5%)");
  System.out.println("3 - Venda a prazo 60 dias (mesmo preço)");
  System.out.println("4 - Venda a prazo 90 dias (acréscimo de 5%)");
  System.out.println("5 - Venda com cartão de débito (desconto de 8%)");
  System.out.println("6 - Venda com cartão de crédito (desconto de 7%)");
  opcao = teclado.nextInt();
  teclado.close();

//Processamento e tomada de decisoes.
switch (opcao) {
    case 1:
        valorFinal = valorVenda * 0.9;
        break;
    case 2:
        valorFinal = valorVenda * 0.95;
        break;
    case 3:
        valorFinal = valorVenda;
        break;
    case 4:
        valorFinal = valorVenda * 1.05;
        break;
    case 5:
        valorFinal = valorVenda * 0.92;
        break;
    case 6:
        valorFinal = valorVenda * 0.93;
        break;
    default:
        System.out.println("Opção inválida!");
        System.exit(0);
}

System.out.printf("Valor final da venda: R$ %.2f", valorFinal);
    }
}