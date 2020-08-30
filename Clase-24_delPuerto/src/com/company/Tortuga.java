package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Tortuga extends Mascota {

    public Tortuga(){
        super("",new Dueño(),"Tortuga",new Fecha(0,0,0),new ArrayList<>());
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
        if (coincidencias>=1){
            cumple=true;
        }
        return cumple;
    }

    @Override
    public boolean cumpleVisitasDesdeNacimineto() {
        Date hoy = new Date();
        int anio_actual=hoy.getYear()+1900;
        if (this.getFechas_control().size()>=(anio_actual-this.getFecha_nacimiento().getAnio())){
            return true;
        }
        return false;
    }
}
