package practicaHarry;

public class Main {
    public static void main(String[] args) {
        Personaje harry = new Personaje("Harry James Potter", "Gryffindor", "Masculino", "Dementor", "Ciervo");

        Personaje snape = new Personaje("Severus Snape", "Slytherin", "Masculino", "Lord Voldemort", "Cierva");

        Personaje dumbledore = new Personaje("Albus Percival Wulfric Brian Dumbledore", "Gryffindor", "Masculino", "El cuerpo de su hermana Ariana", "Fénix");

        Personaje ron = new Personaje("Ronald \"Ron\" Bilius Weasley", "Gryffindor", "Masculino", "Acromántula", "Jack Russell Terrier");

        Personaje hermione = new Personaje("Hermione Jean Granger", "Gryffindor", "Femenino", "La profesora McGonagall", "Nutria");

        harry.showMessage();
        snape.showMessage();
        dumbledore.showMessage();
        ron.showMessage();
        hermione.showMessage();
    }
}
