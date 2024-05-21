package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    private LocalDate fechaSalida;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private LocalDate fechaEntrada;
    /*
     * 
     */
    public Registro(LocalDate fechaEntrada, LocalTime horaEntrada, LocalTime horaSalida, LocalDate fechaSalida){
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        assert horaEntrada.getHour() > 0 && horaEntrada.getMinute() > 0 && horaEntrada.getSecond() > 0;
        assert horaSalida.getHour() > 0 && horaSalida.getMinute() > 0 && horaSalida.getSecond() > 0;
        assert fechaEntrada.getYear() > 0 && fechaEntrada.getMonthValue() > 0;
    }
    /*
     * 
     */
    public int calcularHorasUso(){
        int horas = 0;
        if(horaSalida.getMinute() - horaEntrada.getMinute() > 0){
            horas = (horaSalida.getSecond() - horaEntrada.getSecond());
        }else{
            horas = (horaSalida.getSecond() - horaEntrada.getSecond());
        }
        return horas;
    }
    
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }
    public LocalTime getHoraSalida() {
        return horaSalida;
    }
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }
    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
