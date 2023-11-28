package main.sisgesemp.modelo;

import java.util.List;

public class Proveedor {
    private String nombre;
    private String direccion;
    private String contacto;
    private List<Producto> suministrados;

    public Proveedor(String nombre, String direccion, String contacto, List<Producto> suministrados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.suministrados = suministrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Producto> getSuministrados() {
        return suministrados;
    }

    public void setSuministrados(List<Producto> suministrados) {
        this.suministrados = suministrados;
    }
}
