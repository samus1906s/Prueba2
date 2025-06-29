/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import Lists.List;

/**
 *
 * @author Brandon Valdelomar
 */
public class AnimalList implements List<Animal> {
    private Animal animals[];

    public AnimalList() {
        this.animals = new Animal[100];
    }

    @Override
    public void showAll() {
       for (int i = 0; i < animals.length; i++){
           if (animals != null){
               System.out.println(animals[i]);
           }
       }
    }

    @Override
    public boolean add(Animal t) {
            for(int i = 0; i<100; i++){
                if(animals[i] == null){
                   animals[i] = t;
                   return true;
                }
            }               
        return false;
    }
    
    @Override
    public Animal find(Object id) {
        String idStr = id.toString(); // Convertimos el id recibido a String

    for (int i = 0; i < animals.length; i++) {
        if (animals[i] != null) {
            if (animals[i].getId().toString().equals(idStr)) {
                return animals[i]; // Retornamos el animal si el id coincide
            }
        }
    }

    return null; // Si no se encontró ninguno animal con ese id
}

    @Override
    public boolean remove(Animal t) {
        for (int i = 0; i < animals.length; i++) {
        if (animals[i] != null && animals[i].equals(t)) {
            animals[i] = null;
            return true;
        }
    }
    return false;
}
}