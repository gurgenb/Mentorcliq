package music_source;

import player.IPlayer;

public abstract class MusicSource {
    protected IPlayer player;

    protected MusicSource(IPlayer player) {
        this.player = player;
    }

    abstract public void startPlaying(int index);
    abstract public void playByAuthor(String author);
    //abstract public String findBYGenre();
    //abstract public Byte[] fetchMusicContent();
}
