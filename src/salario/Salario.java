/*
 * 9.	Calcular la utilidad que un trabajador recibe en el reparto anual 
de utilidades si a este se le asigna un porcentaje de su salario mensual 
que depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
Tiempo					        Utilidad
	Menos de 1 año	11	meses			5 % del salario
	1 año o más y menos de 2 años	12-23meses		7% del salario
	2 años o más y menos de 5 años	24-59 meses		10% del salario
	5 años o más y menos de 10 años	60-119mese		15% del salario
	10 años o más		120-meses			20% del salario

 */
package salario;

import java.util.Scanner;

/**
 *
 * @author karol martinez
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
       double saldo;
        int tiempo;
        System.out.println("Porfavor ingrese su salario");
        saldo= leer.nextDouble();
        System.out.println(" ingrese el tiempo que lleva en la empresa en meses ");
        tiempo  = leer.nextInt();
        
        if (tiempo<12){
            
        saldo=saldo+(saldo*0.05);
        
        
        }
        else {
        if ((tiempo>=12)&&(tiempo<=23)){
            saldo=saldo+(saldo*0.07); 
        }
        else {
        if ((tiempo>=24)&&(tiempo<=59)){
             saldo=saldo+(saldo*0.1);
        }
        else {
        if ((tiempo>=60)&&(tiempo<=119)){
             saldo=saldo+(saldo*0.15);
        
        }
        else{ 
             saldo=saldo+(saldo*0.2);}
        }
        }
            
        }
     
        System.out.println("su saldo es de :"+saldo);
    }
    
}
