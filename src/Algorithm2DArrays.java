public class Algorithm2DArrays
{
    public static boolean isFound(int[][] arr, int target)
    {
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static int countElementsWithSubstring(String[][] arr, String searchStr)
    {
        int sum=0;
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j].contains(searchStr))
                {
                    sum++;
                }
            }
        }
        return sum;
    }
    public static int replaceEvensWithZero(int[][] arr)
    {
        int sum=0;
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if((arr[i][j])%2==0)
                {
                    arr[i][j]=0;
                    sum++;
                }
            }
        }
        return sum;
    }
    public static int sumForRow(int[][] arr, int row)
    {
        int sum=0;
        for(int x=0; x<arr[row].length; x++)
        {
            sum+=arr[row][x];
        }
        return sum;
    }
    public static int sumForColumn(int[][] arr, int col)
    {
        int sum=0;
        for(int x=0; x<arr.length; x++)
        {
            sum+=arr[x][col];
        }
        return sum;
    }

}
