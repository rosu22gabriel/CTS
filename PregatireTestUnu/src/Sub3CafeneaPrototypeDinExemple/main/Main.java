//package Sub3CafeneaPrototypeDinExemple.main;
//
//import Sub2CafeneaSingletonDinExemple.incercare1.factory.Bautura;
//import Sub2CafeneaSingletonDinExemple.incercare1.factory.BauturaFactory;
//import Sub3CafeneaPrototypeDinExemple.prototype.BauturaPresetataRegistry;
//
//
//public class Main {
//    public static void main(String[] args) {
//        // 1. Creare 4 obiecte initiale folosind Factory
//        Bautura cafea1 = BauturaFactory.creeazaBautura("cafea", "Latte", 350, 15.0);
//        Bautura cafea2 = BauturaFactory.creeazaBautura("cafea", "Espresso", 30, 8.0);
//        Bautura ceai1 = BauturaFactory.creeazaBautura("ceai", "Fructe", 250, 12.0);
//        Bautura ciocolata1 = BauturaFactory.creeazaBautura("ciocolata", "Neagra", 200, 14.0);
//
//        // 2. Salvare sablon pentru client fidel (Prototype Registry)
//        cafea1.adaugaTopping("Caramel");
//        BauturaPresetataRegistry.adaugaSablon("Mihai_Morning_Latte", (Sub3CafeneaPrototypeDinExemple.prototype.Bautura) cafea1);
//
//        System.out.println("\n--- Simulare Plasare 4 Comenzi ---");
//
//        // Comanda 1: Noua
//        Bautura com1 = BauturaFactory.creeazaBautura("ceai", "Verde", 250, 10.0);
//        System.out.println("Comanda 1 (Noua): " + com1.getDetalii());
//
//        // Comanda 2: Copiata dupa sablonul lui Mihai
//        Bautura com2 = BauturaPresetataRegistry.getBauturaPersonalizata("Mihai_Morning_Latte");
//        System.out.println("Comanda 2 (Copie Sablon): " + com2.getDetalii());
//
//        // Comanda 3: Copiata si modificata ulterior (Prototype permite modificarea)
//        Bautura com3 = BauturaPresetataRegistry.getBauturaPersonalizata("Mihai_Morning_Latte");
//        com3.adaugaTopping("Frisca");
//        System.out.println("Comanda 3 (Copie + Topping extra): " + com3.getDetalii());
//
//        // Comanda 4: Noua
//        Bautura com4 = BauturaFactory.creeazaBautura("ciocolata", "Alba", 200, 16.0);
//        System.out.println("Comanda 4 (Noua): " + com4.getDetalii());
//
//        // Verificare preparare
//        System.out.println("\n--- Flux Preparare Comanda 3 ---");
//        com3.preparare();
//    }
//}
