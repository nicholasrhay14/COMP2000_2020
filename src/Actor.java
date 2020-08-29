import java.awt.*;

class Actor {
    public Cell actorCell = new Cell(0, 0);
    public Color actorColor = new Color(0000000);
    public Polygon[] actorShape = new Polygon[1];

    public Actor() {
    }

    public Actor(int lx, int ly, int col) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*lx;
        this.actorCell.y = 10+35*ly;
    }

    public Actor(int lx, int ly, int col, Polygon[] newShape) {
        this.actorColor = new Color(col);
        this.actorCell.x = 10+35*lx;
        this.actorCell.y = 10+35*ly;
        this.actorShape = new Polygon[newShape.length];
        this.actorShape = newShape;
    }

    public void addPolygons(Polygon[] newShape) {
        this.actorShape = new Polygon[newShape.length];
        this.actorShape = newShape;
    }

    public void paint(Graphics g) {
        g.setColor(actorColor);
        for(int i=0; i<actorShape.length; i++) {
            g.drawPolygon(actorShape[i]);
        }
    }
}