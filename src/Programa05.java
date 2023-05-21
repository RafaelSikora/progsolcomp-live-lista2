/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 05: Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.
 * Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        
//Declarando as variaveis.
String nome;
String sobrenome;
int idade;
String naturalidade;
char opcao;
Scanner teclado = new Scanner (System.in);

//Entrada de dados.
    System.out.println("Digite seu nome: ");
    nome = teclado.nextLine();
    System.out.println("Digite seu sobrenome: ");
    sobrenome = teclado.nextLine();
    System.out.println("Digite sua idade: ");
    idade = teclado.nextInt();
    System.out.println("Digite sua naturalidade: ");
    naturalidade = teclado.nextLine();
    System.out.println("Deseja vizualizar os dados completos? (S para sim e N para não).");
    opcao = teclado.nextLine().charAt(0);
teclado.close();

//Processamento e tomada de decisões.
if (opcao == 'S' || opcao == 's') {
    System.out.println("Nome: " + nome + " " + sobrenome);
    System.out.println("Idade: " + idade + " anos");
    System.out.println("Naturalidade: " + naturalidade);
} else if (opcao == 'N' || opcao == 'n') {
    System.out.println("Nome: " + nome + " " + sobrenome);
    System.out.println("Idade: " + idade + " anos");
} else {
    System.out.println("Digitação errada. Tente Novamente.");
        }
    }
}
