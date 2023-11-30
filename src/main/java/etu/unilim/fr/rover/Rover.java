package etu.unilim.fr.rover;

public class Rover{
    private Position position;
    private Orientation orientation;

    public Rover(){
         this.position = new Position();
         this.orientation = new North();
    }

    public Position Position(){
      return this.position;
        }

    public Orientation Orientation(){
      return this.orientation;
        }

    public void setOrientation(Orientation orientation){
        this.orientation = orientation;
    }

    public void setPosition(Position position){
            this.position = position;
    }
    public void forward() {
        setPosition(this.orientation.forward(this.position));
    }

    public void backward(){
        setPosition(this.orientation.backward(this.position));
    }

    public void turnLeft(){;
        setOrientation((orientation.turnLeft()));
    }

    public void turnRight(){
        setOrientation(orientation.turnRight());
   }
}
