package ro.ase.csie.cts.laborator10.chain;

import java.util.Dictionary;


public class ModulFiltruRomana extends ModulProcesareMesaj{

	public static final String[] dictionar = new String[] {"rau", "violent", "neprietenos"};	
	@Override
	public void procesareMesaj(MesajChat mesaj) {
		boolean esteValid = true;
		for(String cuvant : dictionar) {
			if(mesaj.text.toLowerCase().contains(cuvant)) {
				esteValid = false;
				System.out.println("Mesaj interzis");
				break;
			}
		}
		if(esteValid && this.next != null)
			this.next.procesareMesaj(mesaj);
		
	}

}
