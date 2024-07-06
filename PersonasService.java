import java.util.ArrayList;
import java.util.List;

public class PersonasService extends Persona{
    
    private final List<Paciente> pacientes = new ArrayList<>();
    
    private final List<Medico> medicos = new ArrayList<>();
    
    // Método para agregar paciente
    public void agregarPaciente(Paciente paciente) {
        // Excepción si el paciente está registrado
        if(existeDocumento(paciente.getNumeroDocumento())){
            throw new RuntimeException("Este paciente ya se encuentra registrado");
        } 
        
        pacientes.add(paciente);
    }

    // Método para agregar médico
    public void agregarMedico(Medico medico) {
        // excepción si se detecta 
        if (existeDocumento(medico.getNumeroDocumento())) {
            throw new RuntimeException("Este médico ya se encuentra registrado");
        }
        medicos.add(medico);
    }


    public void eliminarPaciente(int numeroDocumento) {
        pacientes.removeIf(p -> p.getNumeroDocumento() == numeroDocumento);
    }

    public void eliminarMedico(int numeroDocumento) {
        medicos.removeIf(p -> p.getNumeroDocumento() == (numeroDocumento));

    }

    public void editarPaciente(int numeroDocumento, Paciente pacienteActualizado) {
        for (Paciente p : pacientes) {
            if (p.getNumeroDocumento() == numeroDocumento) {
                p.setPrimerNombre(pacienteActualizado.getPrimerNombre());
                p.setSegundoNombre(pacienteActualizado.getSegundoNombre());
                p.setPrimerApellido(pacienteActualizado.getPrimerApellido());
                p.setSegundoApellido(pacienteActualizado.getSegundoApellido());
                p.setTipoDocumento(pacienteActualizado.getTipoDocumento());
                p.setFechaExpedicionDoc(pacienteActualizado.getFechaExpedicionDoc());
                return;
            }
        }
        throw new RuntimeException("No existe ese número de documento del paciente");
    }

        
    public void editarMedico(int numeroDocumento, Medico medicoActualizado) {
        for (Medico m : medicos) {
            if (m.getNumeroDocumento() == numeroDocumento) {
                m.setPrimerNombre(medicoActualizado.getPrimerNombre());
                m.setSegundoNombre(medicoActualizado.getSegundoNombre());
                m.setPrimerApellido(medicoActualizado.getPrimerApellido());
                m.setSegundoApellido(medicoActualizado.getSegundoApellido());
                m.setTipoDocumento(medicoActualizado.getTipoDocumento());
                m.setFechaExpedicionDoc(medicoActualizado.getFechaExpedicionDoc());
                return;
            }
        }
        throw new RuntimeException("No existe ese número de documento del médico");
    }



    public boolean existeDocumento(int numeroDocumento){
        return pacientes.stream().anyMatch(p -> p.getNumeroDocumento() == (numeroDocumento)) ||
           medicos.stream().anyMatch(p -> p.getNumeroDocumento() == (numeroDocumento));
    }

    public Paciente obtenerPaciente(int numeroDocumento) {
        return pacientes.stream().filter(p -> p.getNumeroDocumento() == numeroDocumento).findFirst()
                .orElseThrow(() -> new RuntimeException("No existe un paciente con ese número de documento"));
    }

    public Medico obtenerMedico(int numeroDocumento) {
        return medicos.stream().filter(m -> m.getNumeroDocumento() == numeroDocumento).findFirst()
                .orElseThrow(() -> new RuntimeException("No existe un médico con ese número de documento"));
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Paciente> getMedicos() {
        return medicos;
    }

}

