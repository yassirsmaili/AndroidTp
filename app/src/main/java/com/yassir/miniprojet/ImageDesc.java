package com.yassir.miniprojet;

/**
 * Created by dell on 13/12/2016.
 */

public class ImageDesc {
    private int id;
    private String titre;
    private String description;
    private int image;
    ImageDesc (int i , String t , String d , int im){
        this.id=i;
        this.titre=t;
        this.description=d;
        this.image=im;
    }
    public String getTitre() {
        return titre;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
