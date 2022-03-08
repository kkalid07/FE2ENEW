/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author khale
 */
public class Publication {
    private int id;
    private String contenue;
    private String date;

    public Publication() {
    }

    public Publication(int id, String contenue) {
        this.id = id;
        this.contenue = contenue;
    }

    public Publication(String contenue) {
        this.contenue = contenue;
    }

    public Publication(int id, String contenue, String date) {
        this.id = id;
        this.contenue = contenue;
        this.date = date;
    }
    

    public Publication(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    @Override
    public String toString() {
        return "Publication{" + "id=" + id + ", contenue=" + contenue + '}';
    }
    
    
}
