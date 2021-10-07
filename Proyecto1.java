package proyecto1;

import java.util.ArrayList;
import java.util.Scanner;
import static proyecto1.Vehiculo.agregarTodo;

public class Proyecto1 {
    public static ArrayList vehiculo = new ArrayList();

    public static void main(String[] args) {
        //arreglo para cada tipo de vehiculo
        Vehiculo[] taller = new Vehiculo[20];
        int i = 0;
        
        taller[i++] = new Automovil();
        taller[i++] = new Motocicleta();
        taller[i++] = new Camion();
        agregarTodo(taller);
    }
    
    public static void Menu(){
        System.out.println("Escoja el tipo de vehiculo");
        /*Vehiculo veh1 = obtenerVehiculo("Carro");
        Vehiculo veh2 = obtenerVehiculo("Moto");
        Vehiculo veh3 = obtenerVehiculo("Camion");
        
        System.out.println("Valor de carro " + veh1.obtenerTarifaGlobal(5));
        System.out.println("Valor de moto " + veh2.obtenerTarifaGlobal(5));
        System.out.println("Valor de camion " + veh3.obtenerTarifaGlobal(5));*/
        boolean salir = true;
        Scanner sn = new Scanner(System.in);
        while(salir){
           System.out.println("*************************");
           System.out.println("1. Automovil");
           System.out.println("2. Motocicleta");
           System.out.println("3. Camion");
           System.out.println("4. Salir");
           System.out.println("*************************");
           int opcion = sn.nextInt();
           if(opcion == 4){
               break;
               
           }
           System.out.println("Ingrese las Placas: ");
           String placas = sn.toString();
           
           System.out.println("Cuantos segundos estara dentro del estacionamiento ? ");
           int segundos = sn.nextInt();
           
           Vehiculo veh = obtenerVehiculo(opcion);
           System.out.println("Valor de su tarifa es de Q" + veh.obtenerTarifaGlobal(segundos));
           
           
        }
             
    }
    
    public static Vehiculo obtenerVehiculo(int tipo){
        switch(tipo){
            case 1:
                return new Automovil();
            case 2:
                return new Motocicleta();
            case 3:
                return new Camion();
        }
        return null;
    }
    
    
    
    
    
}
