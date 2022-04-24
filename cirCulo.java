package MiCodigo;

public class cirCulo {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	private MiParejaNumeros centroCirculo;
	double radio;
	public cirCulo(int x, int y, double radio) {
		super();
		centroCirculo=new MiParejaNumeros(x,y);
		this.radio = radio;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return(centroCirculo.getNum1()) ;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		centroCirculo.setNum1(x);
	}
	/**
	 * @return the y
	 */
	public int getY() {
		int y;
		return(centroCirculo.getNum2(y));
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		y= y;
	}
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double devuelveArea(){
		double area;
		area=Math.PI*Math.pow(radio,2);
		return area;
	}
	public double devuelveLongitud() {
		double longitud;
		longitud=2*Math.PI*radio;
		return longitud;
	}
	
	
}
