package DesignPatterns.Observer;

public class ObserverImpl implements Observer {
    private String name;
    private String status;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        this.status = status;
        System.out.println("Observer received state change of subject ID is = " + name + " Status = " + this.status);
    }
   
}
