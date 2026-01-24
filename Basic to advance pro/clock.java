class clock {
    private int time = 0;

    // Internal event
    public void tick() {
        time++;
    }

    // Send event
    public int sendEvent() {
        time++;
        return time;
    }

    // Receive event
    public void receiveEvent(int receivedTime) {
        time = Math.max(time, receivedTime) + 1;
    }

    public int getTime() {
        return time;
    }
}
