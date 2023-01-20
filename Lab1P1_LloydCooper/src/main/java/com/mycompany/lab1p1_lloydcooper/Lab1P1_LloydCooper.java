package com.mycompany.lab1p1_lloydcooper;

/**
 *
 * @author Fam. Cooper
 */
import java.util.Scanner;

public class Lab1P1_LloydCooper {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        // != significa distinto de
        while (opcion != 4) {
            System.out.println("Menu");
            System.out.println("1. Socios");
            System.out.println("2. Determinar mayor");
            System.out.println("3. Triangulo o no");
            System.out.println("4. Salir");
            
            //Leyendo un entero desde Scanner y almacenandolo en la variable opcion 
            opcion = leer.nextInt();
            
            //Este cambio solo esta en el segundo commit
            if (opcion == 1) {
                int grado = -1;
                float total = 0.0f;
                int repetir = 1;
                
                while (repetir != 0) {
                    System.out.println("Ingrese el grado del socio: ");
                    grado = leer.nextInt();
                    System.out.println("Ingrese el total de la compra: ");
                    total = leer.nextFloat();
                    
                    //1 - Porcentaje 
                    if (grado == 0) {
                        total = total;        
                    } else if (grado ==1) {
                        total = 0.9f * total;
                    } else if (grado == 2) {
                        total = 0.85f * total;
                    } else if (grado == 3) {
                        total = 0.75f * total;   
                    } else {
                        System.out.println("El grado ingresado no es valido. ");         
                    }
         
                    System.out.println("Total a pagar: " +total);
                    
                    System.out.println("Desea calcular el total a pagar de otro cliente? [1/0]: ");
                    repetir = leer.nextInt();
                }
                
            } else if (opcion == 2) {
                int num_mayor = Integer.MIN_VALUE; // Inicializa variable para guardar el número mayor
                int repetir = 1;
                while (repetir != 0) {
                    System.out.print("Ingrese un número entero: ");
                    int num = leer.nextInt();
        
                    if (num > num_mayor) {
                        num_mayor = num;
                    }
        
                    System.out.print("¿Desea ingresar otro número? [1/0] ");
                    repetir = leer.nextInt();
                }
    
                System.out.println("El número más grande es: " + num_mayor);
            } else if (opcion == 3) {
                 while (true) {
            System.out.print("Ingrese el lado a: ");
            int a = leer.nextInt();
            System.out.print("Ingrese el lado b: ");
            int b = leer.nextInt();
            System.out.print("Ingrese el lado c: ");
            int c = leer.nextInt();
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Los lados ingresados SI forman un triángulo.");
            } else {
                System.out.println("Los lados ingresados NO forman un triángulo.");
            }
            System.out.print("¿Desea ingresar otras longitudes? [1/0] ");
            String respuesta = leer.next();
            if (!respuesta.equalsIgnoreCase("1")) {
                break;
            }
        }  
                
            } else if (opcion == 4) {
                System.out.println("Terminando ejecucion.");
            } else {
                System.out.println("La opcion ingresada no es valida.");
            }
        }           
    }               
}                   
