package MiCodigo;

public class Efemeride extends Fecha {
	private String quePaso;

	public Efemeride(int dia, int mes, int anio) {
		super(dia, mes, anio);
		
		// TODO Auto-generated constructor stub
		this.setQuePaso(quePaso);
	}
	
	public String getQuePaso() {
		return quePaso;
	}
	public void setQuePaso(String quePaso) {
		this.quePaso= quePaso;
		
	}

}
