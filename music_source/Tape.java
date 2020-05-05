package music_source;

import player.IPlayer;

public class Tape extends MusicSource {
    private Byte[] magneticTape;

    public Tape(IPlayer player) {
        super(player);
    }

    @Override
    public void startPlaying(int index) {
        System.out.println("Source medium is Tape");
        player.play(index);
    }

    @Override
    public void playByAuthor(String author) {
        System.out.println("Tapes do not support searching functionality!");
        startPlaying(0);
    }
}
