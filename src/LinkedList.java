import java.util.List;

public class LinkedList
{
   Node lead;
   Node CurrentNode;

   public LinkedList(){
       lead = new Node();
   }

   public void append(int newNum)
   {
       if(lead.head == null)
       {
           lead.head = newNum;
       }
       else
       {
           Node currentNode = new Node();
           lead.tail = new Node(newNum);
       }
   }




    class Node
    {
        private Integer head;
        private Node tail;

        public Node()
        {
            head = null;
            tail = null;
        }
        public Node(int newHead)
        {
            head = newHead;
            tail = null;
        }

    }
}




