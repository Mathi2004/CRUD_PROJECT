package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CartModel;
import com.example.demo.Service.CartService;

@RestController
public class CartController {
    @Autowired
    CartService cs;
    @PostMapping("addcart")
    public CartModel add(@RequestBody CartModel cm)
    {
    	return cs.saveinfo(cm);
    }
    @PostMapping("addncart")
    public List<CartModel> adddetails(@RequestBody List<CartModel> cm)
    {
    	return cs.savedetails(cm);
    }
    @GetMapping("showcartdetails")
    public List<CartModel> display()
    {
    	return cs.showinfo();
    }
    @GetMapping("showBycartId/{cartItemId}")
    public Optional <CartModel> displayById(@PathVariable int cartItemId)
    {
    	return cs.showById(cartItemId);
    }
    @PutMapping("updateCart")
    public CartModel modify(@RequestBody CartModel cm)
    {
    	return cs.update(cm);
    }
    @PutMapping("updateBycartId/{cartItemId}")
    public String modifyById(@PathVariable int cartItemId,@RequestBody CartModel cm)
    {
    	return cs.updateById(cartItemId, cm);
    }
    @DeleteMapping("deletecart")
    public void remove(@RequestBody CartModel cm)
    {
    	cs.deleteinfo(cm);
    }
    @DeleteMapping("deleteBycartId/{cartItemId}")
    public void removeById(@PathVariable int  cartItemId)
    {
    	cs.deleteById(cartItemId);
    }
    
    
}
