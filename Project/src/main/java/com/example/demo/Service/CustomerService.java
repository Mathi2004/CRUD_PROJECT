package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CustomerModel;
import com.example.demo.Repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo cr;
    public CustomerModel saveinfo(CustomerModel cm)
    {
    	return cr.save(cm);
    }
    public List<CustomerModel> savedetails(List<CustomerModel> cm)
    {
    	return cr.saveAll(cm);
    }
    public List<CustomerModel> showinfo()
    {
    	return cr.findAll();
    }
    public Optional<CustomerModel> showById(int CustomerId)
    {
    	return cr.findById(CustomerId);
    }
    public CustomerModel changeinfo(CustomerModel cm)
    {
    	return cr.saveAndFlush(cm);
    }
    public String changebyId(int CustomerId,CustomerModel cm)
    {
        cr.saveAndFlush(cm);
        if(cr.existsById(CustomerId))
        {
        	return "updated";
        }
        else
        {
        	return "enter valid id";
        }
    }
    public void deleteinfo(CustomerModel cm)
    {
        cr.delete(cm);
    }
    public void deletebyId(int CustomerId)
    {
    	cr.deleteById(CustomerId);
    }
    
}
