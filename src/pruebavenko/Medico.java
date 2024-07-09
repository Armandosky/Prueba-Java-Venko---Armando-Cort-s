package pruebavenko;

public class Medico extends Persona {
    
    public Medico(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoDocumento, int numeroDocumento, String fechaExpedicionDoc) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, tipoDocumento, numeroDocumento, fechaExpedicionDoc);
    }

    @Override
    public String toString() {
        return "Médico{" +
                "tipoDocumento='" + getTipoDocumento() + '\'' +
                ", primerNombre='" + getPrimerNombre() + '\'' +
                ", segundoNombre='" + getSegundoNombre() + '\'' +
                ", primerApellido='" + getPrimerApellido() + '\'' +
                ", segundoApellido='" + getSegundoApellido() + '\'' +
                ", numeroDocumento=" + getNumeroDocumento() +
                ", fechaExpedicionDoc='" + getFechaExpedicionDoc() + '\'' +
                '}';
    }
}
