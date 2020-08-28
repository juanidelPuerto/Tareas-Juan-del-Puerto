package com.company;

public class Pajarito extends Mascota{
    private String saludo;
    private int alegria;

    Pajarito(){
        super("",new Dueño("",0,0),"");
        this.saludo="pio";
        alegria=1;
    }

    Pajarito(String nombrex, Dueño dueniox){
        super(nombrex, dueniox, "Pajarito");
        this.saludo="pio";
        alegria=1;
    }


    @Override
    public void saludar(String nombre_duenio) {
        if (nombre_duenio.equals(this.getDueño().getNombre())){
            System.out.println(this.getSaludo());
        }else{
            System.out.println("........");
        }
    }

    @Override
    public void alimentar() {
        this.alegria++;
        for (int i=0;i < alegria-1;i++){
            this.saludo= saludo + " pio";
        }
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }
}
