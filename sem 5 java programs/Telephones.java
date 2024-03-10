abstract class Telephone {
    public abstract void call();

    public abstract void lift();

    public abstract void disconnect();
}

class SmartTelephone extends Telephone {
    @Override
    public void call() {
        System.out.println("Making a call from a smart telephone");
    }

    @Override
    public void lift() {
        System.out.println("Lifting a smart telephone");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting a smart telephone");
    }
}

public class Telephones {
    public static void main(String[] args) {
        Telephone telephone1 = new SmartTelephone();
        telephone1.lift(); 
        telephone1.call(); 
        telephone1.disconnect();
    }
}
