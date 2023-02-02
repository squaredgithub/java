package hello;

public class Phone {
    private  String name;
    private int screenSize;
    private int memoryRam;
    private  int camera;


    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;

    }

    public Phone(String name, int camera) {
        this.name = name;
        this.camera = camera;
    }

    public void playMusic (String trackName) {
        System.out.println("Playing " + trackName);
    }
    public  void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return  this.name;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }
}
