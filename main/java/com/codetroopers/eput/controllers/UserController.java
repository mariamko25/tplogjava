package com.codetroopers.eput.controllers;

import com.codetroopers.eput.domain.entities.GoldenBookEntry;
import com.codetroopers.eput.domain.entities.User;
import com.codetroopers.eput.models.UserInfo;
import com.codetroopers.eput.services.GoldenBookEntryService;
import com.codetroopers.eput.services.UserService;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class UserController {
    
    @Inject
    UserService userService;
    @Inject
    FacesContext facesContext;
    
   

    
    
    public String delete(User user) 
    {
    		userService.delete(user);
	    	return "users";
    
    }
   
    
   

    @PostConstruct
    public void initClass() {
        
    }
}
