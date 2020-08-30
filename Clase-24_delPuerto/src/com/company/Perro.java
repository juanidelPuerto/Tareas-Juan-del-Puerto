package com.company;
import java.util.ArrayList;
import java.util.Date;


public class Perro  extends Mascota{
    private String raza_perro;

    public Perro(){
        super("",new Dueño(),"Perro",new Fecha(0,0,0),new ArrayList<Fecha>());
        this.raza_perro="";
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
        if (coincidencias>=4){
            cumple=true;
        }
        return cumple;
    }

    @Override
    public boolean cumpleVisitasDesdeNacimineto() {
        Date hoy = new Date();
        int anio_actual=hoy.getYear()+1900;
        if (this.getFechas_control().size()>=4*(anio_actual-this.getFecha_nacimiento().getAnio())){
            return true;
        }
        return false;
    }

    public String getRaza_perro() {
        return raza_perro;
    }

    public void setRaza_perro(String raza_perro) {
        this.raza_perro = raza_perro;
    }
}
