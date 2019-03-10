package mvn.model;

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    int getBPM();
    void setBPM(int bpm);

    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);
    void registerObserver(BPMObserver observer);
    void removeObserver(BPMObserver observer);
}
