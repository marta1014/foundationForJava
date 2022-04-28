public class Zoo {
    private Animal[] animals= new Animal[100];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addAnimal(Animal item) {
        if(size > animals.length) {
            System.out.println("容器已满");
            return;
        }
//        animals[size] = item;
//        size++;
        animals[size++] = item;
    }

    public void start() {
        for (int i = 0; i < size; i++) {
                Animal animal = animals[i];
                if(animal instanceof Tiger) {
                    Tiger tiger = (Tiger)animal;
                    tiger.run();
                }
                if(animal instanceof Dolphin) {
                    Dolphin dolphin = (Dolphin) animal;
                    dolphin.swim();
                }
                if(animal instanceof Eagle) {
                    Eagle eagle = (Eagle) animal;
                    ((Eagle) animal).fly();
                }
        }
    }
}
