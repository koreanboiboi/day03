package myapp;

public class Honda extends Car {

    public Honda() {
        this.setMake("honda");
    }
    
    //@Override
    public void accelerate() {
        System.out.println("Accelerating...");
    }
    //@Override
    public void stop(Integer count) {
        System.out.printf("Stopping in %d seconds\n");
    }
}
