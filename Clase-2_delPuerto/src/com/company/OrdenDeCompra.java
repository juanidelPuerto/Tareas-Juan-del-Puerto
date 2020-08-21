package com.company;

public class OrdenDeCompra {
    private String fecha;
    private int hora;
    private int importe_pagar;
    private String cliente;
    private int cant_productos;
    private String forma_pago;

    public OrdenDeCompra(String fecha, int hora, int importe_pagar, String cliente, int cant_productos, String forma_pago) {
        this.fecha = fecha;
        this.hora = hora;
        this.importe_pagar = importe_pagar;
        this.cliente = cliente;
        this.cant_productos = cant_productos;
        this.forma_pago = forma_pago;
    }

    public boolean cantMenor255() {
        if (this.cant_productos < 255) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pago_efectivo() {
        if (forma_pago == "efectivo") {
            return true;
        } else {
            return false;
        }

    }

    public String getfecha(){
        return this.fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getImporte_pagar() {
        return importe_pagar;
    }

    public void setImporte_pagar(int importe_pagar) {
        this.importe_pagar = importe_pagar;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCant_productos() {
        return cant_productos;
    }

    public void setCant_productos(int cant_productos) {
        this.cant_productos = cant_productos;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }
}
