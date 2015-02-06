/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.embrella.bundary;

import com.embrella.entities.Goaluser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mamadou
 */
@Stateless
public class GoaluserFacade extends AbstractFacade<Goaluser> {
    @PersistenceContext(unitName = "LoginJaasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GoaluserFacade() {
        super(Goaluser.class);
    }
    
}
