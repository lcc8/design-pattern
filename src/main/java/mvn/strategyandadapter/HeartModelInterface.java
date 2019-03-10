package mvn.strategyandadapter;
import mvn.model.BPMObserver;
import mvn.model.BeatObserver;

public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver observer);
    void registerObserver(BPMObserver observer);
    void removeObserver(BeatObserver observer);
    void removeObserver(BPMObserver observer);

}
