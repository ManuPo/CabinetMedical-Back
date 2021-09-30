package fr.semifir.cabinet_infirmier.controllers;


import fr.semifir.cabinet_infirmier.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {

    @Autowired
    private PatientService patientService;


}
