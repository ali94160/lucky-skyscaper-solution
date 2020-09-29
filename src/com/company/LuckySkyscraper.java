package com.company;

public class LuckySkyscraper {



    static public void floorList(int totalRealFloors){
        int fakeFloor = 1;
        for(int realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("RealFloors: " + realFloor + "FakeFloor: " + fakeFloor);
            do{
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }




    static public int toRealFloor(int fakeFloorGoal){
        int fakeFloor = 1;
        for(int realFloor = 1; realFloor <= fakeFloorGoal; realFloor++){
            if(fakeFloorGoal == fakeFloor){
                return realFloor;
            }
        }
        return -1;
    }




    static public int toFakeFloor(int realFloorGoal){
        int fakeFloor = 1;
        for(int realFloor = 1; realFloor <= realFloorGoal; realFloor++){
            if(realFloorGoal == fakeFloor){
                return realFloor;
            }
        }
        return -1;
    }






}
