package amazon;


public class MergeSortedLinkedLists {
    public static void main(String[] args) {

        LinkedListNode a = new LinkedListNode(1);
        LinkedListNode b = new LinkedListNode(2);
        LinkedListNode tail = new LinkedListNode(3);
        a.previous = null;
        a.next = b;
        b.previous = a;
        b.next = tail;
        tail.previous = b;
        tail.next = null;
        LinkedListNode c = new LinkedListNode(1);
        LinkedListNode d = new LinkedListNode(3);
        LinkedListNode tail2 = new LinkedListNode(4);
        c.previous = null;
        c.next = d;
        d.previous = c;
        d.next = tail2;
        tail2.previous = d;
        tail2.next = null;


        LinkedListNode f = mergeLists(c,null);
        while (f != null){
            System.out.print(f.data+", ");
            f = f.next;
        }

    }

    public static LinkedListNode mergeLists(LinkedListNode head1, LinkedListNode head2){

        if (head1 == null){
            return head2;
        }
       else if (head2 == null){
            return head1;
        }

        LinkedListNode mergedHead;

        if (head1.data <= head2.data){
            mergedHead = head1;
            head1 = head1.next;
        } else{
            mergedHead = head2;
            head2 = head2.next;
        }

        LinkedListNode mergedTail = mergedHead;

        while (head1 != null && head2 != null){
            LinkedListNode temp;
            if (head1.data <= head2.data){
                temp = head1;
                head1 = head1.next;
            } else {
                temp = head2;
                head2 = head2.next;
            }

            mergedTail.next = temp;
            mergedTail = temp;
        }

        if (head1 != null){
            mergedTail.next = head1;
        } else if (head2 != null){
            mergedTail.next = head2;
        }

        return mergedHead;
    }

    static class LinkedListNode{
        LinkedListNode next;
        LinkedListNode previous;
        int data;

        LinkedListNode(int data){
            this.data = data;
        }

    }
}
