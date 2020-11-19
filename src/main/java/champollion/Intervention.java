/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

/**
 *
 * @author Anas En-guady
 */
public class Intervention {
    private Date debut ;
    private int duree ;
    private boolean annulee = false 
    private Typeintervention type ;
    private salle s;
    private UE u ;
    
    public intervention(Date debut = debut, int duree, TypeIntervention type, Salle s , UE u){
        this.debut = debut ;
        this.duree = duree ;
        this.type = type;
        this.s = s;
        this.u = u
    }
    
}
