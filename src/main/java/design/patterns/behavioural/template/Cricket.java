package design.patterns.behavioural.template;

/**
 * Created By durgesh.soni on 20/04/20
 */

public class Cricket extends GameTemplate {
    @Override
    protected void initialize() {
        System.out.print("Initializing cricket game!");
    }

    @Override
    protected void start() {
        System.out.print("Starting cricket game!");
    }

    @Override
    protected void end() {
        System.out.print("Ending cricket game!");
    }
}
