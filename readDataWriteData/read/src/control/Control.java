/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Manipaltion;
import vue.Vue;

/**
 *
 * @author 1795162
 */
public class Control {
    private Manipaltion mani; 
private Vue vue;

    public Control(Manipaltion mani, Vue vue) {
        
        this.mani=mani;
        this.vue = vue ;
    }
    
}
