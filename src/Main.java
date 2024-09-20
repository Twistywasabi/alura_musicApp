public class Main {
    public static void main(String[] args) {

        Music music1 = new Music();
        music1.setTitle("This is the day");
        music1.setDuration(300);
        music1.setLikes(10);
        music1.setRanking(5);
        music1.setTotalPlays(187);
        music1.showAudioInfo();
        music1.playAudio();
        music1.giveLike();

        Podcast podcasts1 = new Podcast();
        podcasts1.setTitle("Flow Games");
        podcasts1.setDuration(3600);
        podcasts1.setLikes(10);
        podcasts1.setRanking(5);
        podcasts1.setTotalPlays(187);
        podcasts1.showAudioInfo();
        podcasts1.playAudio();
        podcasts1.giveLike();

    }
}
