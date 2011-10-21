/* chp 5 - Four-dimensional points 
*
* Create a class for four-dimensional points called
* FourDPoint that is a subclass of
* Point from the java.awt package.
*/

import java.awt.Point;

class FourDPoint extends Point {
    int east = 0;
    int west = 0;
    int south = 0;
    int north = 0;

    FourDPoint directions(Point eastwest,Point southnorth) {
        east = eastwest.x;
        west = eastwest.y;
        south = southnorth.x;
        north = southnorth.y;       
        return this;
    }

    public static void main(String[] args) {
        FourDPoint np = new FourDPoint();
        np.directions(5, 10, 20, 30);
        System.out.println("east is " + np.east);
        System.out.println("west is " + np.west);
        System.out.println("south is " +np. south);
        System.out.println("north is " + np.north);
    }
}

