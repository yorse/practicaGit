/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author jose Vacas
 * Modificacion de prueba
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alum 1"); // insertado por alum1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("modificado por alum 2"); // insertado por alum2
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	//modificaciones alumno 2
	System.out.println("Alumno 2 inserta esta sentencia");
	// modificacaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");

    }
    public void testGitAux(){
	// metodo rama testing
        System.out.println("Metodo de testing");
    }
}
