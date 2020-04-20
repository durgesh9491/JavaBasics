package design.patterns.behavioural.template;

/**
 * Created By durgesh.soni on 20/04/20
 */

public class GameRunner {
    public static void main(String[] args) {
        GameTemplate game = new Cricket();
        game.play();
    }
}
