package br.unicap.ed1.atividade03;

public class SinglyLinkedList {
    private SinglyListNode head;

    public SinglyListNode getHead() {
        return head;
    }

    public void setHead(SinglyListNode head) {
        this.head = head;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }

    public void addFirst(Integer value){
        SinglyListNode newhead = new SinglyListNode(value ,this.getHead());
        this.setHead(newhead);
    }

    public SinglyListNode search(Integer value){
        SinglyListNode currenttail = this.head;
        while (currenttail != null) {
            if (currenttail.getValue().equals(value)) {
                return currenttail;
            }
            currenttail = currenttail.getNext();
        }
        return null;
    }

    public int size(){
        SinglyListNode currentNode = this.head;
        int size = 0;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        return size;
    }

    public boolean isOrdered(boolean ascending) {
        if (isEmpty()) {
            return true;
        }
        SinglyListNode node = this.getHead();
        while (node.getNext() != null){
            if (ascending) {
                if (node.getValue() > node.getNext().getValue()) {
                    return false;
                }
            }
            if (!ascending) {
                if (node.getValue() < node.getNext().getValue()) {
                    return false;
                }
            }
            node = node.getNext();
        }
        return true;
    }        

    public void addLast(Integer value){
        if (isEmpty()) {
            addFirst(value);
        } else {
            SinglyListNode newtail = new SinglyListNode(value ,null);
            SinglyListNode currenttail = this.head;
            while (currenttail.getNext() != null) {
                currenttail = currenttail.getNext();
            }
            currenttail.setNext(newtail);
        }
    }

    public void reverse(){
        SinglyListNode previous = null;  
        SinglyListNode current = this.head;  
        SinglyListNode next = null;  
        while (current != null)  {  
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }   
        this.head = previous;
    }

    public void delete(SinglyListNode node){
        if (isEmpty()) {
            return;
        } if (this.head == node) {
            this.head = this.head.getNext();
        }else {
            SinglyListNode previousNode = this.head;
            while (previousNode.getNext() != node) {
                    previousNode = previousNode.getNext(); 
                }
                previousNode.setNext(node.getNext());
            }
        }
    }
