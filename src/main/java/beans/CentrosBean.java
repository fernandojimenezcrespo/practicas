/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author 06553669A
 */
public class CentrosBean implements Comparable<CentrosBean>{
    private int codigo;
    private String  descripcion;

    public CentrosBean(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(CentrosBean o) {
        if (this.getCodigo()==o.getCodigo())
            return 0;
        else if(this.getCodigo()>o.getCodigo()) return 1;
                else
            return -1;
               
           
          //return this.getCodigo().compareTo(o.getCodigo());
          
    }
    
    
}
