
class Video {
    protected String title;
    protected int duration; // (better declare in minutes)

    Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    void play() {
        System.out.println("Playing: " + title);
    }

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " mins");
    }
}

// I have used "Inheritance" here
class Movie extends Video {
    Movie(String title, int duration) {
        super(title, duration);
    }

    //  I have used "Polymorphism" here
    @Override
    void play() {
        System.out.println("Now streaming movie: " + title);
    }
}

class Series extends Video {
    private int episodeNumber;

    Series(String title, int duration, int episodeNumber) {
        super(title, duration);
        this.episodeNumber = episodeNumber;
    }

    // I have used "Polymorphism" here
    @Override
    void play() {
        System.out.println("Now streaming series: " + title +
                " | Episode " + episodeNumber);
    }
}

public class VideoStreamingPlatform {
    public static void main(String[] args) {
        Video v1 = new Movie("Interstellar", 169);
        Video v2 = new Series("Stranger Things", 45, 1);

        v1.showDetails();
        v1.play();

        System.out.println();

        v2.showDetails();
        v2.play();
    }
}