package estructura;

import modelo.Pelicula;

/**
 *
 * @author lopez
 */
public class Nodo {
    private Pelicula dato;
    private Nodo siguiente;

    public Nodo(Pelicula dato) {
        this.dato = dato;
    }

    public Pelicula getDato() {
        return dato;
    }

    public void setDato(Pelicula dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
