class Car {

    public boolean isEngine;
    private int cylinders;
    private int wheels;
    public int speed;

    public Car(boolean isEngine, int cylinders, int wheels) {
        this.isEngine = isEngine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.speed = 0;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        if (!isEngine) {
            System.out.println("Starting the engine...");
            isEngine = true;
            System.out.println("Engine started successfully.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void accelerate(int increment) {
        if (isEngine) {
            speed += increment;
            System.out.println("Accelerating. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate. Engine is not running.");
        }
    }

    public void brake(int decrement) {
        if (speed >= decrement) {
            speed -= decrement;
            System.out.println("Applying brakes. Current speed: " + speed + " km/h");
        } else {
            speed = 0;
            System.out.println("Car has stopped.");
        }
    }
}
class jeep extends Car {
    public jeep(boolean isEngine, int cylinders, int wheels) {
        super(isEngine, cylinders, wheels);
    }

    // Override the start engine method for a jeep
    @Override
    public void startEngine() {
        if (!isEngine) {
            System.out.println("Starting the Jeep's engine...");
            isEngine = true;
            System.out.println("Jeep's engine started successfully.");
        } else {
            System.out.println("Jeep's engine is already running.");
        }
    }

    // Override the accelerate method for a jeep
    @Override
    public void accelerate(int increment) {
        if (isEngine()) {
            speed += increment;
            System.out.println("Accelerating Outback. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate Outback. Engine is not running.");
        }
    }

    // Override the brake method for an jeep
    @Override
    public void brake(int decrement) {
        if (speed >= decrement) {
            speed -= decrement;
            System.out.println("Applying brakes to Outback. Current speed: " + speed + " km/h");
        } else {
            speed = 0;
            System.out.println("Outback has stopped.");
        }
    }
}


class outback extends Car {
    public outback(boolean isEngine, int cylinders, int wheels) {
        super(isEngine, cylinders, wheels);
    }

    // Override the start engine method for a jeep
    @Override
    public void startEngine() {
        if (!isEngine) {
            System.out.println("Starting the outbacks's engine...");
            isEngine = true;
            System.out.println("outbacks's engine started successfully.");
        } else {
            System.out.println("outbacks's engine is already running.");
        }
    }

    // Override the accelerate method for an Outback
    @Override
    public void accelerate(int increment) {
        if (isEngine()) {
            speed += increment;
            System.out.println("Accelerating Outback. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate Outback. Engine is not running.");
        }
    }

    // Override the brake method for an Outback
    @Override
    public void brake(int decrement) {
        if (speed >= decrement) {
            speed -= decrement;
            System.out.println("Applying brakes to Outback. Current speed: " + speed + " km/h");
        } else {
            speed = 0;
            System.out.println("Outback has stopped.");
        }
    }
}

class audi extends Car {
    public audi(boolean isEngine, int cylinders, int wheels) {
        super(isEngine, cylinders, wheels);
    }

    // Override the start engine method for  audi
    @Override
    public void startEngine() {
        if (!isEngine) {
            System.out.println("Starting the audi's engine...");
            isEngine = true;
            System.out.println("audi's engine started successfully.");
        } else {
            System.out.println("audi's engine is already running.");
        }
    }

    // Override the accelerate method for audi
    @Override
    public void accelerate(int increment) {
        if (isEngine()) {
            speed += increment;
            System.out.println("Accelerating audi. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate audi. Engine is not running.");
        }
    }

    // Override the brake method for audi
    @Override
    public void brake(int decrement) {
        if (speed >= decrement) {
            speed -= decrement;
            System.out.println("Applying brakes to audi. Current speed: " + speed + " km/h");
        } else {
            speed = 0;
            System.out.println("Outback has stopped.");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        //create an instance of a jeep
        jeep myJeep = new jeep(false, 4, 4);

        //call the methods
        myJeep.startEngine();
        myJeep.accelerate(50);
        myJeep.brake(50);

        //create an instance of an outback
        outback myOutback = new outback(false, 4, 4);

        //call the methods
        myOutback.startEngine();
        myOutback.accelerate(50);
        myOutback.brake(50);

        //create an instance of an audi
        audi myAudi = new audi(false, 4, 4);

        //call the methods
        myAudi.startEngine();
        myAudi.accelerate(50);
        myAudi.brake(50);

    }
}




































