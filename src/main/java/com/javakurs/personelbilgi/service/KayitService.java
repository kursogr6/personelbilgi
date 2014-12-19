/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakurs.personelbilgi.service;

import com.javakurs.personelbilgi.entity.Kisi;
import com.javakurs.personelbilgi.facade.KisiFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author CAN
 */
@Stateless
public class KayitService {
    @EJB
    private KisiFacade kisiFacade;

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void Ekle(Kisi p_kisi){
    kisiFacade.create(p_kisi);
    }
}
