package music;
public interface Playable {
    void play();
}
package music.string;
import music.Playable;
public class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}
package music.wind;
import music.Playable;
public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the saxophone");
    }
}
package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
    public static void main(String[] args) {
        // a. create an instance of Veena and call the play() method.
        Veena veena = new Veena();
        veena.play();
        // b. create an instance of Saxophone and call the play() method.
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        // c. create an instance of Playable using the Veena class and call the play() method.
        Playable playable = new Veena();
        playable.play();
        playable = new Saxophone();
        playable.play();
    }
}