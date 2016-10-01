package Container;

public class Container {
    private double capacity = 0;
    private double volume = 0;
    
    public Container(double capacity){
        if(capacity > 0) this.capacity = capacity; }

    public double getVolume(){
        return this.volume; }

    public double getOriginalCapacity(){
        return this.capacity; }
        
    public double getCurrentCapacity(){
        return this.capacity - this.volume; }

    public void addToTheContainer(double amount){
        if(amount<=this.getCurrentCapacity()) this.volume += amount;
        if(amount>this.getCurrentCapacity()) this.volume = this.capacity; }

    public double takeFromTheContainer(double amount){
        if(amount <= 0) amount = 0;
        if(amount > this.volume) amount = this.volume;
        this.volume -= amount;
        return amount; }

    public String toString(){
        return "Volume: " + this.volume + ", free space: " + this.getCurrentCapacity(); }   
    
    
}
