package lab3.Decorator;

public abstract class Beverage {
    protected String description;
    protected float cost;

    public Beverage(String description, float cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}

