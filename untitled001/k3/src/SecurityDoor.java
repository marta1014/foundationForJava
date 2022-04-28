public class SecurityDoor extends Door implements Lock{
    @Override
    public void open() {
        System.out.println("安全门打开");
    }

    @Override
    public void close() {
        System.out.println("安全门关闭");
    }

    @Override
    public void lock() {
        System.out.println("安全门锁定");
    }

    @Override
    public void unLock() {
        System.out.println("安全门解锁");
    }

    @Override
    public void bell() {
        System.out.println("门铃响起来");
        tackPicture();
    }

    public void tackPicture(){
        System.out.println("自动拍照");
    }

    public static void main(String[] args) {
        SecurityDoor sd = new SecurityDoor();
        sd.bell();
        sd.unLock();
        sd.open();
        sd.close();
        sd.lock();
    }
}
