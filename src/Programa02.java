/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 02: Construa um programa que receba como entrada três valores A, B
 e C e os imprima em ordem crescente.
 * Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa02 {

public static void main(String[] args) throws Exception {
//Declarando as variaveis. 
double numeroA;
double numeroB;
double numeroC;
Scanner teclado = new Scanner(System.in);

//Fazendo a entrada dos dados. 
System.out.println("Digite o primeiro numero: ");
numeroA = teclado.nextDouble();
System.out.println("Digite o segundo numero: ");
numeroB = teclado.nextDouble();
System.out.println("Digite o terceiro numero: ");
numeroC = teclado.nextDouble();
teclado.close();

//Processamento e tomada de decisões.
if (numeroA <= numeroB && numeroB <= numeroC){
    System.out.println("Os numeros em ordem crescente são: " + numeroA + ", " + numeroB + " e " + numeroC);
}
else if (numeroA <= numeroC && numeroC <= numeroB){    
    System.out.println("Os numeros em ordem crescente são: " + numeroA + ", " + numeroC + " e " + numeroB);
}
else if (numeroB <= numeroA && numeroA <= numeroC){
    System.out.println("Os numeros em ordem crescente são: " + numeroB + ", " + numeroA + " e " + numeroC);
}
else if (numeroB <= numeroC && numeroC <= numeroA){
    System.out.println("Os numeros em ordem crescente são: " + numeroB + ", " + numeroC + " e " + numeroA);
}
else if (numeroC <= numeroA && numeroA <= numeroB){
    System.out.println("Os numeros em ordem crescente são: " + numeroC + ", " + numeroA + " e " + numeroB);
}
else{
    System.out.println("Os numeros em ordem crescente são: " + numeroC + ", " + numeroB + " e " + numeroA);
        }
     }
}