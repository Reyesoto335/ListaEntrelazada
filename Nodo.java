public class Nodo {
    
    public Object valor;
    public Nodo siguiente;
    
    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Nodo(Object valor, Nodo siguiente){
        this.siguiente = siguiente;
        this.valor = valor;
    }
    
    public Object ObtenerValor(){
        return valor;
    }
    
    public void EnlazarSiguiente(Nodo n){
        siguiente = n;
    }
    
    public Nodo ObtenerSiguiente(){
        return siguiente;
    }
    
}
