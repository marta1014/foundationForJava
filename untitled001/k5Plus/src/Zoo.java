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
    //  解决新增动物时此处会又臭又长的尴尬
    public void start() {
        for (int i = 0; i < size; i++) {
                Activable animal = (Activable) animals[i];
                animal.active();
                // 此处实现以后无论增加什么类型的动物，只要继承自Animal并实现Activable接口，Zoo代码便不需要修改
        }
    }
}
