package box;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(Box box, double weight) {
        super(box);
        this.weight = weight;
    }

    public BoxWeight(Box box1, Box box2, double weight) {
        super(box1, box2);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);

    }
}
