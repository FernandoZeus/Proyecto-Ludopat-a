package FZO0323Ejercicio1;
public class UnidadÉlite extends UnidadArmada{

		final String TIPO = "UnidadÉlite";
		
		boolean tof = true;
		
	public String obtenerTipo(){
		
		return TIPO;
		
	}
	
	public UnidadÉlite(){
		
		vida=100;
		daño=20;
	
	}

	public boolean ataqueEfectivo() {
	
		return tof;
	}
	
	public boolean  estaViva( int vida ){
		
			if (vida > 0 ){
				
				return true;
			
			}else {
				
				return false;
				
			}

	}
}