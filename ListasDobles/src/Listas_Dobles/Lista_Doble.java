package Listas_Dobles;



public class Lista_Doble {

	private Nodo inicio;
	private Nodo fin;
	
	public Lista_Doble(){
		inicio = null;
		fin = null;
		
	}

	public void InsertarInicio(String dato){
		if(inicio == null){
			inicio = new Nodo(dato,null,null);
			fin = inicio;
		}
		else{
			Nodo nuevo = new Nodo(dato,null,inicio);
			inicio.setAnterior(nuevo);
			inicio = nuevo;
		}
	}
	
	public void InsertarFinal(String dato){
		if(inicio == null){
			fin = new Nodo(dato,null,null);
			fin = inicio;
		}
		else{
			Nodo nuevo = new Nodo(dato,fin,null);
			fin.setSiguiente(nuevo);
			fin = nuevo;
		}
	}
	
	public String obtenerInicio(){
		String dato = inicio.getDato();		
		inicio = inicio.getSiguiente();
		if(inicio != null){
			inicio.setAnterior(null);
		}
		else
			fin = null;
		return dato;
	}
	 
	public String obtenerFin(){
		String dato = fin.getDato();		
		fin = fin.getAnterior();
		if(fin != null){
			fin.setSiguiente(null);
		}
		else
			inicio = null;
		return dato;
	}
	
	public void MostrarAdelante(){
		Nodo temp = inicio;
		while(temp != null){
			System.out.println(temp.getDato());
			temp = temp.getSiguiente();
		}
		
	}
	
	public void MostrarRegreso(){
		Nodo temp = fin;
		while(temp != null){
			System.out.println(temp.getDato());
			temp = temp.getAnterior();
		}
	}
	
	public void buscar(String dato){
		Nodo temp = inicio;
		while(temp != null){
			if(temp.getDato().equals(dato)){
				System.out.println("El dato sí está");
			}
			else{
				temp = temp.getSiguiente();
			}
				System.out.println("El dato no está");			
	
	}
	}
	

	
	
}
