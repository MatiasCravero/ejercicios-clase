package UltimaClase;

public class Time {
    public long startTime;
    public long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    };
    public void end(){
        this.endTime = System.currentTimeMillis();
    };

    public long totalTime(){
        return endTime - startTime;
    }
}
