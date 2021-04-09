package com.alex.parcial1;

public class Producto {
    String nombre;
    double codigo;
    double valor;
    String descripcion;
    String categoria;
    String iva;

    public Producto(String nombre, double codigo, double valor, String descripcion, String categoria, String iva) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
}
