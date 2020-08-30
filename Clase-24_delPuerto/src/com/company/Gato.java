package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Gato extends Mascota{
    private String raza_gato;

    public Gato(){
        super("",new Dueño(),"Gato",new Fecha(0,0,0),new ArrayList<>());
        this.raza_gato="";
    }

    @Override
    public boolean cumpleVisitas() {
        int coincidencias=0;
        boolean cumple=false;
        Date hoy = new Date();
        int anio_actual=hoy.getYear()+1900;
        for (Fecha i : this.getFechas_control()
        ) {
            if (i.getAnio()==anio_actual){
                coincidencias=coincidencias+1;
            }
        }
        if (coincidencias>=2){
            cumple=true;
        }
        return cumple;
    }

    @Override
    public boolean cumpleVisitasDesdeNacimineto() {
        Date hoy = new Date();
        int anio_actual=hoy.getYear()+1900;
        if (this.getFechas_control().size()>=2*(anio_actual-this.getFecha_nacimiento().getAnio())){
            return true;
        }
        return false;
    }

    public String getRaza_gato() {
        return raza_gato;
    }

    public void setRaza_gato(String raza_gato) {
        this.raza_gato = raza_gato;
    }
}
