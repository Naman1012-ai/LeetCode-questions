class BrowserHistory {
    private List<String> track;
    private int curr;
    private int max;

    public BrowserHistory(String homepage) {
        track = new ArrayList<>();
        track.add(homepage);
        curr = 0;
        max = 0;
    }
    
    public void visit(String url) {
        curr++;

        if(curr < track.size())
            track.set(curr, url);
        else
            track.add(url);
        
        max = curr;
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return track.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(max, curr + steps);
        return track.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */