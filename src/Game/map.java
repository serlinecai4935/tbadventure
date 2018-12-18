package Game;
import Rooms.Room;

public class map {
    private Room [][] location;
    public map (Room [][] location)
    {
        this.location = location;
    }
    public map (int n)
    {
        this.location=new Room [n][n];
    }
    public int getRows()
    {
        return location.length;
    }
    public int getColumns()
    {
        return location [0].length;
    }

    public void print()
    {
        String row = "";
        for (int i=0; i<location.length; i++)
        {
            row= "";
            for (int j = 0; j<location[i].length; j++)
            {
                row += location [i][j].toString();
            }
            System.out.println(row);
        }
    }
}
