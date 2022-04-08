package projetTpSpring.ecomerce.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetTpSpring.ecomerce.entities.MatierePremiere;
import projetTpSpring.ecomerce.exception.MatiereDejaExist;
import projetTpSpring.ecomerce.repositories.MatiereRepo;
import projetTpSpring.ecomerce.servies.repositories.IMatierePremiereService;

@Service
public class MatierePremiereServie implements IMatierePremiereService {

    @Autowired
    MatiereRepo matiereRepo;


    @Override
    public MatierePremiere findByNom(String nom) {
        return matiereRepo.findByNom(nom);
    }

    @Override
    public void addMatierePremiere(MatierePremiere matierePremiere)
            throws MatiereDejaExist {
        String nom = matierePremiere.getNom();
        MatierePremiere mp = this.findByNom(nom);
        if(mp!=null) throw   new MatiereDejaExist();
        else  {
            matiereRepo.save(matierePremiere);
         }

    }
}
