package main.sisgesemp.modelo;

import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private String direccion;
    private String contacto;
    private List <Venta> historial;

    public Cliente(String dni, String nombre, String direccion, String contacto, List<Venta> historial) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.historial = historial;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public List<Venta> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Venta> historial) {
        this.historial = historial;
    }
}
