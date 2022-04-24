package MiCodigo;

public class CocheElectrico extends Coche {
	private double Potencia;
	public CocheElectrico(String identificador, String medio) {
		super(identificador, medio);
		// TODO Auto-generated constructor stub
	}
	public double getPotencia() {
		return Potencia;
	}
	public void setPotencia(double potencia) {
		Potencia = potencia;
	}

}
