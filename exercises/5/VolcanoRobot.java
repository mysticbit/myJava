/*chp 5 - include constructor methods 
* To create a constructore just create a method
* with the exact same name as the class itself
*/


class VolcanoRobot { 
    String status;
    int speed;
    float temperature;

//This is the constructor

    VolcanoRobot() {
        status = "Hot diggity!";
        speed = 200;
        temperature = 96.5f;
    }
    
    public static void main(String[] args) {
        VolcanoRobot dante = new VolcanoRobot();
        dante.showAttributes();
        dante.checkTemperature();
    }


    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home!";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}

