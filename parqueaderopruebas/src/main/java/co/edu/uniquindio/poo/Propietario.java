package co.edu.uniquindio.poo;

public record Propietario(String nombre, String id, String email, String telefono){

    public Propietario{
        assert nombre != null && !nombre.isBlank();
        assert id != null && !id.isBlank();
        assert email != null && !email.isBlank();
        assert telefono != null && !telefono.isBlank();

    }
    /*
     * Metodo toString para mostrar toda la informacion en orden del propietario
     */
    public String toString(){
        return "----INFORMACION DEL PROPIETARIO----\n"+"Nombre: "+ nombre + "\n"+"Identificacion: "+ id + "\n"+"Email: "+ email + "\n"+"Telefono: "+ telefono + "\n"+ "-----------------------------------\n";
    }
}

