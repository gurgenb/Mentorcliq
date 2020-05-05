package music_source;

import player.IPlayer;

public class USB extends MusicSource {
    private byte[] drive;

    public USB(IPlayer player) {
        super(player);
        drive = new byte[1000];

        for (int i = 0; i< drive.length; i++) {
            //disk[i] =
        }
    }

    @Override
    public void startPlaying(int index) {
        System.out.println("Source medium is USB");
        player.play(index);
    }

    @Override
    public void playByAuthor(String author) {
        String author_bytes = new String(author.getBytes());
        String disk = new String(this.drive);

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