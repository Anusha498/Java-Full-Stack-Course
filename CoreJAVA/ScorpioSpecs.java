class ScorpioSpecs {
    public static void main(String[] args){

        //Basic Specifications
        double araiMileage =  14.44; //in kmpl
        String fuelType = "Diesel";
        int engineDisplacement = 2184; //in cc 
        int numberOfCylinders = 4;
        String maxPower = "130bhp@3750rpm";
        String maxTorque = "300Nm@1600-2800rpm";
        int seatingCapacity1 = 7;
        int seatingCapacity2 = 9;
        String transmissionType = "Manual";

        //Dimensions
        int bootSpace = 460; //in liters
        int fuelTankCapacity = 60; //in liters
        String bodyType = "SUV";

        //key features
        boolean  hasPowerSteering = true;
        boolean hasPowerWindowsFront = true;
        boolean hasABS = true;
        boolean hasAirConditioner = true;
        boolean hasDriverAirbag = true;
        boolean hasPassengerAirbag = true;
        boolean hasAutomaticClimateControl = true;
        boolean hasAlloyWheels = true;
        boolean hasMultiFunctionSteeringWheel = true;

        //output
        System.out.println("Mahindra Scorpio Specifications:");
        System.out.println("ARAI Mileage: " + araiMileage + " kmpl");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Displacement: " + engineDisplacement + " cc");
        System.out.println("No. Of Cylinders: " + numberOfCylinders);
        System.out.println("Max Power: " + maxPower);
        System.out.println("Max Torque: " + maxTorque);
        System.out.println("Seating Capacity: " + seatingCapacity1 + "or" + seatingCapacity2);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Boot Space: " + bootSpace + " Litres");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " Litres");
        System.out.println("Body Type: " + bodyType);

        System.out.println("\nKey Features: ");
        System.out.println("Power Steering: " + hasPowerSteering);
        System.out.println("Power windows Front: " + hasPowerWindowsFront);
        System.out.println("Anti-lock Braking System(ABS): " + hasABS);
        System.out.println("Air Conditioner: " + hasAirConditioner);
        System.out.println("Driver Airbag: " + hasDriverAirbag);
        System.out.println("Passenger Airbag: " + hasPassengerAirbag);
        System.out.println("Automatic Climate Control: " + hasAutomaticClimateControl);
        System.out.println("Alloy Wheels: " + hasAlloyWheels);
        System.out.println("Multi-function steering Wheel: " + hasMultiFunctionSteeringWheel);
    }
}
