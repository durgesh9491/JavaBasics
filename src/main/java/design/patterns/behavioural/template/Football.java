package design.patterns.behavioural.template;

/**
 * Created By durgesh.soni on 20/04/20
 */

public class Football extends GameTemplate {
    @Override
    protected void initialize() {
        System.out.print("Initializing football game!");
    }

    @Override
    protected void start() {
        System.out.print("Starting football game!");
    }

    @Override
    protected void end() {
        System.out.print("Ending football game!");
    }
}
