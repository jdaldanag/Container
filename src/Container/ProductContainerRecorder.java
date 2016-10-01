package Container;

public class ProductContainerRecorder extends ProductContainer {
    ContainerHistory record = new ContainerHistory();
    
    public ProductContainerRecorder(String name,double capacity,double volume){
        super(name,capacity);
        this.addToTheContainer(volume); }
    
    public String history(){
        return record.toString(); }
    
    public void addToTheContainer(double volume){
        super.addToTheContainer(volume);
        record.add(this.getVolume()); }
    
    public double takeFromTheContainer(double amount){
        super.takeFromTheContainer(amount);
        record.add(this.getVolume());
        return amount; }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest Product Amount: " + this.record.maxValue());
        System.out.println("Smallest Product Amount: " + this.record.minValue());
        System.out.println("Average: " + this.record.average());
        System.out.println("Greatest Change: " + this.record.maxFluctuation());
        System.out.println("Variance: " + this.record.variance());
    }
    
}
