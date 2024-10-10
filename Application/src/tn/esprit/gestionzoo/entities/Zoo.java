package tn.esprit.gestionzoo.entities;

public class Zoo {

    Animal[] animals;
    public String name;
    public String city;
    public final int nbrCages = 25;
    public int animalCount = 0;

    public Zoo(){}
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    @Override
    public String toString() {
        return "Zoo" + "nom='" + name + '\'' + ", city='" + city + '\'' + ", nbrCages=" + nbrCages + ", animalCount=" + animalCount ;
    }


    public void displayZoo() {
        System.out.println("nom de zoo: " + name);
        System.out.println("City: " + city);
        System.out.println("nbre de cages: " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("impossible d'ajouter un animal");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name == animal.name) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {

            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
            animalCount--;
            return true;
        }
        return false;
    }

    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            System.out.println("meme nbres d'animals");
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null ) {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }
}
