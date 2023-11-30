package etu.unilim.fr.rover;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class roverTest{
    private Rover rover;
    private Position FInalposition;
@BeforeAll
public void innit(){
    rover = new Rover();
}

    @Test
    public void initial_position_test(){
        assertTrue(rover.Position()==new Position());
        assertTrue(rover.Position()==new Position());
    }
    @Test
    public void forward_then_right_then_forward(){
        FInalposition = new Position(1,1);
        rover.forward();
        rover.turnLeft();
        rover.forward();
        assertTrue(rover.Position()==FInalposition);
    }
    public void full_turn_on_itselft(){
        FInalposition = new Position(1,1);
        rover.forward();
        rover.turnLeft();
        rover.forward();
        assertTrue(rover.Position()==FInalposition);
    }
}
