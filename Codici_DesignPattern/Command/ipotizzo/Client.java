// Client
public class Client {
    public static void main(String[] args) {
        // Creazione del receiver
        Light light = new Light();

        // Creazione dei comandi
        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        // Creazione dell'invoker
        RemoteControl remote = new RemoteControl();

        // Configurazione dei comandi nell'invoker
        remote.setCommand(turnOnCommand);
        remote.pressButton(); // Accende la luce

        remote.setCommand(turnOffCommand);
        remote.pressButton(); // Spegne la luce
    }
}
