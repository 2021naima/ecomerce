package projetTpSpring.ecomerce.servies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetTpSpring.ecomerce.entities.Category;
import projetTpSpring.ecomerce.repositories.CategoryRepository;
import projetTpSpring.ecomerce.repositories.ProductRepository;
import projetTpSpring.ecomerce.entities.Product;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        return productRepository.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product upProduct(Long id, Product product) {
        Product pr = productRepository.findById(id).get();
        pr.setCurrentPrice(product.getCurrentPrice());
        return productRepository.save(pr);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void productCat(String nomp, String nomc) {
        Product pr = productRepository.findByName(nomp);
        Category cat = categoryRepository.findByName(nomc);
        pr.setCategory(cat);
        productRepository.save(pr);
    }

    @Override
    public Product findByMatiere(String nomMatiereP) {
        return null;
    }

    @Override
    public void updateProduct(String nomp, String nomc) {
        Product product = productRepository.findByName(nomp);
        Category category = categoryRepository.findByName(nomc);
        product.setCategory(category);
        productRepository.save(product);
    }

}
