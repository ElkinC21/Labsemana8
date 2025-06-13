/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x.pkg0;



    
public class Registro {
    
    private String nombre;
    private String password;
    private int puntos;

    
    public Registro(String nombre, String password,int puntos) {
        this.nombre     = nombre;
        this.password =  password;
        this.puntos= puntos;      
    }

   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpassword() {
        return password;
    }
    public void setpassword(String contrasena) {
        this.password = contrasena;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    
    public void agregarPuntos(int cantidad) {
        if (cantidad > 0) {
            this.puntos += cantidad;
        }
    }
}


