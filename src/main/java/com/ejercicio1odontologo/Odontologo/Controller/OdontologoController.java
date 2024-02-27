
package com.ejercicio1restaurante.Odontologo.Controller;

import com.ejercicio1restaurante.Odontologo.Models.paciente;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdontologoController {
    
    @GetMapping ("pacientes")
    public List<paciente> todosLosPacientes(){
        
        List<paciente> pacientesList = new ArrayList<>();

        pacientesList.add(new paciente(1,44422112,"Sandra", "Gimenez", LocalDate.of(2002, 12, 21)));
        pacientesList.add(new paciente(2,44222112,"Pedro", "Fernandez", LocalDate.of(2011, 2, 24)));
        pacientesList.add(new paciente(3,43425122,"Juan", "Perez", LocalDate.of(2000, 5, 12)));
        pacientesList.add(new paciente(4,44123112,"Federico", "Riggy", LocalDate.of(2006, 1, 4)));
        pacientesList.add(new paciente(5,45475412,"Lucas", "Soza", LocalDate.of(2002, 12, 21)));

        
        
        return pacientesList;
    }
    
    @GetMapping ("pacientes/menores")
    public List<paciente> pacientesMayores(){
        List<paciente> pacientesList = new ArrayList<>();
        
        /*Simulacion de base d datos*/
        pacientesList.add(new paciente(1,44422112,"Sandra", "Gimenez", LocalDate.of(2001, 12, 21)));
        pacientesList.add(new paciente(2,44222112,"Pedro", "Fernandez", LocalDate.of(2001, 2, 24)));
        pacientesList.add(new paciente(3,43425122,"Juan", "Perez", LocalDate.of(2000, 5, 12)));
        pacientesList.add(new paciente(4,44123112,"Federico", "Riggy", LocalDate.of(2011, 1, 4)));
        pacientesList.add(new paciente(5,45475412,"Lucas", "Soza", LocalDate.of(2012, 12, 21)));

        
         List<paciente> pacientesListMenores = new ArrayList<>();
         
         for(paciente pacientes: pacientesList){
             if(Period.between(pacientes.getFecha(), LocalDate.now()).getYears() < 18 ){
                 pacientesListMenores.add(pacientes);
             }
         }         
         
        return pacientesListMenores;       
    }
    
}
