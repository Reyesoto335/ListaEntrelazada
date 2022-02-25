public class Lista {
    
    public Nodo inicio, fin;
    
    public void AgregarInicio(Object elemento){
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
     public void MostrarLista(){
         Nodo aux = inicio;
         while (aux != null){
             if(aux.siguiente == null){
                 System.out.print("[" + aux.valor + "]=>NULL");
             }
             else{
                 System.out.print("[" + aux.valor + "]=>");
             }
             aux = aux.siguiente;
         }
     }
}
