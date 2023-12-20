public class MergeTwoSortedLists {
    
    // Node class definition
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Main method is empty for demonstration purposes
    }

    // Merge method to merge two sorted linked lists
    Node merge(Node h1, Node h2) {
        Node ans = null; // Resultant merged list
        Node t = null;   // Temporary pointer for traversing the merged list

        // Compare the first nodes of both lists to determine the starting point of the merged list
        if (h1.data < h2.data) {
            ans = h1;
            t = h1;
            h1 = h1.next;
        } else {
            ans = h2;
            t = h2;
            h2 = h2.next;
        }

        // Traverse both lists and merge them in sorted order
        while (h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                t.next = h1; // Connect the smaller node to the merged list
                t = t.next;  // Move the temporary pointer to the last node in the merged list
                h1 = h1.next; // Move to the next node in the first list
            } else {
                t.next = h2; // Connect the smaller node to the merged list
                t = t.next;  // Move the temporary pointer to the last node in the merged list
                h2 = h2.next; // Move to the next node in the second list
            }
        }

        // If any of the lists has remaining nodes, connect them to the merged list
        if (h1 != null) {
            t.next = h1;
        }
        if (h2 != null) {
            t.next = h2;
        }

        return ans; // Return the head of the merged list
    }
}
