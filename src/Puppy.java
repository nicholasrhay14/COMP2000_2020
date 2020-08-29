import java.awt.*;

public class Puppy extends Actor{
    public Puppy(int px, int py, int col) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*px;
        this.actorCell.y = 10+35*py;
    }

    public Puppy(int px, int py, int col, Polygon[] newShape) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*px;
        this.actorCell.y = 10+35*py;
        this.actorShape = new Polygon[newShape.length];
        this.actorShape = newShape;
    }

    public void paint(Graphics g) {
        g.setColor(actorColor);

        Polygon[] puppyShape = {new Polygon(), new Polygon(), new Polygon()};

        //Ear 1
        puppyShape[0].addPoint(actorCell.x + 5, actorCell.y + 5);
        puppyShape[0].addPoint(actorCell.x + 15, actorCell.y + 5);
        puppyShape[0].addPoint(actorCell.x + 5, actorCell.y + 15);

        //Ear 2
        puppyShape[1].addPoint(actorCell.x + 20, actorCell.y + 5);
        puppyShape[1].addPoint(actorCell.x + 30, actorCell.y + 5);
        puppyShape[1].addPoint(actorCell.x + 30, actorCell.y + 15);

        //Face
        puppyShape[2].addPoint(actorCell.x+8, actorCell.y + 7);
        puppyShape[2].addPoint(actorCell.x+27, actorCell.y + 7);
        puppyShape[2].addPoint(actorCell.x+27, actorCell.y + 25);
        puppyShape[2].addPoint(actorCell.x+8, actorCell.y + 25);

        for(int i=0; i<puppyShape.length; i++) {
            g.drawPolygon(puppyShape[i]);
       }
    }
}