
package main;

import java.util.Observable;

public class Observado extends Observable{
    
    String mensaje;
    
    public Observado(){
        mensaje = "Objeto Observado Iniciado";
    }
    
    public void cambiarMensaje(String m){
        mensaje = m;
        
        setChanged();
        
        notifyObservers(mensaje);
       
    }
}

