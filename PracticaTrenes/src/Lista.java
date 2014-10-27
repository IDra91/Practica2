import java.util.Scanner;

public class Lista {
Nodo inicio = null;
static int opcion;
static int dato;
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.println("1) Agregar elementos\n"+"2) Remover elementos\n"+"3) Mostrar elementos\n"+"4) Buscar Elementos\n");
			opcion = s.nextInt();
			switch(opcion){
			case 1:
				System.out.println("Por favor ingrese un dato para agregar");
				dato = s.nextInt();
				lista.agregar(dato);
				break;
			case 2:
				System.out.println("Por favor ingrese el dato que desea eliminar");
				dato = s.nextInt();
				lista.eliminar(dato);
				break;
			case 3:
				lista.mostrar();
				break;
			case 4:
				System.out.println("Por favor ingrese el dato que desea buscar");
				dato = s.nextInt();
				lista.buscarElemento(dato);
				if(lista.buscarElemento(dato))
					System.out.println("El numero buscado si está en la lista");
				else
					System.out.println("El numero buscado no está en la lista");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		}while(opcion!=0);
	}
void agregar (int elemento){
	if (inicio == null){
		inicio= new Nodo(elemento);
		
	}else{
		Nodo temporal = inicio;
		inicio = new Nodo(elemento);
		inicio.siguiente = temporal;
	}
}
void mostrar(){
	Nodo temporal = inicio;
	if (temporal == null){
	System.out.println("La lista está vacía, por favor agregue datos");
	}else{
		while(temporal!= null){
		System.out.println(temporal.elemento);
		temporal = temporal.siguiente;
		
		}	
	}
}
void eliminar (int elemento){
	Nodo temporal = inicio;
	Nodo anterior = null;
	if(temporal==null){
		System.out.println("Lista vacia");
	}else{
		while(temporal!=null){
			if(temporal.elemento==elemento){
				if(anterior==null){
				inicio=inicio.siguiente;
				}else{
					anterior.siguiente=temporal.siguiente;
					break;
				}
			}else{
				anterior=temporal;
				temporal=temporal.siguiente;
			}
		}
	}
}
boolean buscarElemento(int elemento){
	Nodo temporal=inicio;
	while(temporal!=null){
		if(temporal.elemento==elemento)
			return true;
		else
			temporal=temporal.siguiente;
	}
	return false;
}
}
