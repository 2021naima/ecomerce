package projetTpSpring.ecomerce.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProduitMatiereKey implements Serializable {

    @Column(name = "product_id")
    Long idProduit;

    @Column(name = "matiere_id")
    Long idMatierePremiere;


}
