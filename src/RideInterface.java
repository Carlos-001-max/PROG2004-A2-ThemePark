/**
 * Interface defining ride operations
 * Implemented by Ride class
 */
public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();
    void addVisitorToHistory(Visitor visitor);
    void checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
    void runOneCycle();
}