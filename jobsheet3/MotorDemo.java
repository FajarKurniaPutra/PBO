public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();

        Motor motor4 = new Motor();
        motor4.setPlatNomor("P 1554 AZ");
        motor4.setIsMesinOn(true);
        motor4.setKecepatan(110);
        motor4.displayStatus();

        Motor motor5 = new Motor();
        motor5.setPlatNomor("S 4937 IP");
        motor5.setIsMesinOn(true);
        motor5.setKecepatan(-10);
        motor5.displayStatus();
    }
}