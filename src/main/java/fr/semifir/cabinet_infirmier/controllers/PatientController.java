package fr.semifir.cabinet_infirmier.controllers;


import fr.semifir.cabinet_infirmier.models.DTO.DeplacementDTO;
import fr.semifir.cabinet_infirmier.models.Patient;
import fr.semifir.cabinet_infirmier.services.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {

    private static Logger LOGGER = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getPatients(){
        return this.patientService.getPatients();
    }

    @GetMapping("{id}")
    public Patient getPatient(@PathVariable Integer id){
        return this.patientService.getPatient(id);
    }

    @PostMapping
    public Patient postPatient(@RequestBody Patient patient){
        return this.patientService.postPatient(patient);
    }

    @PutMapping
    public Patient putPatient(@RequestBody Patient patient){
        return this.patientService.putPatient(patient);
    }

    @DeleteMapping("{id}")
    public void deletePatient(@PathVariable Integer id){
        this.patientService.deletePatient(id);
    }

    @GetMapping("{id}/deplacements")
    public List<DeplacementDTO> getDeplacements(@PathVariable Integer id){
        return this.patientService.getDeplacements(id);
    }


}
