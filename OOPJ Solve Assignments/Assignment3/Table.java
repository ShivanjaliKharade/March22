class Table {

public static void main(String[] args) {

    int[][] arr = new int[30][10];

    arr = Table(30,10);


    for (int i = 0; i < arr.length ; i++)
    {
        for (int j = 0; j < arr[i].length; j++)
        {
            System.out.printf("   "+arr[i][j]);
        }
        System.out.println();

    }
}

public static int[][] Table(int k, int l)
{
    int [][] arr = new int[k][l];
    for (int i = 0; i < arr.length ; i++)
    {
        for (int j = 0; j < arr[i].length; j++)
        {
            arr[i][j] = (i+1)*(j+1);
        }

    }
    return arr;
}

}