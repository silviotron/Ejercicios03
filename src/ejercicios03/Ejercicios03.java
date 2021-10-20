/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicios03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entradaUsuario;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        do{
            System.out.println("**************************************************");
            System.out.println("*  1. Suma pares de entre 20 y un número         *");
            System.out.println("*  2. Suma de los N primeros números             *");
            System.out.println("*  3. suma de dígitos                            *");
            System.out.println("*  4. Tablas de multiplicar                      *");
            System.out.println("*  5. Primo o no                                 *");
            System.out.println("*  6. Factorial                                  *");
            System.out.println("*  7. Fibonacci                                  *");
            System.out.println("*  8. Inversión                                  *");
            System.out.println("*  9. (opcional)                                 *");
            System.out.println("* 10. (opcional)                                 *");
            System.out.println("* 11. (opcional)                                 *");
            System.out.println("*  0. Salir                                      *");
            System.out.println("**************************************************");
            entradaUsuario = teclado.nextLine();
            switch(entradaUsuario){
                case "1":
                    ejercicio01();
                    break;
                case "2":
                    ejercicio02();
                    break;
                case "3":
                    ejercicio03();
                    break;
                case "4":
                    ejercicio04();
                    break;
                case "5":
                    ejercicio05();
                    break;
                case "6":
                    ejercicio06();
                    break;
                case "7":
                    ejercicio07();
                    break;
                case "8":
                    ejercicio08();
                    break;
                case "9":
                    ejercicio09V2();
                    break;
                case "10":
                    ejercicio10();
                    break;
                case "11":
                    ejercicio11();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(!entradaUsuario.equals("0"));
        

    }
    
    public static void ejercicio01(){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Por favor, inserte un número natural");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 0){
                System.out.println("ERROR: Debe insertar un número natural.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);
        System.out.println("El resultado es: " + sumaPares(numUsuario));
    }    
    public static int sumaPares(int n){
        if(n <= 20){
            if(n % 2 != 0){
                n++;
            }
            int resultado = 0;
            for(int i = n; i <= 20; i = i+2){
                resultado += i;
            }
            return resultado;
        }
        else{
            if(n % 2 != 0){
                n--;
            }
            int resultado = 0;
            for(int i = n; i >= 20; i -= 2){
                resultado += i;
            }
            return resultado;
        }
    }

    public static void ejercicio02(){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Por favor, inserte un número natural");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 0){
                System.out.println("ERROR: Debe insertar un número natural.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);
        System.out.println("El resultado es: " + sumaNumeros(numUsuario));        
    }
    public static int sumaNumeros(int n){
        int resultado = 0;
        for(int i = 1; i <= n; i++){
            resultado += i;
        }
        return resultado;
    }
    
    public static void ejercicio03(){
                Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Por favor, inserte un número de más de 2 digitos");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 10){
                System.out.println("ERROR: Debe insertar un número natural.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 10);
        System.out.println("la suma de sus digitos es: " + sumaDigitos(numUsuario));
    }
    public static int sumaDigitos(int n){
        int resultado = 0;
        while(n > 0){
            int r = n%10;
            n = n/10;            
            resultado = resultado + r;
        }
        return resultado;
    }
    
    public static void ejercicio04(){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Por favor, inserte un número del 1 al 10");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 1 && 10 > numUsuario){
                System.out.println("ERROR: Debe insertar un número del 1 al 10.\n");
            }
            sc.nextLine();
        }
        while(numUsuario > 1 && 10 < numUsuario);
        System.out.printf("la tabla del %s es:\n", numUsuario);
        System.out.printf("%s x 1  = %s\n", numUsuario, numUsuario);
        System.out.printf("%s x 2  = %s\n", numUsuario, numUsuario * 2);
        System.out.printf("%s x 3  = %s\n", numUsuario, numUsuario * 3);
        System.out.printf("%s x 4  = %s\n", numUsuario, numUsuario * 4);
        System.out.printf("%s x 5  = %s\n", numUsuario, numUsuario * 5);
        System.out.printf("%s x 6  = %s\n", numUsuario, numUsuario * 6);
        System.out.printf("%s x 7  = %s\n", numUsuario, numUsuario * 7);
        System.out.printf("%s x 8  = %s\n", numUsuario, numUsuario * 8);
        System.out.printf("%s x 9  = %s\n", numUsuario, numUsuario * 9);
        System.out.printf("%s x 10 = %s\n", numUsuario, numUsuario * 10);
        
    }
    
    public static void ejercicio05(){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Por favor, inserte un número natural");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 0){
                System.out.println("ERROR: Debe insertar un número natural.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);        
        System.out.printf("el numero %s %s es primo\n", numUsuario, calcularPrimo(numUsuario));
    }
    public static String calcularPrimo(int n){
        if(n == 1){
            return "no";
        }
        else if(n != 2 && n % 2 == 0){
            return "no";
        }
        int i = 3;
        int resto;
        while(i < n){            
            resto = n % i;
            i = i+2; 
            if(resto == 0){
                return "no";
            }
                       
        }
            return "si";
        
    }
    
    public static void ejercicio06(){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Por favor, inserte un número natural");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 0){
                System.out.println("ERROR: Debe insertar un número natural.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);
        System.out.printf("El factorial de %s es: %s\n", numUsuario, factorial(numUsuario));        
        
    }
    public static long factorial(long n){        
        if(n > 0){
            long i = n-1;  
            while(i > 0){             
                n = n * i; 
                i = i-1;            
            }
            return n;
        }
        else return 0;
    }
    
    public static void ejercicio07(){
        Scanner sc = new Scanner(System.in);
        System.out.println("0");
        String numUsuario;
        long num1 = 0;
        long num2 = 1;
        long numResult;
        String resultado= "0";
        do{
            System.out.println("**************************************************");
            System.out.println("* 1 - Calcular siguiente número                  *"); 
            System.out.println("* 2 - salir                                      *");
            System.out.println("**************************************************");
            numUsuario = sc.nextLine();
            switch(numUsuario){
                case "1":
                    numResult = num1 + num2;
                    resultado = resultado + " " + numResult;
                    System.out.println(resultado);
                    num2 = num1;
                    num1 = numResult;
                                        
                case "2":
                    break;
                default:
                    System.out.println("Opción incorrecta!");
                        
            }            
        }
        while(!numUsuario.equals("2"));
        
    }

    public static void ejercicio08(){
        Scanner sc = new Scanner(System.in);
        double inversion = -1;
        do{
            System.out.println("Introduzca la inversión:");
            if(sc.hasNextInt()){
                inversion = sc.nextInt();                
            }
            if(inversion < 0){
                System.out.println("ERROR.\n");
            }
            sc.nextLine();
        }
        while(inversion < 0);
        int tiempo = -1;
        do{
            System.out.println("Introduzca los años:");
            if(sc.hasNextInt()){
                tiempo = sc.nextInt();                
            }
            if(tiempo < 0){
                System.out.println("ERROR.\n");
            }
            sc.nextLine();
        }
        while(tiempo < 0);
        System.out.printf("si invierte %,.2f€ la ganancia que tendra tras %s años es de %,.2f€\n",inversion, tiempo, calcInversion(inversion, tiempo)-inversion);
        
    }
    public static double calcInversion(double inversion, int t){
        t = t * 12;
        for(int i = 0; i < t; i = i++){           
            inversion = inversion * (1.0 + (0.02 / 12.0));
        }        
        return inversion;
    }
    
    public static void ejercicio09(){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Introduzca un numero:");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 0){
                System.out.println("ERROR.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);
        System.out.printf("%s es palíndromo\n", palindromo(numUsuario));
    }
    public static String palindromo(int n){
        int nCifras = 0;
        int primero;
        int ultimo;
        double f;
        do{
            nCifras = 0;
            int n1 = n; 
            while(n1 > 0){            
            n1 = n1/10;
            nCifras++;
            }
            f = Math.pow(10, (nCifras-1));
            primero = n / (int)f;
            ultimo = n % 10;
            if(primero != ultimo){
                return "no";
            }
            n = (n - primero * (int)f) / 10;

            }
        while(nCifras > 1);
        return "si";                
        
    }
    public static void ejercicio09V2(){
        Scanner sc = new Scanner(System.in);
        int numUsuario = -1;
        do{
            System.out.println("Introduzca un numero:");
            if(sc.hasNextInt()){
                numUsuario = sc.nextInt();                
            }
            if(numUsuario < 0){
                System.out.println("ERROR.\n");
            }
            sc.nextLine();
        }
        while(numUsuario < 0);
        System.out.printf("%s es palíndromo\n", palindromoV2(numUsuario));        
    }
    public static String palindromoV2(int n){
        int nNormal = n;
        int nInvert = 0;
        while(n > 0){
            nInvert = nInvert * 10 + (n % 10);
            n = n / 10;        
        }
        if(nInvert == nNormal){
            return "si";
        }
        else{
            return "no";
        }
        
    }
    
    public static void ejercicio10(){
        
    }
    
    public static void ejercicio11(){
        
    }
    public static int numDigitos(int n){
    int i = 1;
    while(n < 9){
    i++;    
    }
    return i;
    }
    public static boolean armstrong(int n){
        int ni = n;
        int f = 0;
        int d = numDigitos(n);
        double na = 0;
        for(int i = 0;i < d; i++){
        f = n % 10;
        na = na + Math.pow(f, d);
        n = n / 10;
        }
        if(ni == na){
            return true;
        }
        else{
        return false;
        }    
    }
   
}
