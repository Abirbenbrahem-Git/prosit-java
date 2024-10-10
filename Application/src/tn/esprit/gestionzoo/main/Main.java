package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {

  public static void main(String[] args) {

        Animal lion = new Animal("a1", "Lion", 5, true);
        Animal lion1 = new Animal("a2", "Lion1", 6, true);
        Zoo myZoo = new Zoo("My Zoo", "Tunis");
        Zoo zoo1 = new Zoo("Zoo1", "Nabeul");

        myZoo.displayZoo();
        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion1);
        myZoo.displayAnimals();


        int index = myZoo.searchAnimal(lion);
        System.out.println("Lion trouvé à l'indice: " + index);


        boolean removed = myZoo.removeAnimal(lion);
        System.out.println("Lion supprimé avec succées ");

        System.out.println(zoo1.isZooFull());
        Zoo grandez = Zoo.comparerZoo(zoo1, myZoo);
        if (grandez != null) {
              System.out.println(grandez.name);
        }

        Aquatic aquaticAnimal = new Aquatic();
        Terrestrial terrestrialAnimal = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        Dolphin dolphin1 = new Dolphin("dolphin1", "Dolphin", 2, true, "Ocean", 10);
        Penguin penguin1 = new Penguin("penguin1", "Penguin", 5, false, "Antarctica", 20);
        System.out.println(dolphin);
        System.out.println(penguin);
        dolphin.swim();
        penguin.swim();




    }


}
