import java.util.Random;

class RandomPlayer {

    public void playGame(String gameName) throws InterruptedException {
        System.out.println(gameName + "game started");
        Thread.sleep(500);
        System.out.println(gameName + "game End");
    }

    public void playMusic(String musicName) throws InterruptedException {
        System.out.println(musicName + "music started");
        Thread.sleep(500);
        System.out.println(musicName + "misic ended");
    }

}

public class TestThread {

    static String[] games = { "COD", "FF", "PUBG", "GTA5", "VALORENT", "FIFA 22" };
    static String[] tracks = { "Believer", "Cradles", "Taki Taki", "Sorry",
            "Let Me Love You" };

    public static void main(String[] args) {

        RandomPlayer player = new RandomPlayer();

        Random random = new Random();

        Runnable gameRunner = () -> {
            try {
                player.playGame(games[random.nextInt(games.length)]);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Runnable musicPlayer = () -> {
            try {
                player.playMusic(tracks[random.nextInt(tracks.length)]);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Thread game = new Thread(gameRunner);
        Thread music = new Thread(musicPlayer);

        game.start();
        music.start();

    }

}
