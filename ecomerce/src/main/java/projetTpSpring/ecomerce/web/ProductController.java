package projetTpSpring.ecomerce.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import projetTpSpring.ecomerce.dto.ProductDto;
import projetTpSpring.ecomerce.entities.Product;
import projetTpSpring.ecomerce.servies.IProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/products")
    public List<Product> findall(){
         return  productService.findAll();
    }

    @PreAuthorize("hasAuthority('ADMIN')"+ " || hasAuthority('CLIENT')")
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Long id){
        Product pr = productService.findById(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("token","value1");
        return new ResponseEntity<>(pr, responseHeaders, HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        productService.save(product);
        return productService.save(product);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/product/{id}")
    public Product upProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.upProduct(id,product);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteById(id);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/productcat")
    public void productCat(@RequestBody ProductDto productDto) {
     productService.productCat(productDto.getProductName(),productDto.getCategoryName());
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/productcategory")
    public void productCategpry(@RequestParam String nomp,@RequestParam String nomc) {
        productService.productCat(nomp,nomc);

    }



}
