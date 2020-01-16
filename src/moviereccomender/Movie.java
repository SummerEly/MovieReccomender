/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviereccomender;

import java.util.ArrayList;

/**
 *
 * @author ely_867287
 */
public class Movie
{
    String name;
    String rating;
    int releaseYear;
    int idNum;
    ArrayList<String>genres;

    public Movie(String name, String rating, int releaseYear, int idNum, ArrayList<String> genres)
    {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.idNum = idNum;
        this.genres = genres;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRating()
    {
        return rating;
    }

    public void setRating(String rating)
    {
        this.rating = rating;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    public int getIdNum()
    {
        return idNum;
    }

    public void setIdNum(int idNum)
    {
        this.idNum = idNum;
    }

    public ArrayList<String> getGenres()
    {
        return genres;
    }

    public void setGenres(ArrayList<String> genres)
    {
        this.genres = genres;
    }
    
}
