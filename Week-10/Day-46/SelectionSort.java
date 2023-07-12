class Selection
  {
    public static void selectionSort(int ar[])
    {
    for(i=0;i<n-1;i++)
      {
        int value=i;
        for(int j=i+i;j<n-1;j++)
          {
            if(ar[j]<ar[value])
            {
              value=j;
            }
          }
      }
    }
  }