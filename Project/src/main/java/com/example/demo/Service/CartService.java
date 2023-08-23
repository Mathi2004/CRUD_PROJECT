package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CartModel;
import com.example.demo.Repository.CartRepo;

@Service
public class CartService {
    @Autowired
    CartRepo cr;
    public CartModel saveinfo(CartModel cm)
    {
    	return cr.save(cm);
    }
    public List<CartModel> savedetails(List<CartModel> cm)
    {
    	return cr.saveAll(cm);
    }
    public List<CartModel> showinfo()
    {
    	return cr.findAll();
    }
    public Optional<CartModel> showById(int cartItemId)
    {
    	return cr.findById(cartItemId);
    }
    public CartModel update(CartModel cm)
    {
    	return cr.saveAndFlush(cm);
    }
    public String updateById(int cartItemId,CartModel cm)
    {
    	cr.saveAndFlush(cm);
    	if(cr.existsById(cartItemId))
    	{
    		return "update";
    	}
    	else
    	{
    		return "enter valid id";
    	}
    }
    public void deleteinfo(CartModel cm)
    {
    	 cr.delete(cm);
    }
    public void deleteById(int cartItemId)
    {
    	cr.deleteById(cartItemId);
    }
}
