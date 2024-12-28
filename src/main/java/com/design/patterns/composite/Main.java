package com.design.patterns.composite;

public class Main {
    public static void main(String[] args) {
        Housing building =new Housing("123 San Francisco");
        Housing floor1=new Housing("123 San Francisco Floor1");
        int firstFloor= building.addStructure(floor1);


        Room washRoomM=new Room("Men's washroom floor1");
        Room washRoomW=new Room("Women's washroom floor1");
        Room commonRoom=new Room("Common floor1");

        int menWashRoom= floor1.addStructure(washRoomM);
        int womenWashRoom=floor1.addStructure(washRoomW);
        int Floor1CommonRoom=floor1.addStructure(commonRoom);


        building.entry();
        Housing currentFloor= (Housing) building.getStructure(firstFloor);
        currentFloor.entry();
        Room currentRoom= (Room) currentFloor.getStructure(Floor1CommonRoom);
        currentRoom.entry();
    }
}
