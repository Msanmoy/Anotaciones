package org.anotaciones.Ejercicio1.Modelos;

import org.anotaciones.Ejercicio1.Anotaciones.Empleado;

import java.util.ArrayList;
import java.util.List;

@Empleado(
        nombre = "Sofia",
        apellido = "Orellana",
        dni = "12345678A",
        direccion = "C/ Ibiza 1 29640",
        telefono = 123456789,
        clase = "Directivo",
        codigoDespacho = 1
)

@Empleado(
        nombre = "Alejandro",
        apellido = "Sanchez",
        dni = "98765432B",
        direccion = "C/ Santa Gema 1 29640",
        telefono = 987654321,
        clase = "Oficial",
        codigoDespacho = 2
)

@Empleado(
        nombre = "Manuel",
        apellido = "Sanchez",
        dni = "29384756C",
        direccion = "C/ Santa Gema 1 29640",
        telefono = 918273764,
        clase = "Tecnico",
        codigoDespacho = 3
)

public class Empresa {
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public static Empresa cargadorDeContexto(){
        Empresa empresa = new Empresa();
        Empleado[] empleados = Empresa.class.getAnnotationsByType(Empleado.class);
        List<Empleado> Empl = new ArrayList<>();

        for (Empleado emp : empleados){
            String clase = emp.clase();

            if (clase.equals("Oficial")){
                Oficial oficial = new Oficial();
                Empleo(oficial,emp);
                Empl.add(emp);
            } else if (clase.equals("Tecnico")){
                Tecnico tecnico = new Tecnico();
                Empleo(tecnico,emp);
                Empl.add(emp);
            } else if (clase.equals("Directivo")){
                Directivo directivo = new Directivo();
                Empleo(directivo,emp);
                Empl.add(emp);
            }
        }

        empresa.setEmpleados(Empl);
        return empresa;
    }

    private static void Empleo(org.anotaciones.Ejercicio1.Modelos.Empleado emp, Empleado anotacion){
        emp.setNombre(anotacion.nombre());
        emp.setApellido(anotacion.apellido());
        emp.setDni(anotacion.dni());
        emp.setDireccion(anotacion.direccion());
        emp.setTelefono(anotacion.telefono());
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {return empleados.toString();}
}
