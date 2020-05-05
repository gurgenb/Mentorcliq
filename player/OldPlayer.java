package player;

public class OldPlayer implements IPlayer {
    @Override
    public void play(int index) {
        index = Math.abs(index);

        System.out.println("Playing by an old player from the " + ( index == 0 ? "beginning\n" : (index + " position\n")));
    }
}
