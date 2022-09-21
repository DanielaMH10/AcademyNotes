package com.acanotes.demo.repositorio;

import com.acanotes.demo.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio  extends JpaRepository<Estudiante, Long>{
    
}
