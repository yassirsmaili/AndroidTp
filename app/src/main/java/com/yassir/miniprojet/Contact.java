package com.yassir.miniprojet;

/**
 * Created by dell on 13/12/2016.
 */

public class Contact {
    private int     id;
    private String  nom ;
    private String  prenom;
    private int     avatar ;
    private String  num_tel;
    private String  Email;
    private boolean Favori;

    Contact(int i , String n , String p , int av,String num,String mail,boolean fav){
        this.id=i;
        this.nom=n;
        this.prenom=p;
        this.avatar =av;
        this.num_tel=num;
        this.Email=mail;
        this.Favori=fav;
    }
    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getEmail() {return Email;    }

    public String getNum_tel() {return num_tel; }
    public boolean getFavori(){return Favori;}
}
