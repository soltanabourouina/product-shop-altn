package io.back.altenshop.controller;

import io.back.altenshop.model.Product;
import io.back.altenshop.service.ProductService;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class ProductController {
    @Autowired  //deprecated ????????
    private ProductService productService;
    @RequestMapping("/products")
   public List <Product> getProduct() {
    return productService.getProducts();
   }
    @RequestMapping("/products/{id}")
   public Product getpProduct(@PathVariable long id){
       return productService.getProduct(id);
   }
    @RequestMapping(method = RequestMethod.DELETE, value="/products/{id}")
   public void deleteProduct(@PathVariable long id){
        productService.deleteProduct(id);
   }
    @RequestMapping(method = RequestMethod.POST, value="/products")
   public void addProduct (@RequestBody Product product){
        productService.addProduct(product);
   }
    @RequestMapping(method = RequestMethod.PATCH, value="/products/{id}")
   public void updateProduct(@RequestBody Product product, @PathVariable long id){
       productService.updateProduct(product,id);
   }

//    @RequestMapping(method = RequestMethod.PATCH, value="/products/{id}")
//    public void patchProduct(@RequestBody Map<String, Object> product, @PathVariable long id) {
//        productService.patchProduct(product, id);
//    }

}
