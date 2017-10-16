package nuevo;

public class Profesor {
	
	private String nombre;
	private String apellido;
	private int edad; 
	private int nro_legajo; 
	private int nacimiento_dia;
	private int nacimiento_mes;
	private int nacimiento_anno;
	private int sueldo;
	private int aumento;
	
	
		
	public Profesor() {
		this.nombre="NN";
		this.apellido="AA";
		this.edad = 18; 
		this.nro_legajo = 9999; 
		this.nacimiento_dia = 1;
		this.nacimiento_mes = 1;
		this.nacimiento_anno = 9999;
		this.sueldo = 0;
	}
	
	public Profesor(String nombre, String apellido, int edad, int nro_legajo, int nacimiento_dia, int nacimiento_mes, int nacimiento_anno, int sueldo) {
		this.nombre= nombre;
		this.apellido=apellido;
		this.edad = edad; 
		this.nro_legajo = nro_legajo; 
		this.nacimiento_dia = nacimiento_dia;
		this.nacimiento_mes = nacimiento_mes;
		this.nacimiento_anno = nacimiento_anno;
		this.sueldo = sueldo;
	}
	
	public String toString (){
        String mensaje="nombre: \t\t "+nombre+"\rapellido: \t\t "+apellido+" \redad:\t\t\t "+edad+" años "+"\rnro_legajo: \t\t "+nro_legajo+"\rnacimiento_dia: \t "+nacimiento_dia+"\rnacimiento_mes: \t "+nacimiento_mes+"\rnacimiento_anno: \t "+nacimiento_anno+"\rsueldo: \t\t "+sueldo;
        				
        return mensaje;
    }
		

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


//	public void setEdad(int edad) {
//		this.edad = edad;
//	}


	public int getNro_legajo() {
		return nro_legajo;
	}


	public void setNro_legajo(int nro_legajo) {
		if ((nro_legajo >= 1000 && nro_legajo < 2000)|| nro_legajo == 9999){//sea mayor o igual a 1000 y menor a 2000,, Ó bien igual a 9999.
			this.nro_legajo = nro_legajo;
		}           
	}


	public int getNacimiento_dia() {
		return nacimiento_dia;
	}


	public void setNacimiento_dia(int nacimiento_dia) {
		if (nacimiento_dia >= 1 && nacimiento_dia <= 31){ //número entre 1 y	31 (incluídos).
		this.nacimiento_dia = nacimiento_dia; 
		}
	}


	public int getNacimiento_mes() {
		return nacimiento_mes;
	}


	public void setNacimiento_mes(int nacimiento_mes) {
		if (nacimiento_mes >= 1 && nacimiento_mes <= 12){ // número entre 1 y	12 (incluídos).
		this.nacimiento_mes = nacimiento_mes;  
		}
	}


	public int getNacimiento_anno(int Nacimiento_anno) {
		
		return nacimiento_anno;
	}


	public void setNacimiento_anno(int nacimiento_anno) {
		if (nacimiento_anno >= 1950 && nacimiento_anno < 2017){ // sea mayor o igual a 1950 y menor a 2017.
			this.nacimiento_anno = nacimiento_anno;
			this.edad = (2017 - nacimiento_anno);
		}
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		if (sueldo < 0 ){ //  sueldo no puede contener valores negativos; en caso de querer ingresar un valor negativo, transformar el mismo a positivo yguardar el valor positivo.
			this.sueldo = Math.abs(sueldo);										
		}							
		else {			
			this.sueldo = sueldo;
		}
	}
	
	public void setAumento(int aumento) {
		
			this.sueldo = (this.sueldo+aumento);
		
	}	
}


