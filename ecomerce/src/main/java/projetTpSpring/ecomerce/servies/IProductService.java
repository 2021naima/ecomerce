package projetTpSpring.ecomerce.servies;


import projetTpSpring.ecomerce.entities.Product;

import java.util.List;

public interface IProductService {
    public void updateProduct(String nomp,String nomc);
    public List<Product> findAll();
    public Product findById(Long id);
    public Product save(Product product);
    public Product upProduct(Long id,Product product);
    public void deleteById(Long id);
    public void productCat(String nomp,String nomc);
    public Product findByMatiere(String nomMatiereP);
}
