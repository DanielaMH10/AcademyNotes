package com.acanotes.demo.servicio;

import java.util.List;
import com.acanotes.demo.entidad.Estudiante;

public interface EstudianteServicio {
    
    public List<Estudiante> listarTodosLosEstudiantes();
    
    public Estudiante guardarEstudiante(Estudiante estudiante);
    
    public Estudiante obtenerEstudiantePorId(Long id);
    
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    
    public void eliminarEstudiante(Long id);
    
}
