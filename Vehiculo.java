package proyecto1;

import java.util.ArrayList;

public abstract class Vehiculo {

    int espacios;
    double tarifa;
    
    
    public abstract double obtenerTarifa();
    
    public double obtenerTarifaGlobal(double segundos){
        tarifa = segundos;
        return tarifa / 2;
    }
    // funcione
    static void agregar(Vehiculo v){
        v.espacios();
    }
    //
    static void agregarTodo(Vehiculo[] v) {
	for(int i = 0; i < v.length; i++)
	    agregar(v[i]);
    }
    
    
    
    
        private void espacios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
