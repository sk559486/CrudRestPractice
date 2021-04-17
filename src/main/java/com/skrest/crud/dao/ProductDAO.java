package com.skrest.crud.dao;

import com.skrest.crud.model.ProductEntity;

import java.util.List;

/**
 * DAO interface for Product to perform CRUD operation.
 * @author Santosh Kumar
 * @version 1.0
 */
public interface ProductDAO {

    void addProduct(ProductEntity productEntity);

    void addProducts(List<ProductEntity> productEntity);

    ProductEntity getProductById(Long productId);

    List<ProductEntity> getProductByIds(List<Long> productId);

    ProductEntity updateProductById(Long productId, ProductEntity productEntity);

    List<ProductEntity> updateProducts(List<ProductEntity> productEntity);

    void deleteProduct(Long productId);

    void deleteProducts(List<Long> productId);

    long getProductsCount();

    long getProductsCountWithCurrency(String currencyCode);

    List<ProductEntity> getAllProducts();
}
