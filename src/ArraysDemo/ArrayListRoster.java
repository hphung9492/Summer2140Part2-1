package ArraysDemo;

import java.util.ArrayList;

public class ArrayListRoster {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Thomas");
        name.add("Raven");
        name.add("Brian");
        StringBuilder roster = new StringBuilder("Roster: ");
        int prefixLength = "Roster: ".length();

        for(int i = 0; i < name.size(); i++)
        {
            if(roster.length() > prefixLength)
            {   roster.append(", "); }
            roster.append(name.get(i));
        }

        System.out.println(roster);

    }
}
