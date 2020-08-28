package com.company;

public class Pez extends Mascota{
        private int vidas;
        private boolean vivo;
        Pez(){
            super("",new Dueño("",0,0),"Pez");
            this.vidas=10;
            this.vivo=true;
        }

        Pez(String nombrex,Dueño dueniox){
            super(nombrex,dueniox,"Pez");
            this.vidas=10;
            this.vivo=true;
        }


    @Override
    public void saludar(String nombre_duenio) {
        if (nombre_duenio.equals(this.getDueño().getNombre())){
            vidas=vidas-1;
        }else{
            this.vivo=false;
        }
    }

    @Override
    public void alimentar() {
        this.vidas++;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
