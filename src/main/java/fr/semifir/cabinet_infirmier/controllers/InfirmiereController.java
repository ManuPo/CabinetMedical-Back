package fr.semifir.cabinet_infirmier.controllers;


import fr.semifir.cabinet_infirmier.models.DTO.DeplacementDTO;
import fr.semifir.cabinet_infirmier.models.Infirmiere;
import fr.semifir.cabinet_infirmier.services.InfirmiereService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("infirmieres")
public class InfirmiereController {

    private static Logger LOGGER = LoggerFactory.getLogger(InfirmiereController.class);

    @Autowired
    private InfirmiereService infirmiereService;

    @GetMapping
    public List<Infirmiere> getInfirmieres(){
        return this.infirmiereService.getInfirmieres();
    }

    @GetMapping("{id}")
    public Infirmiere getInfirmiere(@PathVariable Integer id){
        return this.infirmiereService.getInfirmiere(id);
    }

    @PostMapping
    public Infirmiere postInfirmiere(@RequestBody Infirmiere infirmiere){
        return this.infirmiereService.postInfirmiere(infirmiere);
    }

    @PutMapping
    public Infirmiere putInfirmiere(@RequestBody Infirmiere infirmiere){
        return this.infirmiereService.putInfirmiere(infirmiere);
    }

    @DeleteMapping("{id}")
    public void deleteInfirmiere(@PathVariable Integer id){
        this.infirmiereService.deleteInfirmiere(id);
    }

    @GetMapping("{id}/deplacements")
    public List<DeplacementDTO> getDeplacements(@PathVariable Integer id){
        return  this.infirmiereService.getDeplacements(id);
    }
}
