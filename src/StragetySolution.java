public abstract class StragetySolution implements Strategy{
    public void solve(){
        start();
        while (nextTry() && !isSolution()){}
        stop();
    }
    abstract void start();
    abstract boolean nextTry();
    abstract boolean isSolution();
    abstract void stop();
}
