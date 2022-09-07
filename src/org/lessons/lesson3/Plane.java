package org.lessons.lesson3;

public class Plane {
    private int countPassengers;
    private int countWorkers;

    public Plane(int passengers, int workers){
        this.countPassengers = passengers;
        this.countWorkers = workers;
    }

    private int getCountPeople(){
        return countPassengers + countWorkers;
    }

    public void fly(){
        if(getCountPeople() >= 0){
            System.out.println("Самолет взлетит");
        } else {
            System.out.println("Самолет не взлетит");
        }
    }

}
