package player;

public class NewPlayer implements IPlayer {
    @Override
    public void play(int index) {
        index = Math.abs(index);

        System.out.println("Playing by new player from the " + ( index == 0 ? "beginning\n" : (index + " position\n")));
    }
}
