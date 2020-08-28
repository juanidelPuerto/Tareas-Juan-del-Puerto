package com.company;

public class Gato extends Mascota{
    private String saludo;
    private int alegria;

    Gato(){
        super("",new Dueño("",0,0),"");
        this.saludo="miau";
        alegria=1;
    }

    Gato(String nombrex, Dueño dueniox){
        super(nombrex, dueniox, "Gato");
        this.saludo="guau";
        alegria=1;
    }


    @Override
    public void saludar(String nombre_duenio) {
        if (nombre_duenio.equals(this.getDueño().getNombre())){
            System.out.println(this.getSaludo());
        }else{
            System.out.println("MIAU!");
        }
    }

    @Override
    public void alimentar() {
        this.alegria++;
        for (int i=0;i < alegria-1;i++){
            this.saludo= saludo + " miau";
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
