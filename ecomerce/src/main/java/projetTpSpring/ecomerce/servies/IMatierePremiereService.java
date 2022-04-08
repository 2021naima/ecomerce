package projetTpSpring.ecomerce.servies.repositories;


import projetTpSpring.ecomerce.entities.MatierePremiere;
import projetTpSpring.ecomerce.exception.MatiereDejaExist;

public interface IMatierePremiereService {
    public MatierePremiere findByNom(String nom);
    public void addMatierePremiere(MatierePremiere matierePremiere) throws MatiereDejaExist;
}
