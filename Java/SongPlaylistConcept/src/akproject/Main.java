package akproject;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {



        Album album1 = new Album("Graduation","Kanye West");

        album1.addSong("Good Morning",3.15);
        album1.addSong("Champion",2.48);
        album1.addSong("I Wonder",4.03);

        albums.add(album1);

        Album album2 = new Album("Currents","Tame impala");

        album2.addSong("Let It Happen", 7.47);
        album2.addSong("The Less I Know The Better",3.37);

        albums.add(album2);

        Album album3 = new Album("Random Access Memories", "Daft Punk");

        album3.addSong("Get Lucky",6.07);
        album3.addSong("Instant Crush",5.37);

        albums.add(album3);

        LinkedList<Song> playlist_1= new LinkedList<>();

        albums.get(0).addToPlaylist("Good Morning",playlist_1);
        albums.get(0).addToPlaylist("Champion",playlist_1);
        albums.get(0).addToPlaylist("I Wonder",playlist_1);
        albums.get(1).addToPlaylist("Let It Happen",playlist_1);
        albums.get(1).addToPlaylist("The Less I Know The Better",playlist_1);
        albums.get(2).addToPlaylist("Get Lucky",playlist_1);
        albums.get(2).addToPlaylist("Instant Crush",playlist_1);

        play(playlist_1);


    }
    private static void play(LinkedList<Song> playList){

        printMenu();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.isEmpty()){
            System.out.println("This playlist have no songs");
        }
        else{
            System.out.println("Now playing " +listIterator.next().toString());
        }


        while(!quit){

            if(scanner.hasNextInt()){
                int input = scanner.nextInt();

                switch(input){
                    case 0 -> {
                        System.out.println("Playlist is complete");
                        quit = true;
                    }

                    case 1 -> {
                        if(!forward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            forward = true;
                        }
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next().toString());
                        }
                        else {
                            System.out.println("No songs available, end of the list");
                            forward = false;
                        }
                    }

                    case 2 ->{
                        if(forward){
                            if(listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            forward = false;
                        }
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous().toString());
                        }
                        else {
                            System.out.println("No previous songs available");
                            forward = false;
                        }
                    }

                    case 3-> {
                        if(forward){
                            if(listIterator.hasPrevious()){
                                System.out.println("Now playing" +listIterator.previous().toString());
                                forward = false;
                            }
                            else{
                                System.out.println("This is the start of the list");
                            }
                        }
                        else{
                            if(listIterator.hasNext()){
                                System.out.println("Now playing "+listIterator.next().toString());
                                forward = true;
                            }
                            else{
                                System.out.println("This is the end of the list");
                            }
                        }
                    }

                    case 4 ->{
                        printlist(playList);
                    }

                    case 5 ->{
                        printMenu();
                    }

                    case 6 ->{
                        if(!playList.isEmpty()){
                            listIterator.remove();
                            if(listIterator.hasNext()){
                                System.out.println("Now playing "+listIterator.next().toString());
                                forward = true;
                            }
                            else{
                                if(listIterator.hasPrevious()) {
                                    System.out.println("Now playing "+listIterator.previous().toString());
                                }
                            }
                        }
                    }

                    default -> {
                        System.out.println("\nInvalid input please choose from the available options");
                        printMenu();
                    }
               }
            }
            else {
                scanner.next();
                System.out.println("\nInvalid input please choose from the available options");
                printMenu();
            }
        }
    }

    private static void printMenu(){

        System.out.println("Available options\npress: ");
        System.out.println("""
                0 - to quit
                1 - to play next song
                2 - to play previous song
                3 - to replay the current song
                4 - list of all songs
                5 - print all available options
                6 - delete current song
                """);
    }

    private static void printlist(LinkedList<Song> playList){

        Iterator<Song> iterator = playList.iterator();
        System.out.println("------------------------------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------------");
    }
}
