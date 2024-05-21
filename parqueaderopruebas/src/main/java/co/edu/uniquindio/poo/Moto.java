package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private double velocidadMaxima;
    private TipoMoto tipo;
    /*
     * Constructor
     */
    public Moto(Propietario propietario, String placa, String modelo, double tarifa, double velocidadMaxima, TipoMoto tipo){
        super(propietario,placa,modelo,tarifa);
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
        assert velocidadMaxima>0;
    }
    /*
     * Metodo toString para obtener toda la informacion de la moto
     */
    @Override
    public String toString(){
        return super.toString() + "Tipo de Vehiculo: Moto\n" + "Tipo de moto: " + tipo + "\n" + "Velocidad Maxima : "+ velocidadMaxima + "\n";
    }
    /*
     *
     */
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    /*
     *
     */
    public TipoMoto getTipo() {
        return tipo;
    }
    /*
     *
     */
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    /*
     *
     */
    public void setTipo(TipoMoto tipo) {
        this.tipo = tipo;
    }
    
    
}
