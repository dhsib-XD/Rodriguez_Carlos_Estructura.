/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_carlos_estructura;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosXl
 */
import java.util.Scanner;
import java.util.Random;

public class Rodriguez_Carlos_Estructura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] optionCounts = new int[4];
        int opciones = 0;

        while (true) {
            System.out.println("Favor seleccionar una opcion\n"
                    + "1. Palabra Alrevez\n"
                    + "2. Numeros Perfectos\n"
                    + "3. Primos\n"
                    + "4. Votaciones\n"
                    + "5. Salir");
            System.out.print("Su eleccion es: ");
            opciones = scanner.nextInt();

            if (opciones == 5) {
                break; // Exit the loop
            }

            switch (opciones) {
                case 1:
                    optionCounts[0]++;
                    System.out.print("Ingrese una palabra: ");
                    String palabra = scanner.next();
                    String palabraInvertida = new StringBuilder(palabra).reverse().toString();
                    System.out.println("La palabra al reves es: " + palabraInvertida);
                    break;

                case 2:
                    optionCounts[1]++;
                    System.out.print("Ingresar un numero: ");
                    int numero = scanner.nextInt();
                    int sumaDivisores = 0;
                    for (int i = 1; i < numero; i++) {
                        if (numero % i == 0) {
                            sumaDivisores += i;
                        }
                    }
                    System.out.println(numero + (sumaDivisores == numero ? " es un numero perfecto." : " no es un numero perfecto."));
                    break;

                case 3:
                    optionCounts[2]++;
                    Random random = new Random();
                    int numAleatorio = random.nextInt(100) + 1;
                    System.out.print("Divisores de " + numAleatorio + " son: ");
                    int divisores = 0;
                    for (int i = 1; i <= numAleatorio; i++) {
                        if (numAleatorio % i == 0) {
                            divisores++;
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    System.out.println(numAleatorio + (divisores == 2 ? " es primo." : " no es primo."));
                    break;

                case 4:
                    optionCounts[3]++;
                    System.out.print("Ingrese la cantidad de votantes en el pais: ");
                    int totalVotantes = scanner.nextInt();
                    int Azul = 0, Rojo = 0, Negro = 0, Amarillo = 0, Nulo = 0;
                    for (int i = 1; i <= totalVotantes; i++) {
                        System.out.print("Ingrese el voto #" + i + " (AZUL, ROJO, NEGRO, AMARILLO): ");
                        String voto = scanner.next().toUpperCase();
                        switch (voto) {
                            case "AZUL": Azul++; break;
                            case "ROJO": Rojo++; break;
                            case "NEGRO": Negro++; break;
                            case "AMARILLO": Amarillo++; break;
                            default: Nulo++; System.out.println("Voto nulo."); break;
                        }
                    }
                    double porcentajeVotosValidos = ((double) (Azul + Rojo + Negro + Amarillo) / totalVotantes) * 100;
                    if (porcentajeVotosValidos < 60) {
                        System.out.println("VOTACION FALLIDA");
                    } else {
                        String ganador = (Azul > Rojo && Azul > Negro && Azul > Amarillo) ? "AZUL" :
                                         (Rojo > Azul && Rojo > Negro && Rojo > Amarillo) ? "ROJO" :
                                         (Negro > Azul && Negro > Rojo && Negro > Amarillo) ? "NEGRO" : "AMARILLO";
                        System.out.println("La planilla ganadora es: " + ganador);
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        // Print counts of options selected
        System.out.println("Conteo de opciones seleccionadas:");
        System.out.println("Palabra Alrevez: " + optionCounts[0]);
        System.out.println("Numeros Perfectos: " + optionCounts[1]);
        System.out.println("Primos: " + optionCounts[2]);
        System.out.println("Votaciones: " + optionCounts[3]);
    }
}

             
             
                   
             
         
            
         
             
            
           
            
         
        
         
         
        
        
     
        
        
        
            
        
        
    
    

