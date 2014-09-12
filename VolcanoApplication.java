package java21;

class VolcanoApplicaton {
    public static void main(String[] arguments) {
        VolcanoRobot dante = new VolcanoRobot();
        VolcanoRobot virgil = new VolcanoRobot();
        virgil.status = "exploring";
        virgil.speed = 2;
        virgil.temperature = 510;
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        
        virgil.showAttributes();
        dante.showAttributes();
        System.out.println("Increasing speed to 3");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
    }
}
