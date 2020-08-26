package Weektest192;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> arr = new ArrayList<String>();
    private int i;

    public BrowserHistory(String homepage) {
        //List<String> arr = new ArrayList<String>();
        i = 0;
        arr.add(homepage);
    }

    public void visit(String url) {
        if(arr.size() == i + 1)
        {
            arr.add(url);
            i++;
        }
        else
        {
            arr.set(++i,url);
            if(arr.size() > i + 1)
                if(arr.get(i + 1) != null)
                    arr.set(i+1,"0");
        }
    }

    public String back(int steps) {
        if(i - steps >= 0)
            i = i - steps;
        else
            i = 0;
        return arr.get(i);
    }

    public String forward(int steps) {
        if(arr.size() < steps + i - 1){
            return arr.get(arr.size() - 1);
        }
        if(arr.size() > i + 1)
            if(arr.get(i + 1) == "0")
                return arr.get(i);
        else if(arr.get(i + steps) != "0")
        {
            i = i + steps;
            return arr.get(i);
        }

        return arr.get(i);
    }
}
