public class Client {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Tiger("join",22));
        zoo.addAnimal(new Tiger("lili",2));
        zoo.addAnimal(new Tiger("sam",19));

        zoo.addAnimal(new Dolphin("aLin",3));
        zoo.addAnimal(new Dolphin("aSa",8));

        zoo.addAnimal(new Eagle("black",7));

        zoo.start();
    }
}
