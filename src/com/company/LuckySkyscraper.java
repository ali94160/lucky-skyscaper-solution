package com.company;

public class LuckySkyscraper {


 static public void floorList(int totalRealFloors){
     int fakeFloor = 1;
     for(int realFloor = 1; realFloor <= totalRealFloors; realFloor++) {
         System.out.println("RealFloor " + realFloor + " FakeFloor: " + fakeFloor);


         do {
             fakeFloor++;
         } while (fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
     }

 }

}
