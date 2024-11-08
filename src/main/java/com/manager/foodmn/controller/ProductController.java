package com.manager.foodmn.controller;

import com.manager.foodmn.model.Product;
import com.manager.foodmn.repository.ProductRepository;
import com.manager.foodmn.service.ProductService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Named
@ViewScoped
public class ProductController {
    @Autowired
//    private ProductService productService=;
    private ProductRepository productRepository;
    @Getter
    @Setter
    private Product product = new Product();


    public void save()
    {
        productRepository.save(product);
    }

//    @GetMapping
//    public ResponseEntity<List<Product>> findAll(){
//        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id){
//        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<Product> create(@RequestBody Product product){
//        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
//    }
//
//    @PutMapping
//    public ResponseEntity<Product> update(@RequestBody Product product){
//        return ResponseEntity.status(HttpStatus.OK).body(productService.update(product));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id){
//        productService.deleteById(id);
//        return ResponseEntity.status(HttpStatus.OK).build();
//    }

}