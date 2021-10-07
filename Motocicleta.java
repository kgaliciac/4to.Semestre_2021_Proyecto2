package proyecto1;

public class Motocicleta extends Vehiculo{
    double descuento;

    public Motocicleta() {
        this.descuento = 0.10;
        this.espacios = 2;
        this.tarifa = 10;
    }
    
    @Override
    public double obtenerTarifa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerTarifaGlobal( double segundos){
        return segundos - descuento;
    }
    
    
}
