package projetTpSpring.ecomerce.servies;

import projetTpSpring.ecomerce.entities.MatierePremiere;
import projetTpSpring.ecomerce.entities.Produit;

import java.util.List;

public interface IProduitService {
    public long addProduit(Produit pr, MatierePremiere... listMatiere);
    public long addProduit(Produit pr, Long... ids);
    public List<Long> getListProduitsParMatiers(Long... idmatps);
}
