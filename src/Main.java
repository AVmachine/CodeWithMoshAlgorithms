

public class Main {
    public static void main(String[] args) {
        Array arr =  new Array(3);
        arr.insert(5);
        arr.insert(4);
        arr.insert(3);
        arr.insert(2);
        arr.insert(100);
//        arr.printArray();
//        arr.removeAt(2);
//        arr.printArray();
//        System.out.println(arr.max());


        int[] existingArr = new int[]{1,2,3,1,2,3};

        int[] intersect = arr.intersect(existingArr);

//        for(int i : intersect)
//        {
//            System.out.print(i + ", ");
//        }

        arr.reverse();
        arr.printArray();
        arr.insertAt(350, 2);
        arr.printArray();
        arr.insertAt(600, 0);
        arr.printArray();
    }
}
