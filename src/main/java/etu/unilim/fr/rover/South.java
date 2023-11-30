package etu.unilim.fr.rover;

public class South implements Orientation{

    public Orientation turnLeft(){
        return new East();
    }

    public Orientation turnRight(){
        return new West();
    }

    public Position forward(Position position){
        position.yMinus1();
        return position;
    }

    public Position backward(Position position){
        position.yPlus1();
        return position;
    }
}
