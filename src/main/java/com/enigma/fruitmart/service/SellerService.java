package com.enigma.fruitmart.service;

import com.enigma.fruitmart.entitas.Seller;

import java.util.List;

public interface SellerService {
    Seller saveSeller (Seller seller);
    Seller updateSeller (Seller seller);
    List<Seller> getAllSeller();
    Seller getSellerById (String id);
    Seller getSellerByEmail(String email);
    void deleteSeller (String id);
    List<Seller> searchSellerByName (String sellerName);



}
