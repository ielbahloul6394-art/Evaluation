package locationvehicules;



public class Main {

    public static void main(String[] args) {

        // 1. Creation des clients
        Client c1 = new Client(1, "Alami", "Sara");
        Client c2 = new Client(2, "Amrani", "Youssef");

        // 2. Creation des vehicules
        Voiture v1 = new Voiture("12345-A-1", "Dacia", 300, 5);
        Voiture v2 = new Voiture("23456-B-2", "Renault", 400, 7);
        Moto m1 = new Moto("34567-C-3", "Yamaha", 150, 125);

        // 3. Tableau des vehicules
        Vehicule[] vehicules = {v1, v2, m1};

        System.out.println("===== LISTE DES VEHICULES =====");

        for (int i = 0; i < vehicules.length; i++) {
            System.out.println("\nVehicule " + (i + 1));
            vehicules[i].afficherDetails();
            System.out.println("Cout pour 1 jour : "
                    + vehicules[i].calculerCout(1) + " DH");
        }

        // 4. Creation des locations
        Location l1 = new Location(c1, v1, 3);
        Location l2 = new Location(c2, v2, 2);
        Location l3 = new Location(c1, m1, 6);

        // 5. Tableau des locations
        Location[] locations = {l1, l2, l3};

        System.out.println("\n===== LISTE DES LOCATIONS =====");

        double total = 0;

        for (int i = 0; i < locations.length; i++) {
            locations[i].afficherRecapitulatif();
            total += locations[i].calculerMontant();
            System.out.println();
        }

        // 6. Montant total
        System.out.println("===== MONTANT TOTAL =====");
        System.out.println("Total de toutes les locations : "
                + total + " DH");
    }
}

