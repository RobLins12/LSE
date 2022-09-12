package br.unicap.ed1.atividade03;

public class SinglyListNode {
    private SinglyListNode next;
    private Integer value;

    public SinglyListNode(Integer value ,SinglyListNode next){
        this.next = next;
        this.value = value;
    }
    
    public SinglyListNode getNext() {
        return next;
    }
    public Integer getValue() {
        return value;
    }
    
    public void setValue(Integer value) {
        this.value = value;
    }
    
    public void setNext(SinglyListNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof SinglyListNode){
            SinglyListNode other = (SinglyListNode) obj;
            if (this.value.equals(other.value)){
                return true;
            }
       }   
       return false; 
    } 
}
