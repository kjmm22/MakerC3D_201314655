package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    
    private String cad;
    private String v;
    private String f;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String v, String f)
    {
        this.v=v;
        this.f=f;
    }
    
    public String getCad(){
        return cad;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }
    
}
