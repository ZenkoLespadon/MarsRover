package etu.unilim.fr.rover;

public class East implements Orientation{

    public Orientation turnLeft(){
        return new North();
    }

    public Orientation turnRight(){
        return new South();
    }

    public Position forward(Position position){
        position.xMinus1();
        return position;
    }

    public Position backward(Position position){
        position.xPlus1();
        return position;
    }
}
