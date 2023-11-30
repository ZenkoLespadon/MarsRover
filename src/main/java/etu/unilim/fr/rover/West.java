package etu.unilim.fr.rover;

public class West implements Orientation{

    public Orientation turnLeft(){
        return new South();
    }

    public Orientation turnRight(){
        return new North();
    }

    public Position forward(Position position){
        position.xPlus1();
        return position;
    }

    public Position backward(Position position){
        position.xMinus1();
        return position;
    }

}