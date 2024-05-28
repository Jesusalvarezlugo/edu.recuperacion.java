package servicios;

import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;

public class FicheroImplementacion implements FicheroInterfaz {
	
	
	public  void ficheroLog(String texto) {
		try {
			FileWriter escritor= new FileWriter(Inicio.rutaCompletaLog,true);
			
			
			escritor.write(texto+"\n");
			
			
			escritor.close();
		}catch(IOException ex) {
			System.out.println("[001] error en la aplicacion");
		}
	}

}
