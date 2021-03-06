package com.company;


public class Queue{
     Node head;
     Node tail;


    /**
     * This is the constructor
     * it should take the first element in the queue
     *
     * @param  $element
     */

    public Queue(Node  $element) {
        //Q1: assign $element to the head
        head = element; 
        //Q2: assign $element to the tail
        tail = element;
    }

    /**
     * Add new element to the queue
     *
     * @param $element
     * @return
     */

    public Queue add(Node $element) {
        //Q3: assign $element to the attribute next in tail object
         tatil.next = element;

        //Q4: assign $element to the tail object
         tail = element;

        return this;
    }

    public void print() {
        //Q5: if the head is not null ( which means the queue is not empty )
        if (tail != null) {
            //Q6: Create an object of Node named $iteration and assign this.head to it
               Node $iteration = this.head; 
            //Q7: While the next attribute in $iteration is not null
            while ($iteration.next != null) {
                //Q8: print with line the attribute value in $iteration
                   System.out.println($iteration.value);
                //Q9: assign the attribute next in $iteration to $iteration
                     $iteration = $iteration.next;
            }
            //print at least the first node if the queue size is 1
            System.out.println($iteration.value);
        } else { // else if the head is null (which means the queue is empty)
            //show empty message
            System.out.println("The queue is empty");
        }
    }

    public void pop() {
        //Q8: Create object of Node named $head and assign this.head to it
            Node $head = this.head;
        //Q9: Assign to this.head the attribute next in $head (so you can move head forward)
              $head.next = this.head
        //print the head value
        System.out.format("%n#######################%n");
        System.out.format("[\tQueue was popped (%s)\t]", $head.value);
        System.out.format("%n#######################%n");
    }

    public int size() {
        //Q10: Create and initialize with 0 an integer variable named $size
          int $size = 0;
        //Q11:if the head is not null
        if (head != null) {
            //Q12: change the $size to be 1
               $size = 1;
            //Q13: Create object of Node named $iteration and assign this.head to it
                 Node $iteration= this.head;
            //Q14: While the next attribute in $iteration is not null
            while ($iteration.next != null) {
                //Q15: increase the $size by 1
                     ++$size;
                //Q16: assign the attribute next in $iteration to $iteration
                      $iteration = $iteration.next;  
            }
        }
        //Q17: return $size
           return $size; 
           
    }
