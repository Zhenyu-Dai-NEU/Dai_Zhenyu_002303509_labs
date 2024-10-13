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

    private ArrayList<Feature>features;
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
    Product defaultProduct = this;  
    String defaultName = "Default Feature Name";
    Object defaultValue = "Default Value";
    return addNewFeatures(defaultProduct, defaultName, defaultValue).get(0);
}

    private ArrayList<Feature> addNewFeatures(Product product, String nameString, Object value) {
    ArrayList<Feature> fs = new ArrayList<>();

    Feature newFeature = new Feature(product, nameString, value);
    fs.add(newFeature);  
    features.addAll(fs);  

    return fs;  
}








    
    @Override
    public String toString(){
        return name;
    } 
}
