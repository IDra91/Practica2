package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	File f;
	FileReader lectorarchivo;
	FileWriter escritorarchivo;
	
	public void ConcatenarArchivo(String nombre, String texto){
		String temp = this.leer(nombre);
		temp = temp +texto;
		
	}
	public void CrearTexto(String nombre, String texto){
		try{
			f = new File(nombre);
			escritorarchivo = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(escritorarchivo);
			PrintWriter salida = new PrintWriter(bw);
			
		}catch(IOException e){System.out.println("Error:"+e.getMessage());}
	}
	public String leer(String nombre){
		try{
			f = new File(nombre);
			lectorarchivo = new FileReader(f);
			BufferedReader br = new BufferedReader(lectorarchivo);
			String line="";
			String dato="";
			while(true){
					dato=br.readLine();
					if((dato!=null)&(line.indexOf("Estacion")!=-1))
						line=line+dato+"\n";
					if((dato!=null)&(line.indexOf("Bajan")!=-1))
						line = line+dato+"\n";
					if((dato!=null)&(line.indexOf("Suben")!=-1))
						line = line+dato+"\n";
					else
						break;
			}
			br.close();
			lectorarchivo.close();
			return line;
		}catch(IOException e){System.out.println("Error:"+e.getMessage());}
		return null;
	}
	public String leerGrafica(){
		File f;
		javax.swing.JFileChooser j = new javax.swing.JFileChooser();
		j.showOpenDialog(j);
		String path= j.getSelectedFile().getAbsolutePath();
		String lectura ="";
		f = new File(path);
		try{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String dato;
			while((dato = br.readLine())!=null)
				lectura = lectura+dato+"\n";
		}catch(IOException e){}
		return null;
	}
}
