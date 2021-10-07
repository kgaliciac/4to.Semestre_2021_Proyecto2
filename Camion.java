package proyecto1;

public class Camion extends Vehiculo{
    int recargo;

    public Camion() {
        this.espacios = 3;
        this.tarifa = 5;
        this.recargo = 25;
    }
   
    @Override
    public double obtenerTarifa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double obtenerTarifaGlobal( double segundos){
        return segundos + recargo;
    }
    
}
