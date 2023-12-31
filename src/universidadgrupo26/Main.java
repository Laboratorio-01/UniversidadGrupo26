package universidadgrupo26;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import entidades.Inscripcion;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Método guardarAlumno
        //Alumno alumno=new Alumno(40,25780235, "Sheeran", "Ed", LocalDate.of(1988,9,28),true);
        AlumnoData alumnoData = new AlumnoData();
        /*alumnoData.guardarAlumno(alumno);*/

        //Método buscarAlumno por id
        /*Alumno encontrado=alumnoData.buscarAlumno(40);
        System.out.println("dni: "+encontrado.getDni());
        System.out.println("apellido: "+encontrado.getApellido());
        System.out.println("nombre: "+encontrado.getNombre());*/
        //Método buscarAlumnoPorDni
        /*Alumno encontradodni=alumnoData.buscarAlumnoPorDni(25789456);
        System.out.println("apellido: "+encontradodni.getApellido());
        System.out.println("nombre: "+encontradodni.getNombre());*/
        //Método listarAlumno
        /*Alumno lista=alumnoData.listarAlumnos(); 
        for (Alumno alumno:alumnoData.listarAlumnos()){
             System.out.println(alumno.getIdAlumno());
             System.out.println(alumno.getApellido());
             System.out.println(alumno.getNombre());
        }*/
        //Metodo modificarAlumno
        /*alumnoData.modificarAlumno(alumno);
        //Método eliminarAlumno*/
        //alumnoData.eliminarAlumno(190);
        //Metodo guardarMateria
//        Materia materia = new Materia("Fisica II", 3, true);
        MateriaData materiaData = new MateriaData();
//        materiaData.guardarMateria(materia);

        //Método buscar Materia        
        //Materia materiaEncontrada = materiaData.buscarMateria();
        /*if (materiaEncontrada != null) {
            System.out.println("Id: " + materiaEncontrada.getIdMateria());
            System.out.println("Nombre: " + materiaEncontrada.getNombre());
            System.out.println("Año: " + materiaEncontrada.getAnioMateria());

        } else {
            System.out.println("Materia no encontrada.");
        }

        //Método para Actualizar Materia     
        
        Materia materiaNew=new Materia(100,"Sistemas Operativos IV", 2, true);
        materiaData.modificarMateria(materiaNew);*/
        //Método eliminarMateria
        //materiaData.eliminarMateria(7);
        //Método listarMaterias
        /*List<Materia>materias=new ArrayList();
        materias=materiaData.listarMaterias();
        System.out.println("          Listado de materias vigentes a la fecha");
        System.out.println("  ");
        for (Materia materia : materias) {
            System.out.println("Id: " +materia.getIdMateria());
            System.out.println("nombre: " +materia.getNombre());
            System.out.println("Año: " +materia.getAnioMateria());
            System.out.println("  ");
        }*/
        //Método guardarInscripcion
        /*Alumno alumno = alumnoData.buscarAlumno(9);
        Materia materia = materiaData.buscarMateria(4);
        Inscripcion inscripcion = new Inscripcion(alumno, materia, 8);*/
        InscripcionData inscripcionData = new InscripcionData();
        //inscripcionData.guardarInscripcion(inscripcion);

        //Método obtenerInscripciones  
        //List<Inscripcion> inscripciones = new ArrayList();
        //inscripciones = inscripcionData.obtenerInscripciones();
        //Método obetenerInscripcionesPorAlumno
        /*inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(1);
        System.out.println("Listado de Inscripciones");
        System.out.println(" ");
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println("Id: " + inscripcion.getIdInscripcion());
            System.out.println("apellido: " + inscripcion.getAlumno().getApellido());
            System.out.println("materia: " + inscripcion.getMateria().getNombre());
            System.out.println("==========================");

        }*/
        //Método obtenerMateriasCursadas
        /*List<Materia> listaCursadas = new ArrayList();
        listaCursadas=inscripcionData.obtenerMateriasCursadas(1);
        System.out.println("Listado de Materias Cursadas");
        System.out.println(" ");
        for (Materia listaCursada : listaCursadas) {
            System.out.println("Id " +listaCursada.getIdMateria());
            System.out.println("Nombre "+listaCursada.getNombre());
            System.out.println("Año "+listaCursada.getAnioMateria());
            System.out.println("==========================");
            
        }*/
        //Método obtenerMateriasNoCursadas
        /*List<Materia> listaNoCursadas = new ArrayList();
        listaNoCursadas=inscripcionData.obtenerMateriasNoCursadas(1);
        System.out.println("Listado de Materias No Cursadas");
        System.out.println(" ");
        for (Materia listaNoCursada : listaNoCursadas) {
            System.out.println("Id " +listaNoCursada.getIdMateria());
            System.out.println("Nombre "+listaNoCursada.getNombre());
            System.out.println("Año "+listaNoCursada.getAnioMateria());
            System.out.println("==========================");
        
        }*/
        //Método borrarInscripcionMateriaAlumno
        //inscripcionData.borrarInscripcionMateriaAlumno(1, 2);
        //Método actualizarNota
        //inscripcionData.actualizarNota(1, 1, 10);
        //TODO Agregar sout para mostrar materia
        
        //Método obtenerAlumnosPorMateria
        List<Alumno> alumnoPorMateria = new ArrayList<>();
        alumnoPorMateria = inscripcionData.obtenerAlumnoPorMateria(1);
        System.out.println("Listado de Alumnos Por Materia");
        System.out.println(" ");
        if (!alumnoPorMateria.isEmpty()) {
            for (Alumno alumnoPorMaterias : alumnoPorMateria) {
                System.out.println("idAlumno " + alumnoPorMaterias.getIdAlumno());
                System.out.println("DNI " + alumnoPorMaterias.getDni());
                System.out.println("Apellido " + alumnoPorMaterias.getApellido());
                System.out.println("Nombre " + alumnoPorMaterias.getNombre());
                System.out.println("==========================");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay alumnos inscriptos en esta materia");
        }
        
        //Prueba Método 
    }
}
