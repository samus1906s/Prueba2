/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

/**
 *
 * @author Eduard Salas Murillo
 */
import Lists.List;

public class VisitList implements List <Visit> {
    private Visit visits[];

    public VisitList() { 
        this.visits = new Visit[100];
    }

    @Override
    public void showAll() {
        for (int i = 0; i < visits.length; i++){
        System.out.println(visits[i].toString());
        }
    }

    @Override
    public boolean add(Visit t) {
        
        for (int i = 0; i < visits.length; i++){
            if (visits[i] == null ){
                visits[i] = t;
                return true;
            }
        }
        return false;
    }

    @Override
    public Visit find(Object id) {
       
        for (int i = 0; i < visits.length; i++){
            if (visits[i] != null && visits[i].getId().equals(id)){
              return visits[i];
            }
        }
        return null;
    }

    @Override
    public boolean remove(Visit t) {
        
        for (int i = 0; i < visits.length; i++){
            if (visits[i] != null && visits[i].equals(t)){
                visits[i] = null;
                return true;
            }
        }
        return false;
    }
    
    
}
