package com.weatherspoon.CRUDWeek.controller;


import com.weatherspoon.CRUDWeek.model.Product;
import com.weatherspoon.CRUDWeek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity <List<Product>> getAllProduct(){
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id, @RequestBody Product product){
        product.setId(id);
        return  ResponseEntity.ok().body(this.productService.updateProduct(product));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product){
        product.setId(id);
        return ResponseEntity.ok().body(this.productService.updateProduct(product));
    }

    @DeleteMapping("/product/{id}")
    public HttpStatus deleteProducts(@PathVariable long id){
        this.productService.deleteProduct(id);
        return  HttpStatus.OK;
    }
}
