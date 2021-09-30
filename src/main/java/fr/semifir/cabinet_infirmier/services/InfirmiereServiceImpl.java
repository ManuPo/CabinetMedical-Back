package fr.semifir.cabinet_infirmier.services;

import fr.semifir.cabinet_infirmier.repositories.InfirmiereRepository;

public class InfirmiereServiceImpl implements InfirmiereService{

    private InfirmiereRepository infirmiereRepository;

    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository) {
        this.infirmiereRepository = infirmiereRepository;
    }
}
