/**
 * Created by luisricardo on 09/05/2018.
 */
public class RubiksCube {

    public static void main(String[] args){

        String[][] exe = {{"B","B","N"},{"B","V","N"},{"Am","N","N"}};
        String[][] left = {{"Am","Am","R"},{"Am","N","A"},{"N","A","N"}};
        String[][] top = {{"R","A","A"},{"R","B","V"},{"V","V","B"}};
        String[][] right = {{"V","Am","B"},{"V","R","B"},{"V","B","A"}};
        String[][] down = {{"A","Am","Am"},{"R","Am","N"},{"A","V","N"}};
        Side[] sides = new Side[3];
        String[] letters_colors = {"F","T","L","R","B","D"};

        Side frontSide = new Side("F");
        Side leftSide = new Side("L");
        Side topSide = new Side("T");
        Side rightSide = new Side("R");
        Side downSide = new Side("D");
        Side backSide = new Side("B");

        frontSide.setNeighborSides(new Side[]{leftSide,topSide,rightSide,downSide});
        leftSide.setNeighborSides(new Side[]{backSide,topSide,frontSide,downSide});
        topSide.setNeighborSides(new Side[]{leftSide,backSide,rightSide,frontSide});
        rightSide.setNeighborSides(new Side[]{frontSide, topSide, rightSide, downSide});
        downSide.setNeighborSides(new Side[]{leftSide,topSide,rightSide,downSide});
        backSide.setNeighborSides(new Side[]{leftSide,topSide,rightSide,downSide});

        Cube cube = new Cube(frontSide,leftSide,topSide,rightSide,downSide,backSide);
        //------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------

        frontSide.printMatrix();
        for (int i = 0 ; i < 4; i++){
            frontSide.printNeighboor(i);
        }
        cube.clockwiseFrontRotation();
        frontSide.printMatrix();
        for (int i = 0 ; i < 4; i++){
            frontSide.printNeighboor(i);
        }

        System.out.println("Rotación izquierda");
        cube.counterClockwiseFrontRotation();
        frontSide.printMatrix();
        for (int i = 0 ; i < 4; i++){
            frontSide.printNeighboor(i);
        }


        //------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------

    }
}
