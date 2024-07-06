
public class Paciente extends Persona{
    
    public Paciente(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String tipoDocumento, int numeroDocumento, String fechaExpedicionDoc) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, tipoDocumento, numeroDocumento, fechaExpedicionDoc);
    }

    @override
    public String toString() {
        return "Paciente{" +
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
