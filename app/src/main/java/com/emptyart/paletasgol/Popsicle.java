package com.emptyart.paletasgol;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class Popsicle {
    private String name;
    private String description;
    private int imageResourceId;

    //popsicles is an array of popsicles
    public static final Popsicle[] popsicles = {
            new Popsicle("Chicle"," tradicionales helados de palito costarricenses",R.drawable.chicle),
            new Popsicle("Churchill"," tradicionales helados de palito costarricenses",R.drawable.churchill),
            new Popsicle("Pasas"," tradicionales helados de palito costarricenses",R.drawable.pasas),
            new Popsicle("Condensda","tradicionales helados de palito costarricenses",R.drawable.condensada)
    };

    //each Popsicle has a name description and img resource
    private Popsicle(String name,String description,int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
