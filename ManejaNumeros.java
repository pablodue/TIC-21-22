package MiCodigo;

public class ManejaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma; 
		MiParejaNumeros objeto1; //Declaro el objeto
		objeto1=new MiParejaNumeros(5,8); //Instancio8(proceso de transformacion en un objeto)
		MiParejaNumeros objeto2;
		objeto2=new MiParejaNumeros(1,4);
		
		objeto1.setNum1(6);
		objeto1.setNum2(4);
		suma=objeto1.devuelveSuma();
		objeto2.setNum1(4);
		objeto2.setNum2(1);
		System.out.println("Suma de la pareja 1:  ");
		System.out.println(suma);
		System.out.println("Suma de la pareja 2:  ");
		System.out.println(suma);

	}

}