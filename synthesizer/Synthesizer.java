import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Synthesizer {
    private JFrame frame = new JFrame("Synthesizer");

    Synthesizer() {
        // BUILD UP WINDOW FRAME
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(600, 350);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static class AudioInfo {
        public static final int SAMPLE_RATE = 44100;
    }

    
}