package ca.nait.dmit.domain;

public class BMI {

    private double weight;
    private double height;

    public double bmi(){
        return 703 * weight / Math.pow(height,2);
    }

    public String bmiCategory(){
        return "";
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public BMI() {
        weight = 100;
        height = 100;
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

}
