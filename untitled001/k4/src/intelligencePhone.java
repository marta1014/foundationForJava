public class intelligencePhone extends Phone implements Photograph,Network,PlayMusic{
    @Override
    public void call() {
        System.out.println("call by intelligencePhone");
    }

    @Override
    public void sendMsg() {
        System.out.println("sendMsg by intelligencePhone");
    }

    @Override
    public void network() {
        System.out.println("intelligencePhone have network");
    }

    @Override
    public void photograph() {
        System.out.println("intelligencePhone can photograph");
    }

    @Override
    public void playMusic() {
        System.out.println("intelligenceP hone can playMusic");
    }

    public static void main(String[] args) {
        intelligencePhone iphone = new intelligencePhone();
        iphone.call();
        iphone.playMusic();
        iphone.network();
        iphone.photograph();
        iphone.sendMsg();
    }
}
