package MiCodigo;

public class MiParejaNumeros {
        //Atributos->variables
        int num1;
        int num2;
        //Constructor
        public MiParejaNumeros(int num1Externo,int num2Externo){
                num1=num1Externo;
                num2=num2Externo;
               
        }
       
        //M�todos->funciones
        //M�todos set/get
        void setNum1(int num1Externo){
                num1=num1Externo;
        }
        void setNum2(int num2Externo) {
                num2=num2Externo;
        }
        int getNum1() {
                return num1;
        }
        int getNum2() {
                return num2;
        }
       
        int devuelveSuma() {
                int sumaNumeros;
                sumaNumeros=num1+num2;
                return(sumaNumeros);
        }

		public int devuelveResta() {
			// TODO Auto-generated method stub
			int restaNumeros;
            restaNumeros=num1-num2;
            return(restaNumeros);
		}

}