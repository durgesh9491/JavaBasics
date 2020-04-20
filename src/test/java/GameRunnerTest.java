import design.patterns.behavioural.template.Cricket;
import design.patterns.behavioural.template.GameTemplate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created By durgesh.soni on 20/04/20
 */

public class GameRunnerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void whenGameStarts_logMessages() {
        GameTemplate game = new Cricket();
        game.play();
        assertEquals("Initializing cricket game!Starting cricket game!Ending cricket game!", outContent.toString());
    }
}
