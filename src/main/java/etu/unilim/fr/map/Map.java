package etu.unilim.fr.map;

import etu.unilim.fr.rover.Rover;

public class Map {
    Integer height;
    Integer width;
    Rover rover;

    Map(Integer height, Integer width, Rover rover){
        this.height = height;
        this.width = width;
        this.rover = rover;
    }
}
