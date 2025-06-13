/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x.pkg0;

/**
 *
 * @author elkin
 */
public class UsuarioManejo {

    private Registro[] usuarios;

    public UsuarioManejo() {
        usuarios = new Registro[0];
    }
 public void crearUsuario(String nombre, String contrasena) {

        Registro nuevo = new Registro(nombre, contrasena,0);
        Registro[] guardar = new Registro[usuarios.length + 1];
        for (int i = 0; i < usuarios.length; i++) {
            guardar[i] = usuarios[i];
        }
       guardar[guardar.length - 1] = nuevo;

        usuarios = guardar;
    }

    public String obtenerListadoUsuarios() {
        if (usuarios.length == 0) {
            return "";
        }
        String texto = "";
        for (int i = 0; i < usuarios.length; i++) {
            Registro u = usuarios[i];
            texto += u.getNombre() + " (puntos: " + u.getPuntos() + ")";
            if (i < usuarios.length - 1) {
                texto += "\n";
            }
        }
        return texto;
    }

    public Registro[] getUsuarios() {
        return usuarios;
    }
}
