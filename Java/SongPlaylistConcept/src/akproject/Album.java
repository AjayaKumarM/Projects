package akproject;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album() {
    }

    // to check whether the song is already present or not in the list

    public Song findSong(String title){

        for(Song checkedSong: songs){
            if(checkedSong.getTitle().equals(title)){
               return checkedSong;
            }
        }
        return null;
    }

    // to add song to the list
    public boolean addSong(String title, double duration){

        if(findSong(title) == null)                           //uses findSong method to check the song is present in list or not
        {
            songs.add(new Song(title, duration));
            return true;
        }

        else{
            System.out.println("Song name "+title+" already exists in the list");
            return false;
        }
    }

    // to add song to the playlist using track number from the album
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> Playlist){

        int index = trackNumber - 1;      // track number starts fromm 1 while index starts from 0 so to set track number to index

        if((index>0)&& index<= this.songs.size()){
            Playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have song with track number" +trackNumber);
        return false;
    }

    // to add song to playlist using title of the song which is present in album
    public boolean addToPlaylist(String title, LinkedList<Song> Playlist){   // using linked list because it can access previous and next item in list

        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                Playlist.add(checkedSong);
                return true;
            }
        }
        System.out.println(title+ " song is not present in album");
        return false;
    }


}














