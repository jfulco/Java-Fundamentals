package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {
    public static void main(String[] args) {


        //Objects for each of the classes
        PlaneEngine engine = new PlaneEngine(24);
        FirstClass hasFirstClass = new FirstClass(false);
        Airline airline = new Airline("Spirit");
        SnacksOffered snacksOffered = new SnacksOffered("peanuts, candy, soda");
        Airplane somePlane = new Airplane(engine, hasFirstClass, airline, snacksOffered, 123, 111);

        System.out.println(airline.getAirline() + " airline offers " + snacksOffered.getSnacksOffered() + " for snacks! It also has an engine with " + engine.getHorsePower() + " horsepower.");
        System.out.println(somePlane.toString());
    }
}

class PlaneEngine {
    private double horsePower;

    public PlaneEngine(double horsePower){
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "PlaneEngine{" +
                "horsePower=" + horsePower +
                '}';
    }
}








    class FirstClass {
        private boolean hasFirstClass = true;


        public FirstClass(boolean hasFirstClass) {
            this.hasFirstClass = hasFirstClass;
            if (hasFirstClass == true){
                System.out.println(" The airline has first class! :)");
            } else{
                System.out.println("The airline does not have first class! :(");
            }
        }

        public boolean isHasFirstClass() {
            return hasFirstClass;
        }

        public void setHasFirstClass(boolean hasFirstClass) {
            this.hasFirstClass = hasFirstClass;
        }

        @Override
        public String toString() {
            return "FirstClass{" +
                    "hasFirstClass=" + hasFirstClass +
                    '}';
        }
    }












    class Airline {
        private String airline;

        public Airline(String airline) {
            this.airline = airline;
        }

        public String getAirline() {
            return airline;
        }

        public void setAirline(String airline) {
            this.airline = airline;
        }

        @Override
        public String toString() {
            return "Airline{" +
                    "airline='" + airline + '\'' +
                    '}';
        }
    }











    class SnacksOffered {
        private String snacksOffered;

        public SnacksOffered(String snacksOffered) {
            this.snacksOffered = snacksOffered;
        }

        public String getSnacksOffered() {
            return snacksOffered;
        }

        public void setSnacksOffered(String snacksOffered) {
            this.snacksOffered = snacksOffered;
        }

        @Override
        public String toString() {
            return "SnacksOffered{" +
                    "snacksOffered='" + snacksOffered + '\'' +
                    '}';
        }
    }











    class Airplane {
        PlaneEngine engine;
        FirstClass hasFirstClass;
        Airline airline;
        SnacksOffered snacksOffered;
        private double fuelCapacity;
        private double currentFuelLevel;

        public Airplane(PlaneEngine engine, FirstClass hasFirstClass, Airline airline, SnacksOffered snacksOffered,
                        double fuelCapacity, double currentFuelLevel) {
            this.engine = engine;
            this.hasFirstClass = hasFirstClass;
            this.airline = airline;
            this.snacksOffered = snacksOffered;
            this.fuelCapacity = fuelCapacity;
            this.currentFuelLevel = currentFuelLevel;
        }

        public PlaneEngine getEngine() {
            return engine;
        }

        public void setEngine(PlaneEngine engine) {
            this.engine = engine;
        }

        public FirstClass getHasFirstClass() {
            return hasFirstClass;
        }

        public void setHasFirstClass(FirstClass hasFirstClass) {
            this.hasFirstClass = hasFirstClass;
        }

        public Airline getAirline() {
            return airline;
        }

        public void setAirline(Airline airline) {
            this.airline = airline;
        }

        public SnacksOffered getSnacksOffered() {
            return snacksOffered;
        }

        public void setSnacksOffered(SnacksOffered snacksOffered) {
            this.snacksOffered = snacksOffered;
        }

        public double getFuelCapacity() {
            return fuelCapacity;
        }

        public void setFuelCapacity(double fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public double getCurrentFuelLevel() {
            return currentFuelLevel;
        }

        public void setCurrentFuelLevel(double currentFuelLevel) {
            this.currentFuelLevel = currentFuelLevel;
        }

        @Override
        public String toString() {
            return "Airplane{" +
                    "\nengine=" + engine.toString() +
                    "\n, hasFirstClass=" + hasFirstClass.toString() +
                    "\n, airline=" + airline.toString() +
                    "\n, snacksOffered=" + snacksOffered.toString() +
                    "\n, fuelCapacity=" + fuelCapacity +
                    "\n, currentFuelLevel=" + currentFuelLevel +
                    '}';
        }
    }
