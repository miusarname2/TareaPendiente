/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author Oscar Alvarez
 */
public class Modelo {
    
    protected String name;
    protected String value;
    
    // siempre Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

       
    
    // Methods
    
    public boolean validarLetra(){
        
        if(this.name.equals("")){
            return false;
        }
      
       
        if (this.name.matches("[A-Z]*")) {
            return true;
        }
        
        
        return false;
    }
    
    public boolean validarNumero(){
        
        if(this.value.equals("")){
            return false;
        }
      
       
        if (this.value.matches("[0.0-9.9]*")) {
            return true;
        }
        
       
        return false;
    }
    
}
