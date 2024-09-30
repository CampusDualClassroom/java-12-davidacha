package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 25;
    public String fuel;
    public int speedometer=0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle=0;

    public Car(String brand, String model, String fuel){
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
    }
    public Car(){

    }

    public void start(){
        if(this.tachometer==0){
            this.tachometer=1000;
            System.out.println("Vehiculo acendido");
        }else{
            System.out.println("O vehículo xa está acendido");
        }
    }

    public boolean isTachometerGreaterThanZero(){
        if(tachometer>0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isTachometerEqualToZero(){
        if(tachometer==0){
            return true;
        }else{
            return false;
        }
    }

    public void stop(){
        if(this.speedometer ==0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate(){
        if(speedometer<MAX_SPEED){
            this.speedometer++;
        }
    }

    public void brake(){
        if(speedometer>0){
            this.speedometer--;
        }
    }

    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;
        if (newAngle > 45) {
            this.wheelsAngle = 45;
        } else if (newAngle < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = newAngle;
        }
    }

    public String showSteeringWheelDetail(){
        return ""+wheelsAngle;
    }

    public boolean isReverse(){
        return reverse;
    }

    public void setReverse(boolean reverse) {
        if(this.speedometer==0) {
            this.reverse = reverse;
            this.gear="R";
        }

    }
}
