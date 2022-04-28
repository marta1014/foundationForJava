public class OrdinaryPhone extends Phone implements PlayMusic{
    @Override
    public void call() {
        System.out.println("that great ,this ordinaryPhone can be call the everyone");
    }

    @Override
    public void sendMsg() {
        System.out.println("oh ` of course~ sendMsg is fucking you");
    }

    @Override
    public void playMusic() {
        System.out.println("music is good enjoy");
    }

    public static void main(String[] args) {
        OrdinaryPhone oPhone = new OrdinaryPhone();
        oPhone.call();
        oPhone.playMusic();
        oPhone.sendMsg();
    }
}
