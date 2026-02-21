class FarmResource {
    private String harvest_seasons;
    private String animal_type;
    private double noofcro;
    void setHar(String hs) {
        harvest_seasons = hs;
    }
    void setAni(String at) {
        animal_type = at;
    }
    void setNoofcr(double nc) {
        noofcro = nc;
    }
    String gethar() {
        return harvest_seasons;
    }
    String getAni() {
        return animal_type;
    }
    double getNoofcr() {
        return noofcro;
    }
    void display() {
        System.out.println("Harvest Season: " + harvest_seasons);
        System.out.println("Animal Type: " + animal_type);
        System.out.println("Number of Crops: " + noofcro);
    }
}
class Crop extends FarmResource {
    private String croptype;
    void setcrty(String ct) {
        croptype = ct;
    }
    String getcrot() {
        return croptype;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Crop Type: " + croptype);
    }
}

class Livestock extends FarmResource {
    private int number_of_animals;

    void setNoofanimals(int noa) {
        number_of_animals = noa;
    }

    int getNoofanimals() {
        return number_of_animals;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Number of Animals: " + number_of_animals);
    }
}

class Farmer {
    public static void main(String... args) {
        Crop crop = new Crop();
        crop.setHar("Winter");
        crop.setNoofcr(50);
        crop.setAni()
        crop.setcrty("Wheat");
        crop.display();
        Livestock ls = new Livestock();
        ls.setAni("Cow");
        ls.setNoofanimals(10);
        ls.display();
    }
}