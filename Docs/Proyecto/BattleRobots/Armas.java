package VLG.BattleRobots;

public class Armas {

	private String nombre;
	private int da�o;
	private int fiabilidad;	
	//aa
	
	//constructor
	public Armas(String nombre,int da�o, int fiabilidad) {
		this.nombre=nombre;
		this.da�o=da�o;
		this.fiabilidad=fiabilidad;
		
	}
	
	//metodo
	
	public int obtenerDa�o() {
		if((int)(Math.random()*100)<=fiabilidad) {
			//has acertado
			return da�o;
			
		}else {
			//has fallado
			da�o=0;
		}
		
		
		return da�o;
	}

	public String getArma() {
		// TODO Auto-generated method stub
		return nombre;
	}

	
	
	
}
