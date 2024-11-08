/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;

    private ArrayList<Feature> features;
    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }
     
    
    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //public Feature addNewFeatures() {
    //    Feature f = new Feature(this);
    //    features.add(f);
    //    return f;
    // }
    

    public Feature addNewFeatures() {
    Feature fs = new Feature(this);
    features.add(fs);
    return fs;  
}








    
    @Override
    public String toString(){
        return name;
    } 
}
