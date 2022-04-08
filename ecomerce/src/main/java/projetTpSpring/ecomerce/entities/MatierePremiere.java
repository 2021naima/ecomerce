package projetTpSpring.ecomerce.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MatierePremiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idMatierePremiere;

    private String nom;

    @OneToMany(mappedBy = "matierePremiere",cascade = CascadeType.PERSIST)
    List<ProduitMatiereAsso> produitMatieres=new ArrayList<>();

}
