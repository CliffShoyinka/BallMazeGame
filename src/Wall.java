
import java.awt.Image;

import javax.swing.ImageIcon;
public class Wall extends Actor {

    private Image image;


    public Wall(int x, int y) {
        super(x, y);

        initWall();
    }

    private void initWall() {

        ImageIcon icon = new ImageIcon("src/resources/wall.png");
        image = icon.getImage();
        setImage(image);
    }

    public void move(int x, int y) {

        int dx = x() +x;
        int dy = y() +y;

        setX(dx);
        setY(dy);
    }
}
