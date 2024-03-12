package io.back.altenshop.service;

import io.back.altenshop.DTO.ProductDto;
import io.back.altenshop.model.Product;
import io.back.altenshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort.Path;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    private ArrayList<Product> products = new ArrayList<>();



    private static final String JSON_FILE_PATH = " C:\\Users\\Hp\\OneDrive\\Bureau\\product-shop-altn\\products.json";
    public String readJsonFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(objectMapper.readTree(new File(JSON_FILE_PATH)));
    }

    public void writeJsonFile(String jsonContent) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(JSON_FILE_PATH), objectMapper.readTree(jsonContent));
    }


    

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

    //patch
     public void patchProduct(ProductDto patchDTO, long id) {
        // Récupérez le produit 
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("le produit n'existe pas " + id));

      
        if (patchDTO.getName() != null) {
            existingProduct.setName(patchDTO.getName());
        }
        if (patchDTO.getDescription() != null) {
            existingProduct.setDescription(patchDTO.getDescription());
        }
        if (patchDTO.getPrice() != null) {
            existingProduct.setPrice(patchDTO.getPrice());
        }
        if (patchDTO.getQuantity() != null) {
            existingProduct.setQuantity(patchDTO.getQuantity());
        }

        if (patchDTO.getInventoryStatus() != null) {
            existingProduct.setInventoryStatus(patchDTO.getInventoryStatus());
        }
        if (patchDTO.getCategory() != null) {
            existingProduct.setCategory(patchDTO.getCategory());
        }
        if (patchDTO.getImage() != null) {
            existingProduct.setImage(patchDTO.getImage());
        }
        if (patchDTO.getRating() != null) {
            existingProduct.setRating(patchDTO.getRating());
        }
        productRepository.save(existingProduct);
    }
}

