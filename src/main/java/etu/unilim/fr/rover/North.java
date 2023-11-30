package etu.unilim.fr.rover;

public class North implements Orientation{

    public Orientation turnLeft(){
        return new West();
    }

    public Orientation turnRight(){
        return new East();
    }

    public Position forward(Position position){
        position.yPlus1();
        return position;
    }

    public Position backward(Position position){
        position.yMinus1();
        return position;
    }

}
