package MiCodigo;

public class ManejaCircunferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cirCulo circu1;
		cirCulo circu2;
		circu1=new cirCulo(7,9,4.5);
		System.out.println("CIRCULITO 1: ");
		System.out.println("Coordenada X del centro : "+circu1.getX());
		System.out.println("Coordenada Y del centro : "+circu1.getY());
		System.out.println("Radio :"+ circu1.getRadio());
		System.out.println("Area :"+ circu1.devuelveArea());
		System.out.println("Radio :"+ circu1.getRadio());
		System.out.println("Longitud :"+ circu1.devuelveLongitud());
	}

}
