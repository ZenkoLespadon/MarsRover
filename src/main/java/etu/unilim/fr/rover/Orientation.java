package etu.unilim.fr.rover;
public interface Orientation {

    public Orientation turnLeft();

    public Orientation turnRight();

    public Position forward(Position position);

    public Position backward(Position position);
}
