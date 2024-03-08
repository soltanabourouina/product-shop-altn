package io.back.altenshop.service;

import io.back.altenshop.model.Product;
import io.back.altenshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    private ArrayList<Product> products = new ArrayList<>();


    public List<Product> getProducts() {
        List<Product> products =new ArrayList<>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }

    public Product getProduct(long id) {
        return productRepository.findById(id).orElse(null) ;
    }


    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product, long id) {
        productRepository.save(product);// c'est pas bon
        //MapStruct
    }

    //    public void patchProduct(Product updatedProduct, long id) {
//        products.stream()
//                .filter(product -> product.getId() == id)
//                .findFirst()
//                .ifPresent(product -> {
//                    product.forEach((key, value) -> {
//                        switch (key) {
//                            case "name":
//                                product.setName((String) value);
//                                break;
//                            case "price":
//                                product.setPrice((double) value);
//                                break;
//                            case "code":
//                                product.setCode((String) value);
//                                break;
//                            // etc ...
//                        }
//                    });
//                });
// je n'arrive pas a faire fonctionner le patch
}
