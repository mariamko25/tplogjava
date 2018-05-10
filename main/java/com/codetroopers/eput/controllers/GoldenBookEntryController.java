package com.codetroopers.eput.controllers;

import com.codetroopers.eput.domain.entities.GoldenBookEntry;
import com.codetroopers.eput.models.UserInfo;
import com.codetroopers.eput.services.GoldenBookEntryService;

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
public class GoldenBookEntryController {
    @Inject
    UserInfo userInfo;
    @Inject
    GoldenBookEntryService goldenBookEntryService;
    @Inject
    FacesContext facesContext;
    
   

    private GoldenBookEntry newEntry;
    
    
    public String insertNewEntry() {
        //here we persist our new Entry value
    	if(newEntry.getNote()>=0 && newEntry.getNote()<=10)
    	{
    		
        goldenBookEntryService.insertNewGoldenBookEntry(newEntry);
        return "entries" + "?faces-redirect=true";
    	}
    		facesContext.addMessage("Invalid note", new FacesMessage("Invalid note !"));
        return null;
    }
    
    public String deleteEntry(GoldenBookEntry entry) 
    {
	    	goldenBookEntryService.deleteNewGoldenBookEntry(entry);
	    	return "deleteEntry";
    
    }
   
    @Produces
    @Named
    public GoldenBookEntry newBookEntry() {
        return newEntry;
    }
   
    
   

    @PostConstruct
    public void initClass() {
        newEntry = new GoldenBookEntry();
        if (userInfo.getLoggedIn()) {
            newEntry.setAuthor(userInfo.getName());
        }
    }
}
