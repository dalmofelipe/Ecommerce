package com.dalmofelipe.StockMicroSrvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalmofelipe.StockMicroSrvc.models.Stock;
import com.dalmofelipe.StockMicroSrvc.records.StockControl;
import com.dalmofelipe.StockMicroSrvc.services.StockService;

@RestController
@RequestMapping("/api")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/stock/products")
    public ResponseEntity<Stock> registerControl(@Validated @RequestBody StockControl control) {
        return ResponseEntity.ok(stockService.registerControl(control));
    }

    @GetMapping("/stock/products")
    public ResponseEntity<List<Stock>> listAll() {
        return ResponseEntity.ok(stockService.listAll());
    }

}
