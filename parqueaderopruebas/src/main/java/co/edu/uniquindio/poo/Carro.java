package co.edu.uniquindio.poo;

public class Carro extends Vehiculo{
    private int numPuertas;
    
    /*
     * Constructor
     */
    public Carro(Propietario propietario, String placa, String modelo, double tarifa,int numPuertas){
        super(propietario,placa,modelo,tarifa);
        this.numPuertas = numPuertas;
        assert numPuertas > 0;
    }
    /*
     * Metodo toString para obtener toda la informacion del Carro
     */
    @Override
    public String toString(){
        return super.toString() + "Tipo de Vehiculo: Carro\n" + "Numero de puertas: " + numPuertas + "\n";
    }
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
}
