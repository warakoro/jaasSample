/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.embrella.statup;


import com.embrella.bundary.GoaluserFacade;
import com.embrella.entities.Goaluser;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author mamadou
 */
@Singleton
@Startup
public class StartSingleton {
    
    private Goaluser mUser; 
    @Inject
    private GoaluserFacade GUFacade;

    @PostConstruct
    private void initApp(){
        System.out.println("StartSingleton in initApp()"); 
         mUser = new Goaluser();

        mUser.setUsername("mamadou");
        mUser.setPassword("8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918"); // this is  admin hashed in SHA-256
        mUser.setUrole("USER_ROLE");
        this.GUFacade.create(mUser);    
        
    }
   
        
}
