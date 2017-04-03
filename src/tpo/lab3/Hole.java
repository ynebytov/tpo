package tpo.lab3;

/**
 * Created by anastasia on 19.03.17.
 */
public class Hole {

    private String  type;
    private long    openTime;
    private String  lastTransferType;
    private SpaceExpanses lastTransferThrough;
    private Galaxy  lastTransferDestination;
    private Galaxy lastTransferSource;

    public Hole() {
        openTime = System.currentTimeMillis();
    }

    public String getType() {
        return type;
    }

    public Hole(String type) {
        this();
        this.type = type;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void transfer(String transferType, Words talk, SpaceExpanses thr, Galaxy dst) {
        this.lastTransferType = transferType;
        this.lastTransferThrough = thr;
        this.lastTransferDestination = dst;
        this.lastTransferSource = talk.getSource().getLocation();
        this.lastTransferThrough.send(talk, this.lastTransferDestination);
    }

    public String getLastTransferType() {
        return lastTransferType;
    }

    public SpaceExpanses getLastTransferThrough() {
        return lastTransferThrough;
    }

    public Galaxy getLastTransferDestination() {
        return lastTransferDestination;
    }

    public Galaxy getLastTransferSource() {
        return this.lastTransferSource;
    }
}
