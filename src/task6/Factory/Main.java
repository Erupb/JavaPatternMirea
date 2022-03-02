package task6.Factory;


class Factory {
    public OS getCurrentOS(String inputos) {
        OS os = null;
        if (inputos.equals("windows")) {
            os = new windowsOS();
        } else if (inputos.equals("linux")) {
            os = new linuxOS();
        } else if (inputos.equals("mac")) {
            os = new macOS();
        }
        return os;
    }
}
interface OS {
    void getOS();
}
class windowsOS implements OS {
    public void getOS () {
        System.out.println("применить для windows");
    }
}
class linuxOS implements OS {
    public void getOS () {
        System.out.println("применить для linux");
    }
}
class macOS implements OS {
    public void getOS () {
        System.out.println("применить для mac");
    }
}

class FactoryTest {//тест
    public static void main(String[] args){
        String myos = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(myos);
        os.getOS();
    }
}