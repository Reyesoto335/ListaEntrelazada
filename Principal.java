
import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static Lista lista = new Lista();
    
    public static void main(String[] args) {
        Menu();
        
        
       /* Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("Hola");
        
        primer.EnlazarSiguiente(segundo);
        primer.ObtenerSiguiente().EnlazarSiguiente(tercer);
        
        System.out.println(primer.ObtenerValor().toString());
        System.out.println(primer.ObtenerSiguiente().ObtenerValor().toString());
        System.out.println(primer.ObtenerSiguiente().ObtenerSiguiente().ObtenerValor().toString());*/
    }
    
    public static void Menu(){
        Boolean exit = false;
        int eleccion;
        
        while (!exit){
            System.out.println("1  =  Añadir");
            System.out.println("2  =  Mostar");
            System.out.println("3  =  Exit");
            
            eleccion = sc.nextInt();
            
            switch(eleccion){
                case 1:
                    Añadir();
                    break;
                case 2:
                    Mostrar();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void Añadir(){
        Object elemento;
        
        System.out.println("Ingrese el elemento: ");
        elemento = sc.nextShort();
        lista.AgregarInicio(elemento);
        
    }
    
    public static void Mostrar(){
        lista.MostrarLista();
    }
}
