class BrowserHistory {

    private class Node{
        String data;
        Node next, prev;
        public Node(String data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    Node res;

    public BrowserHistory(String homepage) {
        res = new Node(homepage);
    }
    
    public void visit(String url) {
        Node curr = new Node(url);
        res.next = curr;
        curr.prev = res;
        res = curr;
    }
    
    public String back(int steps) {
        while(res.prev != null && steps-- > 0){
            res = res.prev;
        }
        return res.data;
    }
    
    public String forward(int steps) {
        while(res.next != null & steps-- > 0){
            res = res.next;
        }
        return res.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */