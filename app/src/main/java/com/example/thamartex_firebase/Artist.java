package com.example.thamartex_firebase;

public class Artist {
    String artistid;
    String artsistname;
    String artistgenre;

    public Artist(){

    }

    public Artist(String artistid, String artsistname, String artistgenre) {
        this.artistid = artistid;
        this.artsistname = artsistname;
        this.artistgenre = artistgenre;
    }

    public String getArtistid() {
        return artistid;
    }

    public String getArtsistname() {
        return artsistname;
    }

    public String getArtistgenre() {
        return artistgenre;
    }
}
