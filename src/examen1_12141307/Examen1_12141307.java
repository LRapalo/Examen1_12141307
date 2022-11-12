package examen1_12141307;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen1_12141307 {
    static Scanner lea = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean Centinela = true;
        ArrayList listarobot = new ArrayList();
        int id = 0;
        int x = 0;
        int y = 0; 
        int año = 0;
        int capacidad = 0;
        servo_motores, llantas, velocidad = 0;
        boolean carga;
        double peso = 0;
        double altura = 0.0;
        
        while (Centinela == true){
            System.out.println("----MENU----\n"
                    + "1) Crear Robot\n"
                    + "2) Listar Robot\n"
                    + "3) Simulación\n"
                    + "4) Jugar\n"
                    + "------------");
            int Opcion = lea.nextInt();
            char mapa [][] = new char [8][8];
            mapa = Llenar (8,8);
            
            switch (Opcion){
                case 1: {
                    System.out.println("--Crear Robot--");
                    System.out.println("Ingrese el ID del Robot:");
                    id = lea.nextInt();
                    System.out.println("Ingrese el valor de X");
                    x = lea.nextInt();
                    System.out.println("Ingrese el valor de Y");
                    y = lea.nextInt();
                    carga = false;
                    System.out.println("Ingrese el año de fabricacion");
                    año = lea.nextInt();
                    System.out.println();
                    System.out.println("--TIPO DE ROBOT --\n"
                            + "1) Androide\n"
                            + "2) Mano Robotica\n"
                            + "3) Robot Movil Agil\n"
                            + "4) Robot Movil Pesado\n"
                            + "Ingrese el tipo que desea:");
                    int tipo = lea.nextInt();
                    
                    switch (tipo){
                        case 1: {
                            System.out.println("--Androide--");
                            capacidad = 2;
                            System.out.println("Ingrese la altura: ");
                            altura = lea.nextDouble();
                            System.out.println("Ingrese el peso: ");
                            peso = lea.nextDouble();
                            
                            break;
                        }
                        case 2: {
                            System.out.println("--Mano Robotica--");
                            capacidad = 1;
                            System.out.println("Ingrese cuantos servo motores tiene:");
                            servo_motores = lea.nextInt();                            
                            break;
                        }
                        case 3: {
                            System.out.println("--Robot Movil Agil--");
                            capacidad = 1;
                            System.out.println("Ingrese la cantidad de llantas: ");
                            llantas = lea.nextInt();
                            System.out.println("Ingrese la velociadad: ");
                            velocidad = lea.nextInt();                            
                            break;
                        }
                        case 4: {
                            System.out.println("--Robot Movil Pesado--");
                            capacidad = 5;
                            System.out.println("Ingrese el peso: ");
                            peso = lea.nextDouble();
                            break;
                        }
                    }
                    
                    break;
                }
                case 2: {
                    
                    break;
                }
                case 3: {
                    
                    break;
                }
                case 4: {
                    
                    break;
                }
                default :
                    System.out.println("Opcion ingresada es inexistente");
            }
        }
    }
    
    public static char [][]Llenar (int fila, int columna){
        char [][] mapa = new char [fila][columna];
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                mapa [2][6] = 'X';
                mapa [3][4] = 'X';
                mapa [0][7] = 'X';
                mapa [1][3] = 'X';
                mapa [4][5] = 'X';
                
                mapa [6][5] = 'C';
                mapa [1][6] = 'C';
                mapa [3][2] = 'C';
                mapa [5][7] = 'C';
                mapa [2][2] = 'C';
                
                mapa [7][7] = 'D';
                
                mapa [i][j] = ' ';
            }
        }
        return mapa;
    }
    
    public static void Imprimir (char [][] mapa){
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.println("[" + mapa[i][j] + "] ");
            }
            System.out.println();
        }
    }
    
}
