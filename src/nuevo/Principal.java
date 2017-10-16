package nuevo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor Profesor = new Profesor( );
		
		String entradaTexto;
		int entradaNumero;
		 
		//Profesor.setNombre("Sebastián");
		//Profesor.setApellido("Barrionuevo");
		//Profesor.setEdad(23);
		
		Scanner leer=new Scanner(System.in);  
		
        System.out.println("Ingrese el nombre ");
        entradaTexto  = leer.nextLine();
        Profesor.setNombre(entradaTexto);
        //arganin.setSueldo(scanner.nextInt());
        
        System.out.println("Ingrese el apellido ");
        entradaTexto  = leer.nextLine();
        Profesor.setApellido(entradaTexto);
        
//        System.out.println("Ingrese la edad ");
//        entradaNumero  = leer.nextInt();
//        Profesor.setEdad(entradaNumero);
        
        System.out.println("Ingrese Nº legajo ");
        entradaNumero  = leer.nextInt();
        Profesor.setNro_legajo(entradaNumero);
        
        System.out.println("Ingrese nacimiento_dia ");
        entradaNumero  = leer.nextInt();
        Profesor.setNacimiento_dia(entradaNumero);
        
        System.out.println("Ingrese nacimiento_mes ");
        entradaNumero  = leer.nextInt();
        Profesor.setNacimiento_mes(entradaNumero);
        
        System.out.println("Ingrese nacimiento_anno ");
        entradaNumero  = leer.nextInt();
        Profesor.setNacimiento_anno(entradaNumero);
        
        System.out.println("Ingrese sueldo ");
        entradaNumero  = leer.nextInt();
        Profesor.setSueldo(entradaNumero);
        
        System.out.println("¿¿Aumenta Sueldo??");
        entradaNumero  = leer.nextInt();
        Profesor.setAumento(entradaNumero);
		
		System.out.println(Profesor.toString());
		
		
		Profesor p1 = new Profesor( );		
        p1.setNro_legajo(1500);
        System.out.println("-------p1-------");
        System.out.println(p1.toString());		
        
        Profesor p2 = new Profesor("Juan", "Pérez", 40, 1500, 1,1,1980,1000);
        System.out.println("-------p2-------");
        System.out.println(p2.toString());	
				
	}

}
