/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import entites.Publication;
import services.SPublication;
import entites.Commentaire;
import entites.User;
import java.sql.Connection;
import java.util.List;
import services.SCommentaire;
import services.SUser;
import utils.Mydb;
/**
 *
 * @author khale
 */
public class main {
    public static void main(String[] args) {
        Connection cnx= Mydb.getInstance().getConncetion();
        //Publication pub0 = new Publication("1st pub published");
        Publication pub1 = new Publication(32);
        SPublication spub = new SPublication();
        String nbreComs = String.valueOf(spub.nombreCommentaires(pub1));
        
        /*User u = new User("kjh", "dsfsd", "sdfsdf", 0, "dsfsdf");
        SUser su = new SUser();
        
        System.out.println(su.find());*/
        
        //System.out.println(nbreComs);
        //String nbreComms =""+spub.nombreCommentaires(pub1);
        //System.out.println(nbreComms);
        //List<Publication> lpubs = spub.find();
        //for (int i=0;i< lpubs.size();i++){
        //    System.out.println("nombre de commentaires sur cette pub :"+spub.nombreCommentaires(lpubs.get(i)));
        //}
        
        //spub.ajouter(pub1);
        //spub.modifier(pub1);
        //spub.supprimer(pub1);
        //System.out.println(spub.find());
        //Commentaire c=new Commentaire(3);
        //Commentaire c1=new Commentaire("1st updated comment on 1st pub",1);
        //SCommentaire sc=new SCommentaire();
        //sc.ajouter(c);
        //sc.modifier(c1);
        //sc.supprimer(c);
        //System.out.println(sc.find(1));
                
    }
}
