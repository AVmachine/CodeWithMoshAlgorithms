import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Array {
    //Mosh wants us to make our own dynamic array class as a warm up... Good ole Mosh.
    int[] arr;
    int counter;

    public Array(int size){
        arr = new int[size];
        counter = 0;
    }

    public void insert(int newNum)
    {

        if(counter == arr.length)
        {
            int length = arr.length;
            int[] newArr = new int[length+1];
            newArr[newArr.length-1] = newNum;
            for(int i = 0; i < arr.length; i++)
            {
                newArr[i] = arr[i];
            }

            arr = newArr;
            counter++;
        }
        else
        {
            arr[counter] = newNum;
            counter++;
        }
    }

    public void removeAt(int index)
    {
        if(arr.length == 1)
        {
            arr[0] = 0;
        }
        else
        {
            int[] newArr = new int[arr.length-1];
            int smallCounter = 0;
            for(int x = 0; x< newArr.length; x++)
            {
                if(smallCounter != index)
                {
                    newArr[x] = arr[smallCounter];
                    smallCounter++;
                }
                else{
                    smallCounter++;
                    newArr[x] = arr[smallCounter];
                    smallCounter++;
                }

            }
            arr = newArr;
        }
    }

    public void printArray()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public int indexOf(int value)
    {

            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] == value)
                {
                    return i;
                }
            }
            return -1;
    }

    public int max()
    {
        Integer max = null;
        for(int i : arr)
        {
           if(max == null)
               max = i;
           else if(max < i)
           {
               max = i;
           }
        }
        return max;
    }

    public int[] intersect (int[] existingArr)
    {
        int counter = 0;
        int[] returnArr = new int[existingArr.length];
        for (int i = 0; i < existingArr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == existingArr[i])
                {
                    returnArr[counter] = existingArr[i];
                    counter++;
                }
            }
        }

        return returnArr;
    }

    public void reverse()
    {
        int tempInt;
        int endSide = arr.length-1;
        int startSide = 0;
        while(startSide <= endSide)
        {
            tempInt = arr[startSide];
            arr[startSide] = arr[endSide];
            arr[endSide] = tempInt;
            startSide++;
            endSide--;
        }
    }

    public void insertAt(int newNum, int index)
    {
        int[] newArr = new int[arr.length+1];
        int counterForArr = 0;
        for(int i = 0; i < newArr.length ; i++)
        {
            if(index == i)
            {
                newArr[i] = newNum;
            }
            else{
                newArr[i] = arr[counterForArr];
                counterForArr++;
            }

        }

        arr = newArr;
    }
}


