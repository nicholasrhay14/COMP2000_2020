import java.awt.*;

public class Rabbit extends Actor{

    public Rabbit(int rx, int ry, int col) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*rx;
        this.actorCell.y = 10+35*ry;
    }

    public Rabbit(int rx, int ry, int col, Polygon[] newShape) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*rx;
        this.actorCell.y = 10+35*ry;
        this.actorShape = new Polygon[newShape.length];
        this.actorShape = newShape;
    }

    public void paint(Graphics g) {
        g.setColor(actorColor);

        Polygon[] rabbitShape = {new Polygon(), new Polygon(), new Polygon()};

        //Ear 1
        rabbitShape[0].addPoint(actorCell.x + 11, actorCell.y + 5);
        rabbitShape[0].addPoint(actorCell.x + 11, actorCell.y + 12);
        rabbitShape[0].addPoint(actorCell.x + 16, actorCell.y + 12);
        rabbitShape[0].addPoint(actorCell.x + 16, actorCell.y + 5);
        
        //Ear 2
        rabbitShape[1].addPoint(actorCell.x + 19, actorCell.y + 5);
        rabbitShape[1].addPoint(actorCell.x + 19, actorCell.y + 12);
        rabbitShape[1].addPoint(actorCell.x + 24, actorCell.y + 12);
        rabbitShape[1].addPoint(actorCell.x + 24, actorCell.y + 5);

        //Ear 3
        rabbitShape[2].addPoint(actorCell.x+8, actorCell.y + 12);
        rabbitShape[2].addPoint(actorCell.x+27, actorCell.y + 12);
        rabbitShape[2].addPoint(actorCell.x+27, actorCell.y + 25);
        rabbitShape[2].addPoint(actorCell.x+8, actorCell.y + 25);

       for(int i=0; i<rabbitShape.length; i++) {
            g.drawPolygon(rabbitShape[i]);
       }
    }
}