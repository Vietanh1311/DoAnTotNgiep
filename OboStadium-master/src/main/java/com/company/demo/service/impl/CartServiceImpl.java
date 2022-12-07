//package com.company.demo.service.impl;
//
//import com.company.demo.entity.Cart;
//import com.company.demo.repository.CartRepository;
//import com.company.demo.repository.ProductRepository;
//import com.company.demo.repository.ProductSizeRepository;
//import com.company.demo.service.CartService;
//import com.company.demo.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class CartServiceImpl implements CartService {
//    private final CartRepository cartRepository;
//    private final ProductRepository productRepository;
//    private final ProductSizeRepository productSizeRepository;
//    private final ProductService productService;
//
//    public CartServiceImpl(CartRepository cartRepository, ProductRepository productRepository, ProductSizeRepository productSizeRepository, ProductService productService) {
//        this.cartRepository = cartRepository;
//        this.productRepository = productRepository;
//        this.productSizeRepository = productSizeRepository;
//        this.productService = productService;
//    }
//
//    @Override
//    public Long sumPrice() {
//        return null;
//    }
//
//    @Override
//    public List<Cart> listCart() {
//        return null;
//    }
//
//    @Override
//    public void addToCart(String idProduct) {
//
//
//    }
//
//    @Override
//    public Cart updateQuantity(String idProduct, Integer quantity) {
//        return null;
//    }
//
//    @Override
//    public void delete(String idProduct) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
