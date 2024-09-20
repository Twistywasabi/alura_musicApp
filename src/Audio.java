public class Audio {
    private String Title;
    private int Duration;
    private int totalPlays;
    private int likes;
    private double ranking;

    public void giveLike() {
        this.likes += 1;
        System.out.println("Audio liked");
        System.out.println("Number of likes: " + this.likes);
    }

    public void playAudio() {
        System.out.println("Audio played");
    }

    public void showAudioInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Duration: " + getDuration() + " seconds.");
        System.out.println("Amount of time played:" + getTotalPlays() + " times.");
        System.out.println("Number of likes: " + getLikes());
        System.out.println("Ranking: " + getRanking());
    }

    ;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void setTotalPlays(int totalPlays) {
        this.totalPlays = totalPlays;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
}
