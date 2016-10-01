package Container;
import java.util.ArrayList;

public class ContainerHistory {
    private ArrayList<Double> history = new ArrayList<Double>();
    
    public ContainerHistory(){ }
    
    public void add(double situation){
        history.add(situation); }
    
    public void delete(){
        history.clear(); }
    
    public String toString(){
        return history.toString(); }
    
    public double maxValue(){
        double x=0;
        if(history.size()>0){
        for(int i=0; i<history.size(); i++){
            if(x<history.get(i)) x=history.get(i); }
        return x; }
        else return 0; }
    
    public double minValue(){
        double x=99999;
        if(history.size()>0){
        for(int i=0; i<history.size(); i++){
            if(x>history.get(i)) x=history.get(i); }
        return x; }
        else return 0; }
    
    public double average(){
        double x=0;
        if(history.size()>0){
        for(int i=0; i<history.size(); i++){
            x += history.get(i); }
        return x / history.size(); }
        else return 0; }
    
    public double maxFluctuation(){
        double x=0; double y;
        if(history.size()>1){
        for(int i=0; i<history.size()-1; i++){
            y = history.get(i) - history.get(i+1);
            if(x < y) x = y; }
        return x; }
        else return 0; }
    
    public double variance(){
        double x=0; 
        if(history.size()>1){
        for(int i=0; i<history.size(); i++){
            double y = history.get(i)-this.average();
            x += (y*y); }
        return x / history.size(); }
        else return 0; }
    
}
