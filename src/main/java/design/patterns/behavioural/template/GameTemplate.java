package design.patterns.behavioural.template;

/**
 * Created By durgesh.soni on 20/04/20
 */

public abstract class GameTemplate {
    public final void play() {
        initialize();
        start();
        end();
    }

    protected abstract void initialize();

    protected abstract void start();

    protected abstract void end();
}
