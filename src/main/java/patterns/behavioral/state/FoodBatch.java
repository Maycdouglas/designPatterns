package patterns.behavioral.state;

public class FoodBatch {
    private Number idBatch;
    private String food;
    private BatchStatus status;

    public FoodBatch(){
        this.status = BatchStatusUnderAnalysis.getInstance();
    }

    public void setStatus(BatchStatus status) {
        this.status = status;
    }

    public BatchStatus getStatus() {
        return status;
    }

    public void setIdBatch(Number idBatch) {
        this.idBatch = idBatch;
    }

    public Number getIdBatch() {
        return idBatch;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public boolean analyze(){
        return status.analyze(this);
    }

    public boolean discard(){
        return status.discard(this);
    }

    public boolean pack(){
        return status.pack(this);
    }

    public boolean reanalyze(){
        return status.reanalyze(this);
    }

    public boolean transport(){
        return status.transport(this);
    }

    public boolean confirmDelivery(){
        return status.confirmDelivery(this);
    }
}
