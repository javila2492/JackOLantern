public class JackOLantern
{
    String[][] faceFeatures;
    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public String toString()
    {
        String a = "";
        for(int i = 0; i < this.faceFeatures.length; i++)
        {
            a = "";
            for(int j = 0; j < this.faceFeatures[i].length; j++)
            {
                a += this.faceFeatures[i][j];
            }
            System.out.println(a);
        }
        return null;
    }

    public void edit(String replace, int row, int column)
    {
        this.faceFeatures[row][column] = replace;
    }

    public void fill(String str)
    {
        for(int i = 0; i < this.faceFeatures.length; i++)
        {
            for(int j = 0; j < this.faceFeatures[i].length; j++)
            {
                this.faceFeatures[i][j] = str;
            }
        }
    }
}



