package main.sisgesemp.modelo;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    List<Producto> productos;
    List<Integer> cantidades;
    Date fecha;
    Cliente cliente;

    public Venta(List<Producto> productos, List<Integer> cantidades, Date fecha, Cliente cliente) {
        this.productos = productos;
        this.cantidades = cantidades;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(List<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
