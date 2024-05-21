package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vehiculo {
    private String placa;
    private String modelo;
    private Propietario propietario;


    private double tarifa;
    private double puestoOcupado;
    private LocalDate fechaParqueo;
    private LocalDate fechaSalida;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private double cobro;

    /*
     * Constructor
     */
    public Vehiculo( Propietario propietario, String placa, String modelo, double tarifa){
        this.propietario = propietario;
        this.tarifa = tarifa;
        this.placa = placa;
        this.modelo = modelo;
        assert placa != null && !placa.isBlank();
        assert modelo != null && !modelo.isBlank();
        assert tarifa > 0;
    }
    /*
     * Metodo toString para obtener toda la informacion del Vehiculo
     */
    @Override
    public String toString(){
        return propietario.toString() + "------INFORMACION DEL VEHICULO-----\n"+"Placa: "+ placa + "\n"+"Modelo: "+ modelo + "\n"+"Tarifa: "+ tarifa + "\n" + "Puesto Ocupado: " + puestoOcupado + "\n";
    }
    /*
     * Constructor
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /*
     * Constructor
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*
     * Constructor
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /*
     * Constructor
     */
    public String getPlaca() {
        return placa;
    }
    /*
     * Constructor
     */

    public String getModelo() {
        return modelo;
    }
    /*
     * Constructor
     */

    public Propietario getPropietario() {
        return propietario;
    }
    /*
     * 
     */
    public double getTarifa(){
        return tarifa;
    }
    public LocalDate getFechaParqueo() {
        return fechaParqueo;
    }
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }
    public LocalTime getHoraSalida() {
        return horaSalida;
    }
    public void setFechaParqueo(LocalDate fechaParqueo) {
        this.fechaParqueo = fechaParqueo;
    }
    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    public double getCobro() {
        return cobro;
    }
    public void setCobro(double cobro) {
        this.cobro = cobro;
    }
    public double getPuestoOcupado() {
        return puestoOcupado;
    }
    public void setPuestoOcupado(double puestoOcupado) {
        this.puestoOcupado = puestoOcupado;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    

}
