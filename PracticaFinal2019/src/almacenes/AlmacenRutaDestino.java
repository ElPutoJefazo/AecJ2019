package almacenes;

import java.io.File;
import java.util.ArrayList;

import acceso.DAO;


public class AlmacenRutaDestino<T> {
	private DAO dao;
	private String pathInicial;
	private String extension;


	public AlmacenRutaDestino(String pathInicial, String extension) {
		super();
		this.pathInicial = pathInicial;
		this.extension = extension;
		dao = new DAO<>();
		File file = new File(pathInicial);
		if (!file.exists()) {
			file.mkdirs();
		}
	}


	public boolean grabar(String nombreElemento, T t) {
		return dao.grabar(pathInicial + "/" + nombreElemento + "." + extension, t);
	}


	public T obtener(String nombreElemento) {
		return (T) dao.leer(pathInicial + "/" + nombreElemento + "." + extension);
	}
	
	public boolean borrar(String nombreElemento) {
		return dao.borrar(pathInicial + "/" + nombreElemento + "." + extension);
	}
	
	public String[] getFiles() {
		String[] elements = null;
		File carpeta = new File(pathInicial);
		if (carpeta.exists() && carpeta.isDirectory()) {
			elements = carpeta.list();
			elements = quitarExtension(elements);
		}
		return elements;
	}

	private String[] quitarExtension(String[] elements) {
		String[] definitivos = new String[elements.length];
		for (int i = 0; i < elements.length; i++) {
			definitivos[i] = elements[i].split("\\.")[0];
		}
		return definitivos;
	}

//	public ArrayList<T> getList() {
//		ArrayList<T> lista = new ArrayList<>();
//		String[] files = getFiles();
//		for (String string : files) {
//			lista.add(obtener(string));
//		}
//		return lista;
//	}
}
