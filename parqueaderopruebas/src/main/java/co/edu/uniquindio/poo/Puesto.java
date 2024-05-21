package co.edu.uniquindio.poo;


import java.time.LocalDate;
import java.time.LocalTime;

public class Puesto{

    private Vehiculo vehiculo;
    private Registro registro;

    /*
     * Constructor
     */
    public Puesto(Vehiculo vehiculo, Registro registro){
        this.vehiculo = vehiculo;
        this.registro = registro;
    }
    /*
     * 
     */
    public void agregarVehiculo(Vehiculo vehiculo1){
        registro.setHoraSalida(null);
        registro.setFechaSalida(null);

        setVehiculo(vehiculo1);
        if (vehiculo != null) {
            registro.setHoraEntrada(LocalTime.now());
            registro.setFechaEntrada(LocalDate.now());
            vehiculo1.setFechaParqueo(registro.getFechaEntrada());
            vehiculo1.setHoraEntrada(registro.getHoraEntrada());
        }
    }
    /*
     * 
     */
    public void retirarVehiculo(){
        vehiculo.setHoraSalida(LocalTime.now());
        registro.setFechaSalida(vehiculo.getFechaSalida());
        registro.setHoraSalida(vehiculo.getHoraSalida());
        setVehiculo(null);
    }
    /*
     * Metodo para anadir un vehiculo al puesto
     */
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    /*
     * 
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    /*
     * 
     */
    public Registro getRegistro(){
        return registro;
    }
    
}
