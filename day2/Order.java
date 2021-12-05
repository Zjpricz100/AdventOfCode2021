public class Order {
    private String direction;
    private int amount;


    public Order(String s, int a)
    {
        direction = s;
        amount = a;
    }
    public String getDirection(){
        return direction;
    }
    public int getAmount(){
        return amount;
    }
    public void setDirection(String direction)
    {
        this.direction = direction;
    }
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    public String toString(){
        return direction + " " + amount;
    }
}
