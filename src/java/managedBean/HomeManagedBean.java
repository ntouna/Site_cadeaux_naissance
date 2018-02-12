/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author khoza
 */
@Named(value = "homeManagedBean")
@SessionScoped
public class HomeManagedBean implements Serializable {

    /**
     * Creates a new instance of HomeManagedBean
     */
    public HomeManagedBean() {
    }
    
}
