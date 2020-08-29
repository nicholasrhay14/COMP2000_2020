import java.awt.*;

public class Lion extends Actor{

    public Lion(int lx, int ly, int col) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*lx;
        this.actorCell.y = 10+35*ly;
    }

    public Lion(int lx, int ly, int col, Polygon[] newShape) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*lx;
        this.actorCell.y = 10+35*ly;
        this.actorShape = new Polygon[newShape.length];
        this.actorShape = newShape;
    }

    public void paint(Graphics g) {
        g.setColor(actorColor);

        Polygon[] lionShape = {new Polygon(), new Polygon()};

        //Mane
        lionShape[0].addPoint(actorCell.x + 6, actorCell.y + 6);
        lionShape[0].addPoint(actorCell.x + 29, actorCell.y + 6);
        lionShape[0].addPoint(actorCell.x + 29, actorCell.y + 29);
        lionShape[0].addPoint(actorCell.x + 6, actorCell.y + 29);

        //Face
        lionShape[1].addPoint(actorCell.x + 11, actorCell.y + 11);
        lionShape[1].addPoint(actorCell.x + 24, actorCell.y + 11);
        lionShape[1].addPoint(actorCell.x + 24, actorCell.y + 24);
        lionShape[1].addPoint(actorCell.x + 11, actorCell.y + 24);

       for(int i=0; i<lionShape.length; i++) {
            g.drawPolygon(lionShape[i]);
       }
    }
}