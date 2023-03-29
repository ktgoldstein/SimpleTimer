public class SimpleTimer {

    private long startTime;
    private long endTime;
    private long finalTimeNano;

    /**
     * Initialize timer.
     */
    public SimpleTimer() {
        this.startTime = 0L;
        this.endTime = 0L;
        this.finalTimeNano = 0L;
    }

    /**
     * Starts timer.
     */
    public void start() {
        this.startTime = System.nanoTime();
    }

    /**
     * Stops timer.
     * 
     * @param t
     *            the unit of time to return: TimeUnit.MILLI (milliseconds), or
     *            TimeUnit.SECONDS (seconds)
     * @return elapsed time since this.start() was called, in unit specified by
     *         argument
     */
    public double stop(TimeUnit t) {
        this.endTime = System.nanoTime();
        this.finalTimeNano = this.endTime - this.startTime;
        return this.finalTimeNano / t.value();
    }

    /**
     * Stops timer. Default implementation for nanoseconds if no unit (seconds,
     * milliseconds) is specified otherwise.
     * 
     * @return elapsed time since this.start() was called, in nanoseconds
     */
    public long stop() {
        this.endTime = System.nanoTime();
        this.finalTimeNano = this.endTime - this.startTime;
        return this.finalTimeNano;
    }

    /**
     * Gets final time elapsed of stopped timer, in unit specified by the
     * argument.
     * 
     * @param t
     *            unit of elapsed time
     * @return final elapsed time measured by this MyTimer if this.start() and
     *         this.stop() has already been called, in that order; 0L otherwise
     */
    public double getFinalTime(TimeUnit t) {
        return this.finalTimeNano / t.value();
    }

    /**
     * Gets current time elapsed, in unit specified by the argument.
     * 
     * @param t
     *            unit of elapsed time
     * @return current elapsed time measured by this MyTimer if this.start() has
     *         already been called, in that order; returns current system time
     *         otherwise
     */
    public double getCurrentTime(TimeUnit t) {
        return (System.nanoTime() - this.startTime) / t.value();

    }
}