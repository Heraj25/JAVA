package tcs_coding.pra_mocks;

import java.util.*;

class Actor{
    int actorId;
    String name; int age;
    int awardsWon;
    double totalEarnings;
    int moviesActedIn;

    Actor(int actorId, String name, int age, int awardsWon, double totalEarnings, int moviesActedIn) {
        this.actorId = actorId;
        this.name = name;
        this.age = age;
        this.awardsWon = awardsWon;
        this.totalEarnings = totalEarnings;
        this.moviesActedIn = moviesActedIn;
    }

    //getters //setters
    public int getActorId() {
        return actorId;
    }
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAwardsWon() {
        return awardsWon;
    }
    public void setAwardsWon(int awardsWon) {
        this.awardsWon = awardsWon;
    }
    public double getTotalEarnings() {
        return totalEarnings;
    }
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }
    public int getMoviesActedIn() {
        return moviesActedIn;
    }
    public void setMoviesActedIn(int moviesActedIn) {
        this.moviesActedIn = moviesActedIn;
    }


}

class Movie{
    int movieId;
    String title;
    int releaseYear;
    Actor[] actors;
    double boxOfficeCollection;

    Movie(int movieId, String title, int releaseYear, Actor[] actors, double boxOfficeCollection) {
        this.movieId = movieId;
        this.title = title;
        this.releaseYear = releaseYear;
        this.actors = actors;
        this.boxOfficeCollection = boxOfficeCollection;
    }

    //getters //setters
    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public Actor[] getActors() {
        return actors;
    }
    public void setActors(Actor[] actors) {
        this.actors = actors;
    }
    public double getBoxOfficeCollection() {
        return boxOfficeCollection;
    }
    public void setBoxOfficeCollection(double boxOfficeCollection) {
        this.boxOfficeCollection = boxOfficeCollection;
    }

}


public class test2_pra_approach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Movie[] movies = new Movie[n];

        for(int i=0 ; i<n ; i++) {
            int movieId = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            int releaseYear = sc.nextInt();
            double boxOfficeCollection = sc.nextDouble();
            int no_of_actors = sc.nextInt();

            Actor[] actors = new Actor[no_of_actors];
            for(int j=0 ; j<no_of_actors ; j++ ){
                int actorId = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine(); 
                int age = sc.nextInt();
                int  awardsWon = sc.nextInt();
                double totalEarnings = sc.nextDouble();
                int moviesActedIn = sc.nextInt();

                actors[j] = new Actor(actorId, name, age, awardsWon, totalEarnings, moviesActedIn);
            }
            movies[i] = new Movie(movieId, title, releaseYear, actors, boxOfficeCollection);
        }

        findActorFromEachMovieWith2ndHighestEarning(movies);
        calculateTotalEarningsAcrossMovies(movies);
        sc.close();
    }


    public static void findActorFromEachMovieWith2ndHighestEarning(Movie[] movies) {

        

        for(int i=0 ; i<movies.length ; i++) {
            Actor[] actors = movies[i].getActors();
            if(actors.length < 2) {
                System.out.println("Not enough Actors in the Movie");
            }
            
            Arrays.sort(actors, (a1, a2) -> Double.compare(a2.getTotalEarnings(), a1.getTotalEarnings()));
            
            System.out.println("Movie: "+movies[i].getTitle() + "\nReleasedYear: "+ movies[i].getReleaseYear() + "\nActorId: "+actors[1].getActorId() +"\nActor Name: "+actors[1].getName() +"\nTotalEarnings: "+actors[1].getTotalEarnings()+"\nMoviesActedIn: "+actors[1].getMoviesActedIn());
        }
    }

            public static void calculateTotalEarningsAcrossMovies(Movie[] movies) {
                for(int i=0; i<movies.length ; i++) {
                    Actor[] actors = movies[i].getActors();

                    for(int j=0 ; j<actors.length ; j++) {
                        double updateEarnings = actors[j].getTotalEarnings() + (movies[i].getBoxOfficeCollection()/actors.length);
                        actors[j].setTotalEarnings(updateEarnings);
                        System.out.println(actors[j].getName()+" new earnings: "+actors[j].getTotalEarnings());
                    }
                }
            
            
        
    }
}
