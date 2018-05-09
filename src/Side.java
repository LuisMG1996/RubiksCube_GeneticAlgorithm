/**
 * Created by luisricardo on 09/05/2018.
 */
public class Side {

    String[][] matrix = new String[3][3];
    String identifier;
    Side[] neighborSides;//first left, second top, third right, fourth down

    public Side(String identifier){
        fillMatrix(identifier);
        this.identifier = identifier;

    }//fin constructor

    public Side(String[][] matrix){
        this.matrix = matrix;
    }
    public void setNeighborSides(Side[] neighborSides){
        this.neighborSides = neighborSides;
    }
    private void fillMatrix(String data){
        for(int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j++){
                this.matrix[i][j] = data;
            }//fin for j
        }//fin for i
    }//fin fillMatrix

    public void clockwiseRotateMatrix()    {

        String[][] newMatrix = new String[3][3];

        for(int i = 0, j = 3 - 1; i < 3 && j >= 0; i++, j--)
        {
            for(int k = 0; k < 3; k++)
            {
                newMatrix[k][j] = matrix[i][k];
            }
        }
        matrix = newMatrix;
    }

    public void counterClockwiseRotateMatrix()    {

        String[][] newMatrix = new String[3][3];

        for(int i = 0, j = 3 - 1; i < 3 && j >= 0; i++, j--)
        {
            for(int k = 0; k < 3; k++)
            {
                newMatrix[j][k] = matrix[k][i];
            }
        }
        matrix = newMatrix;
    }

    public void printMatrix() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }//fin for j
            System.out.println();
        }//fin for i

        System.out.println("\n\n");

    }//fin printMatrix

    public void printNeighboor(int index){
        switch (index){
            case 0:
                System.out.println("Left\n");
                break;
            case 1:
                System.out.println("Top\n");
                break;
            case 2:
                System.out.println("Right\n");
                break;
            case 3:
                System.out.println("Down\n");
                break;
            default:
                break;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(neighborSides[index].matrix[i][j] + " ");
            }//fin for j
            System.out.println("");
        }//fin for i
        System.out.println("\n\n");

    }

}
