package sistemas.administracion;
import java.util.ArrayList;
import com.company.Doctor;
import com.company.Paciente;

public class Hospital {
     private ArrayList<Paciente> pacientes_sin_atender;
     private ArrayList<Paciente> pacientes_siendo_atendidos ;
     private String nombre;
     private ArrayList<Paciente> pacientes_atendidos;
     private ArrayList<Doctor> doctores_atendiendo;
     private int cant_camas;

    public Hospital(ArrayList<Paciente> pacientes_sin_atender, ArrayList<Paciente> pacientes_siendo_atendidos, String nombre, ArrayList<Paciente> pacientes_atendidos, ArrayList<Doctor> doctores_atendiendo, int cant_camas) {
        this.pacientes_sin_atender = pacientes_sin_atender;
        this.pacientes_siendo_atendidos = pacientes_siendo_atendidos;
        this.nombre = nombre;
        this.pacientes_atendidos = pacientes_atendidos;
        this.doctores_atendiendo = doctores_atendiendo;
        this.cant_camas = cant_camas;
    }

    public ArrayList<Paciente> getPacientes_sin_atender() {
        return pacientes_sin_atender;
    }

    public void setPacientes_sin_atender(ArrayList<Paciente> pacientes_sin_atender) {
        this.pacientes_sin_atender = pacientes_sin_atender;
    }

    public ArrayList<Paciente> getPacientes_siendo_atendidos() {
        return pacientes_siendo_atendidos;
    }

    public void setPacientes_siendo_atendidos(ArrayList<Paciente> pacientes_siendo_atendidos) {
        this.pacientes_siendo_atendidos = pacientes_siendo_atendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Paciente> getPacientes_atendidos() {
        return pacientes_atendidos;
    }

    public void setPacientes_atendidos(ArrayList<Paciente> pacientes_atendidos) {
        this.pacientes_atendidos = pacientes_atendidos;
    }

    public ArrayList<Doctor> getDoctores_atendiendo() {
        return doctores_atendiendo;
    }

    public void setDoctores_atendiendo(ArrayList<Doctor> doctores_atendiendo) {
        this.doctores_atendiendo = doctores_atendiendo;
    }

    public void setCant_camas(int cant_camas) {
        this.cant_camas = cant_camas;
    }

    public int getCant_camas() {
        return cant_camas;
    }


    public int cant_pacientes_atendidos(){
        return this.getPacientes_atendidos().size();
    }

    public String info_siendo_atendidos(){
        String salida = "";
        for (int i=0; i<this.getPacientes_siendo_atendidos().size(); i++){

          Paciente paciente = this.getPacientes_siendo_atendidos().get(i);
          String info_paciente =  " |Nombre completo: " + paciente.getNombre() + " "+ paciente.getApellido();
          info_paciente = info_paciente + " Edad: "+ paciente.getEdad();
          info_paciente = info_paciente + " Dni: " + paciente.getDni();
          salida= salida + info_paciente;
        }
        return salida;

    }


    public void agregar_paciente(Paciente paciente_agregar){ this.pacientes_sin_atender.add(paciente_agregar); }

    public void eliminar_pacientes_atendidos(){
        for (int i=0; i < this.getPacientes_atendidos().size();i++) {
          Paciente paciente_atendido= this.getPacientes_atendidos().get(i);
            for (int j=0; j< this.getPacientes_sin_atender().size();j++){
              Paciente paciente_sin_atender = this.getPacientes_sin_atender().get(j);
                if (paciente_atendido.equals(paciente_sin_atender)){
                    this.getPacientes_sin_atender().remove(paciente_atendido);
                }
            }
        }
    }

    public void agregar_pacientes_atendidos(Paciente paciente_agregar){ this.getPacientes_atendidos().add(paciente_agregar); }

    public int cant_camas(){ return getCant_camas(); }

}

