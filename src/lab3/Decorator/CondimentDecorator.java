package lab3.Decorator;

public class CondimentDecorator extends Beverage { ///MOSTENIRE
    protected Beverage beverage;

    public CondimentDecorator(String description, float cost, Beverage beverage) {
        super(description, cost);
        this.beverage = beverage;
    }

    public String getDescription() {
        return description + ", " + beverage.getDescription();
    }

    public float getCost() {
        return cost + beverage.getCost();
    }
}
