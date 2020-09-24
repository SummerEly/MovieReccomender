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
    ArrayList<Boolean>genres;
    // [action, comedy, drama, documentary, sci-fi, animated, horror, mystery]
    ArrayList<Boolean> streamingServices;
    // [netflix, hulu, amazon]
    
    int rottenTomatoes;
    int imdb;
    int metacritic;
    
    
    
    public Movie(String name, String rating, int releaseYear, int idNum, 
            ArrayList<Boolean> genres, ArrayList<Boolean> streamingServic)
    {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.idNum = idNum;
        this.genres = genres;
        this.streamingServices = streamingServices;
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

    public ArrayList<Boolean> getGenres()
    {
        return genres;
    }

    public void setGenres(ArrayList<Boolean> genres)
    {
        this.genres = genres;
    }
    
    public int computeGroovyScore(){
        int groovyScore;
        int a = rottenTomatoes;
        int b = imdb * 10;
        int c = metacritic;
        
        groovyScore = (a + b + c)/3;
        return rgoovyScore;
    }
    
    
    
}
