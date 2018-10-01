package command.reciever;

public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Stereo is on");
    }

    public void off(){
        System.out.println("Stereo is off");
    }

    public void setCd(){
        System.out.println("Stereo CD");
    }

    public void setDvd(){
        System.out.println("Stereo DVD");
    }

    public void setRadio(){
        System.out.println("Stereo Radio");
    }

    public void setVolume(int  volume){
        System.out.println("Stereo Volume has " + volume);
    }
}
