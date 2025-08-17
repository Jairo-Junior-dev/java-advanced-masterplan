package com.minhaempresa.design_patterns_solid.creational.prototype;

public class DocumentoPDF  extends Documento{
    public DocumentoPDF(String path) {
        super(path);
    }
    @Override
    public Documento cloner() {
        return  new DocumentoPDF(super.path);
    }
}
