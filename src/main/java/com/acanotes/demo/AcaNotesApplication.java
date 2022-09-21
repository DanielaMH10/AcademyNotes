package com.acanotes.demo;

import com.acanotes.demo.entidad.Estudiante;
import com.acanotes.demo.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcaNotesApplication implements CommandLineRunner {

    public static void main(String[] args) {
	SpringApplication.run(AcaNotesApplication.class, args);
    }
        
    @Autowired    
    private EstudianteRepositorio repositorio;
    
    @Override
    public void run(String... args) throws Exception {
        /*Estudiante estudiante1 = new Estudiante("Christian", "Palacios", "chrispala@gmail.com");
        repositorio.save(estudiante1);
        
        Estudiante estudiante2 = new Estudiante("Daniel", "Palacios", "danipala@gmail.com");
        repositorio.save(estudiante2);*/
    }

}
