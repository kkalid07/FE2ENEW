/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entites.Publication;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Mydb;

/**
 *
 * @author khale
 */
public class SPublication implements IServices<Publication>{

    Connection cnx;
     public SPublication() {
         cnx = Mydb.getInstance().getConncetion();
    }
     
    @Override
    public void ajouter(Publication p) {
         try {
          
           String req="insert into publication(contenue) values(?)";
                PreparedStatement smt = cnx.prepareStatement(req);
                smt.setString(1, p.getContenue());
                smt.executeUpdate();
                System.out.println("Ajout de publication avec succées");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
           
       }
    }

    @Override
    public void modifier(Publication p) {
    try {
       String req="update publication set contenue=? where idPub=?";
                PreparedStatement smt = cnx.prepareStatement(req);
                
                smt.setString(1, p.getContenue());
                smt.setInt(2, p.getId());
                smt.executeUpdate();
                System.out.println("Modification de publication avec succées");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    }

    @Override
    public void supprimer(Publication p) {
    try {
       String req="delete from publication where idPub=?";
                PreparedStatement smt = cnx.prepareStatement(req);
                smt.setInt(1, p.getId());
                smt.executeUpdate();
                System.out.println("Suppression de publication avec succées");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    }

    @Override
    public List<Publication> find() {
    ArrayList l=new ArrayList(); 
        
        try {
       String req="select * from publication";
                PreparedStatement smt = cnx.prepareStatement(req);
                
                ResultSet rs= smt.executeQuery(req);
                while(rs.next()){
                   Publication p=new Publication(rs.getInt("idPub"),rs.getString("contenue"),rs.getString("dateCreation"));
                   l.add(p);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
    }

        return l;
    }
    
    //rec2.next();
      //     nb=rec2.getDouble(1);
    
    public int nombreCommentaires(Publication p){
        int nbrCommentaires =0;
        try {
            String req="select count(*) from commentaire where idPub="+p.getId();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            rs.next();
            nbrCommentaires = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return nbrCommentaires;
    }
}
