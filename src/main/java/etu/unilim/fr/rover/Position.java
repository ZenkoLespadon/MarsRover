package etu.unilim.fr.rover;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x=x ;
        this.y=y ;
    }
    public Position(){
        this.x = 0;
        this.y =0;
    }
    public void xPlus1(){
        this.x += 1;
    }

    public void xMinus1(){
        this.x -= 1;
    }

    public void yPlus1(){
        this.y += 1;
    }

    public void yMinus1(){
        this.y -= 1;
    }

    public int x(){
        return this.x;
    }

    public int y(){
        return this.y;
    }

}
