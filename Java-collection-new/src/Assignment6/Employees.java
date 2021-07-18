package Assignment6;

import java.util.ArrayList;

public class Employees {

    public String findName(ArrayList<String>employe,String name)
    {
        String result="";
        if(employe.contains(name))
        {
            result="FOUND";
        }
        else
        {
            result="NOT FOUND";
        }
        return result;

    }

}
