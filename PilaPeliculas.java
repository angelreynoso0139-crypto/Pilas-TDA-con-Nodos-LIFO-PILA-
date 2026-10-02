package estructura;

import modelo.Pelicula;

/**
 *
 * @author lopez
 */
public class PilaPeliculas {
    private Nodo tope;
    private int tamano;
    
    public PilaPeliculas(){
        this.tope = null;
        this.tamano = 0;
    }
    
    public boolean estaVacia(){
        return this.tope == null;
    }
    
    public int obtenerTamano(){
        return this.tamano;
    }
    
    public void apilar(Pelicula pelicula){
        if (pelicula == null){
            throw new IllegalArgumentException("No se puede apilar un objeto nulo.");
        }
        Nodo nuevoNodo = new Nodo(pelicula);
        nuevoNodo.setSiguiente(this.tope);
        this.tope = nuevoNodo;
        this.tamano++;
    }
    
    public Pelicula desapilar(){
        if (estaVacia()){
           throw new IllegalStateException("Underflow: La pila esta vacia");    
    }
    Pelicula extraida = this.tope.getDato();
    this.tope = this.tope.getSiguiente();
    this.tamano--;
    return extraida;
    }
    public Pelicula obtenerTope(){
        if (estaVacia()){
            throw new IllegalStateException("La pila esta vacia");   
        }
        return this.tope.getDato();
    }
    public void destruirPila(){
        this.tope = null;
        this.tamano = 0;
    }
    public Nodo getTopeNodo(){
        return this.tope;
    }
}
