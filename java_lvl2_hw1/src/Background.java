import java.awt.*;

class Background {
    private float time;

    Background(GameCanvas gameCanvas) {
        time = System.nanoTime()*0.000000001f%10;
        switch ((int)time) {
            case (0):
                gameCanvas.setBackground(Color.CYAN);
                break;
            case (1):
                gameCanvas.setBackground(Color.BLACK);
                break;
            case (2):
                gameCanvas.setBackground(Color.BLUE);
                break;
            case (3):
                gameCanvas.setBackground(Color.GREEN);
                break;
            case (4):
                gameCanvas.setBackground(Color.ORANGE);
                break;
            case (5):
                gameCanvas.setBackground(Color.WHITE);
                break;
            case (6):
                gameCanvas.setBackground(Color.RED);
                break;
            case (7):
                gameCanvas.setBackground(Color.PINK);
                break;
            case (8):
                gameCanvas.setBackground(Color.GRAY);
                break;
            case (9):
                gameCanvas.setBackground(Color.YELLOW);
                break;
        }
    }

}
