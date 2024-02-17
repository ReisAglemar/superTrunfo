package entities;

/**
 *
 * @author reis
 */
public class DeskCards {

    private String markNameEngine;
    private int horsepower, cilynderCapacity, maxSpeed;
    private float torque, acceleration0a100;

    public DeskCards(String markNameEngine, int horsepower, int cilynderCapacity,
            int maxSpeed, float torque, float acceleration0a100) {
        this.markNameEngine = markNameEngine;
        this.horsepower = horsepower;
        this.cilynderCapacity = cilynderCapacity;
        this.maxSpeed = maxSpeed;
        this.torque = torque;
        this.acceleration0a100 = acceleration0a100;
    }

    public String getMarkNameEngine() {
        return markNameEngine;
    }

    public void setMarkNameEngine(String markNameEngine) {
        this.markNameEngine = markNameEngine;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getCilynderCapacity() {
        return cilynderCapacity;
    }

    public void setCilynderCapacity(int cilynderCapacity) {
        this.cilynderCapacity = cilynderCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    public float getAcceleration0a100() {
        return acceleration0a100;
    }

    public void setAcceleration0a100(float acceleration0a100) {
        this.acceleration0a100 = acceleration0a100;
    }

    @Override
    public String toString() {
        String formatOut = """
                                   
                        \t==== %s ====
                                  
                        \t 1- Horse Power: %d HP
                                    
                        \t 2- Torque: %.1f Kgf/m²
                                    
                        \t 3- Cilynder Capacity: %d cc
                                    
                        \t 4- Aceleration 0 a 100: %.1f s
                                    
                        \t 5- Max Speed: %d Km/h
                        """.formatted(getMarkNameEngine(), getHorsepower(),
                getTorque(), getCilynderCapacity(), getAcceleration0a100(), getMaxSpeed());

        return formatOut;
    }

}
