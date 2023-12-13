package com.ahmedbenismail.angularproject.controller;
import com.ahmedbenismail.angularproject.exception.ResourceNotFoundException;
import com.ahmedbenismail.angularproject.model.Product;
import com.ahmedbenismail.angularproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable  long id){
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not exist with id:" + id));
        return ResponseEntity.ok(product);
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id,@RequestBody Product productDetails) {
        Product updateProduct = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not exist with id: " + id));

        updateProduct.setReference(productDetails.getReference());
        updateProduct.setDesignation(productDetails.getDesignation());
        updateProduct.setImageart(productDetails.getImageart());
        updateProduct.setMarque(productDetails.getMarque());
        updateProduct.setPrix(productDetails.getPrix());
        updateProduct.setQtestock(productDetails.getQtestock());
        updateProduct.setScategorieID(productDetails.getScategorieID());




        productRepository.save(updateProduct);

        return ResponseEntity.ok(updateProduct);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long id){

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not exist with id: " + id));

        productRepository.delete(product);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}