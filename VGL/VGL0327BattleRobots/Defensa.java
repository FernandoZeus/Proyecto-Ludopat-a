package VGL0327BattleRobots;

public class Defensa {

	private String nombre;
	private int fiabilidad;
	private int defensa;
	
	//constructor
	
	public Defensa(String nombre,int defensa, int fiabilidad) {
		this.nombre=nombre;
		this.defensa=defensa;
		this.fiabilidad=fiabilidad;
	}
	
	
	//metodo
	
	public int bloqueaAtaque(int da�o) {
		if((int)(Math.random()*100)<=fiabilidad) {
			//has acertado
			return da�o-defensa;
			
		}else {
			//has fallado
			return da�o;
		}
	}
	
	public String getDefensa() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
}
