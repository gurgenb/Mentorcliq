package music_source;

import player.IPlayer;

public class CD extends MusicSource {
    private byte[] disk;

    public CD(IPlayer player) {
        super(player);
        disk = new byte[200];

        for (int i = 0; i< disk.length; i++) {
            //disk[i] =
        }
    }

    @Override
    public void startPlaying(int index) {
        System.out.println("Source medium is CD");
        player.play(index);
    }

    @Override
    public void playByAuthor(String author) {
        String author_bytes = new String(author.getBytes());
        String disk = new String(this.disk);

        int index = disk.indexOf(author_bytes);
        if (index > 0) {
            System.out.println("Found some music by the given author! Starting to play!");
            startPlaying(index);
        } else {
            System.out.println("No music found by the given author! Starting to play from the beginning!");
            startPlaying(0);
        }


    }
}