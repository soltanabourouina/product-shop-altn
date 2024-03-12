package io.back.altenshop.controller;

import io.back.altenshop.DTO.ProductDto;
import io.back.altenshop.model.Product;
import io.back.altenshop.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

  /*  @GetMapping("/products")
    public String getJsonContent() throws IOException {
        return productService.readJsonFile();
    }*/
     @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable long id) {
        return productService.getProduct(id);
    }

  // @RequestMapping(method = RequestMethod.DELETE, value="/products/{id}")
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
    }
  //  @RequestMapping(method = RequestMethod.POST, value="/products")
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
    //@RequestMapping(method = RequestMethod.PATCH, value="/products/{id}")

    @PutMapping("/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable long id) {
        productService.updateProduct(product, id);
    }

    @PatchMapping("/products/{id}")
    public void patchProduct(@RequestBody ProductDto patchDTO, @PathVariable long id) {
        productService.patchProduct(patchDTO, id);
    }
}