package com.minhaempresa.design_patterns_solid.creational.prototype;

public abstract class Documento
        implements Prototype {

    protected   String path;

    public Documento(String path){this.path = path;}
    public String getPath(){return  this.path;}
    @Override
    public String toString() {
        return "Documento{" +
                "path='" + path + '\'' +
                '}';
    }

}
