package fr.semifir.cabinet_infirmier;

import fr.semifir.cabinet_infirmier.repositories.InfirmiereRepository;
import fr.semifir.cabinet_infirmier.repositories.PatientRepository;
import fr.semifir.cabinet_infirmier.services.InfirmiereService;
import fr.semifir.cabinet_infirmier.services.InfirmiereServiceImpl;
import fr.semifir.cabinet_infirmier.services.PatientService;
import fr.semifir.cabinet_infirmier.services.PatientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository infirmiereRepository){
        return new InfirmiereServiceImpl(infirmiereRepository);
    }

    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);
    }
}
