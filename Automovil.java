package proyecto1;

public class Automovil extends Vehiculo{

    @Override
    public double obtenerTarifa() {
        return 5;
    }

    public Automovil() {
        this.espacios = 1;
        this.tarifa = 5;
    }
    
    
}
