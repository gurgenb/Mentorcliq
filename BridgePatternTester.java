import music_source.*;

import player.NewPlayer;
import player.OldPlayer;

public class BridgePatternTester {
    public static void main(String[] args) {
        MusicSource tape = new Tape(new OldPlayer());
        tape.startPlaying(0);

        tape = new Tape(new NewPlayer());
        tape.startPlaying(0);

        MusicSource usb = new USB(new NewPlayer());
        usb.startPlaying(0);

        tape.playByAuthor("Madonna");

        usb.startPlaying(5);
        usb.playByAuthor("Madonna");

    }
}

