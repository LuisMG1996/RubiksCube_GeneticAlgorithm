/**
 * Created by luisricardo on 09/05/2018.
 */
public class Cube {

    Side front;
    Side right;
    Side left;
    Side top;
    Side down;
    Side back;

    public Cube(Side front, Side left,Side top,Side right,Side down,Side back){
        this.front = front;
        this.right = right;
        this.left = left;
        this.top = top;
        this.down = down;
        this.back = back;


    }
    public void clockwiseFrontRotation(){

        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;
        //--------------
        front.clockwiseRotateMatrix();
        //rotation principal side

        aux = left.matrix[0][2];
        aux2 = left.matrix[1][2];
        aux3 = left.matrix[2][2];

        //Top
        aux_1 = top.matrix[2][0];
        aux_2 = top.matrix[2][1];
        aux_3 = top.matrix[2][2];

        top.matrix[2][2] = aux;
        top.matrix[2][1] = aux2;
        top.matrix[2][0] = aux3;

        aux = right.matrix[0][0];
        aux2 = right.matrix[1][0];
        aux3 = right.matrix[2][0];

        right.matrix[0][0] = aux_1;
        right.matrix[1][0] = aux_2;
        right.matrix[2][0] = aux_3;

        aux_1 = down.matrix[0][0];
        aux_2 = down.matrix[0][1];
        aux_3 = down.matrix[0][2];

        down.matrix[0][2] = aux;
        down.matrix[0][1] = aux2;
        down.matrix[0][0] = aux3;

        left.matrix[0][2] = aux_1;
        left.matrix[1][2] = aux_2;
        left.matrix[2][2] = aux_3;

    }//fin clockwiseRotation

    public void counterClockwiseFrontRotation(){

        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;
        //--------------
        front.counterClockwiseRotateMatrix();
        //rotation principal side

        aux = left.matrix[0][2];
        aux2 = left.matrix[1][2];
        aux3 = left.matrix[2][2];

        //Top
        aux_1 = down.matrix[0][0];
        aux_2 = down.matrix[0][1];
        aux_3 = down.matrix[0][2];

        down.matrix[0][2] = aux;
        down.matrix[0][1] = aux2;
        down.matrix[0][0] = aux3;

        aux = right.matrix[0][0];
        aux2 = right.matrix[1][0];
        aux3 = right.matrix[2][0];

        right.matrix[2][0] = aux_1;
        right.matrix[1][0] = aux_2;
        right.matrix[0][0] = aux_3;

        aux_1 = top.matrix[2][0];
        aux_2 = top.matrix[2][1];
        aux_3 = top.matrix[2][2];

        top.matrix[2][0] = aux;
        top.matrix[2][1] = aux2;
        top.matrix[2][2] = aux3;

        left.matrix[0][2] = aux_3;
        left.matrix[1][2] = aux_2;
        left.matrix[2][2] = aux_1;

    }

    public void clockwiseRightRotation(){
        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        right.clockwiseRotateMatrix();

        aux = front.matrix[0][2];
        aux2 = front.matrix[1][2];
        aux3 = front.matrix[2][2];

        aux_1 = top.matrix[0][2];
        aux_2 = top.matrix[1][2];
        aux_3 = top.matrix[2][2];

        top.matrix[0][2] = aux;
        top.matrix[1][2] = aux2;
        top.matrix[2][2] = aux3;

        aux = back.matrix[0][0];
        aux2 = back.matrix[1][0];
        aux3 = back.matrix[2][0];

        back.matrix[0][0] = aux_3;
        back.matrix[1][0] = aux_2;
        back.matrix[2][0] = aux_1;

        aux_1 = down.matrix[0][2];
        aux_2 = down.matrix[1][2];
        aux_3 = down.matrix[1][2];

        down.matrix[0][2] = aux3;
        down.matrix[1][2] = aux2;
        down.matrix[2][2] = aux;

        front.matrix[0][2] = aux_1;
        front.matrix[1][2] = aux_2;
        front.matrix[2][2] = aux_3;

    }

    public void counterClockwiseRightRotation(){
        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        right.counterClockwiseRotateMatrix();

        aux = front.matrix[0][2];
        aux2 = front.matrix[1][2];
        aux3 = front.matrix[2][2];

        aux_1 = down.matrix[0][2];
        aux_2 = down.matrix[1][2];
        aux_3 = down.matrix[2][2];

        down.matrix[0][2] = aux;
        down.matrix[1][2] = aux2;
        down.matrix[2][2] = aux3;

        aux = back.matrix[0][0];
        aux2 = back.matrix[1][0];
        aux3 = back.matrix[2][0];

        back.matrix[0][0] = aux_1;
        back.matrix[1][0] = aux_2;
        back.matrix[2][0] = aux_3;

        aux_1 = top.matrix[0][2];
        aux_2 = top.matrix[1][2];
        aux_3 = top.matrix[1][2];

        top.matrix[0][2] = aux3;
        top.matrix[1][2] = aux2;
        top.matrix[2][2] = aux;

        front.matrix[0][2] = aux_1;
        front.matrix[1][2] = aux_2;
        front.matrix[2][2] = aux_3;

    }

    public void clockwiseLeftRotation(){
        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        left.clockwiseRotateMatrix();

        aux = top.matrix[0][0];
        aux2 = top.matrix[1][0];
        aux3 = top.matrix[2][0];

        aux_1 = front.matrix[0][0];
        aux_2 = front.matrix[1][0];
        aux_3 = front.matrix[2][0];

        front.matrix[0][0] = aux;
        front.matrix[1][0] = aux2;
        front.matrix[2][0] = aux3;

        aux = down.matrix[0][0];
        aux2 = down.matrix[1][0];
        aux3 = down.matrix[2][0];

        down.matrix[0][0] = aux_1;
        down.matrix[1][0] = aux_2;
        down.matrix[2][0] = aux_3;

        aux_1 = back.matrix[0][2];
        aux_2 = back.matrix[1][2];
        aux_3 = back.matrix[2][2];

        back.matrix[0][2] = aux3;
        back.matrix[1][2] = aux2;
        back.matrix[2][2] = aux;

        top.matrix[0][0] = aux_3;
        top.matrix[1][0] = aux_2;
        top.matrix[2][0] = aux_1;
    }

    public void counterClockwiseLeftRotation(){

        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        left.counterClockwiseRotateMatrix();

        aux = down.matrix[0][0];
        aux2 = down.matrix[1][0];
        aux3 = down.matrix[2][0];

        aux_1 = front.matrix[0][0];
        aux_2 = front.matrix[1][0];
        aux_3 = front.matrix[2][0];

        front.matrix[0][0] = aux;
        front.matrix[1][0] = aux2;
        front.matrix[2][0] = aux3;

        aux = top.matrix[0][0];
        aux2 = top.matrix[1][0];
        aux3 = top.matrix[2][0];

        top.matrix[0][0] = aux_1;
        top.matrix[1][0] = aux_2;
        top.matrix[2][0] = aux_3;

        aux_1 = back.matrix[0][2];
        aux_2 = back.matrix[1][2];
        aux_3 = back.matrix[2][2];

        back.matrix[0][2] = aux3;
        back.matrix[1][2] = aux2;
        back.matrix[2][2] = aux;

        down.matrix[0][0] = aux_3;
        down.matrix[1][0] = aux_2;
        down.matrix[2][0] = aux_1;

    }

    public void clockwiseTopRotation(){

        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        top.clockwiseRotateMatrix();

        aux = right.matrix[0][0];
        aux2 = right.matrix[0][1];
        aux3 = right.matrix[0][2];

        aux_1 = front.matrix[0][0];
        aux_2 = front.matrix[0][1];
        aux_3 = front.matrix[0][2];

        front.matrix[0][0] = aux;
        front.matrix[0][1] = aux2;
        front.matrix[0][2] = aux3;

        aux = left.matrix[0][0];
        aux2 = left.matrix[0][1];
        aux3 = left.matrix[0][2];

        left.matrix[0][0] = aux_1;
        left.matrix[0][1] = aux_2;
        left.matrix[0][2] = aux_3;

        aux_1 = back.matrix[0][0];
        aux_2 = back.matrix[0][1];
        aux_3 = back.matrix[0][2];

        back.matrix[0][0] = aux;
        back.matrix[0][1] = aux2;
        back.matrix[0][2] = aux3;

        right.matrix[0][0] = aux_1;
        right.matrix[0][1] = aux_2;
        right.matrix[0][2] = aux_3;

    }
    public void counterClockwiseTopRotation(){
        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        top.clockwiseRotateMatrix();

        aux = right.matrix[0][0];
        aux2 = right.matrix[0][1];
        aux3 = right.matrix[0][2];

        aux_1 = front.matrix[0][0];
        aux_2 = front.matrix[0][1];
        aux_3 = front.matrix[0][2];

        right.matrix[0][0] = aux_1;
        right.matrix[0][1] = aux_2;
        right.matrix[0][2] = aux_3;

        aux_1 = back.matrix[0][0];
        aux_2 = back.matrix[0][1];
        aux_3 = back.matrix[0][2];

        back.matrix[0][0] = aux;
        back.matrix[0][1] = aux2;
        back.matrix[0][2] = aux3;

        aux = left.matrix[0][0];
        aux2 = left.matrix[0][1];
        aux3 = left.matrix[0][2];

        left.matrix[0][0] = aux_1;
        left.matrix[0][1] = aux_2;
        left.matrix[0][2] = aux_3;

        front.matrix[0][0] = aux;
        front.matrix[0][1] = aux2;
        front.matrix[0][2] = aux3;
    }
    public void clockwiseDownRotation(){
        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        top.clockwiseRotateMatrix();

        aux = right.matrix[2][0];
        aux2 = right.matrix[2][1];
        aux3 = right.matrix[2][2];

        aux_1 = front.matrix[2][0];
        aux_2 = front.matrix[2][1];
        aux_3 = front.matrix[2][2];

        front.matrix[2][0] = aux;
        front.matrix[2][1] = aux2;
        front.matrix[2][2] = aux3;

        aux = left.matrix[2][0];
        aux2 = left.matrix[2][1];
        aux3 = left.matrix[2][2];

        left.matrix[2][0] = aux_1;
        left.matrix[2][1] = aux_2;
        left.matrix[2][2] = aux_3;

        aux_1 = back.matrix[2][0];
        aux_2 = back.matrix[2][1];
        aux_3 = back.matrix[2][2];

        back.matrix[2][0] = aux;
        back.matrix[2][1] = aux2;
        back.matrix[2][2] = aux3;

        right.matrix[2][0] = aux_1;
        right.matrix[2][1] = aux_2;
        right.matrix[2][2] = aux_3;
    }

    public void counterClockwiseDownRotation(){
        String aux;
        String aux2;
        String aux3;
        String aux_1;
        String aux_2;
        String aux_3;

        top.counterClockwiseRotateMatrix();

        aux = right.matrix[2][0];
        aux2 = right.matrix[2][1];
        aux3 = right.matrix[2][2];

        aux_1 = front.matrix[2][0];
        aux_2 = front.matrix[2][1];
        aux_3 = front.matrix[2][2];

        right.matrix[2][0] = aux_1;
        right.matrix[2][1] = aux_2;
        right.matrix[2][2] = aux_3;

        aux_1 = back.matrix[2][0];
        aux_2 = back.matrix[2][1];
        aux_3 = back.matrix[2][2];

        back.matrix[2][0] = aux;
        back.matrix[2][1] = aux2;
        back.matrix[2][2] = aux3;

        aux = left.matrix[2][0];
        aux2 = left.matrix[2][1];
        aux3 = left.matrix[2][2];

        left.matrix[2][0] = aux_1;
        left.matrix[2][1] = aux_2;
        left.matrix[2][2] = aux_3;

        front.matrix[2][0] = aux;
        front.matrix[2][1] = aux2;
        front.matrix[2][2] = aux3;
    }

}
