package Board;
import Rooms.Room;
 
public class Board {
    private Room [][] location;
    public Board(Room [][] location)
    {
        this.location = location;
    }
    public Board (int n)
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
