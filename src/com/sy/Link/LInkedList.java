package com.sy.Link;

public class LInkedList<E> {
    private  class Node{
        public  E e;
        public Node next;
        public  Node(E e,Node next){
            this.e=e;    //用户的e传给节点
            this.next=next;
        }

        public Node (E e) {
            this(e,null);
        }
        public  Node (Node next){
            this(null,null);
        }
        @Override
        public String toString(){
            return e.toString();
        }
    }
    private  Node dummyHead;
    private int size;

    public void LinkedList(){
        dummyHead=new Node(null,null);
        size=0;
    }
    //获取链表中元素个数
    public  int  getSize(){
        return  size;
    }
    //返回链表是否为空
    public  boolean isEmpty(){
        return  size==0;
    }
    //在链表头添加一个新元素

    //在链表index（0-based  ）位置添加新的元素e
    //在链表中不常用
    public  void  add(int index,E e){
        if (index < 0|| index > size)
            throw new IllegalArgumentException("Add failed.ILLegal index.");
//        if (index==0)
//            addFirst(e);
//        else{
            Node prev =dummyHead;
            for (int i=0;i<index;i++ )
                prev=prev.next;
//                Node node=new Node(e);
//                node.next=prev.next;
//                prev.next=node;
            prev.next=new Node(e,prev.next);
                size++;

//        }
    }
    //在链表末尾添加元素
    public void addLast(E e){
       add(size,e);
    }
    public  void  addFirst(E e){
//        Node node=new Node(e);
//        node.next=head;
//        head=node;
//        head=new Node(e,head);
        add(0,e);
        size++;
    }
    //在链表index（0-based  ）位置添加新的元素e
    //在链表中不常用

    public  E get(int index){
        if (index < 0|| index > size)
            throw new IllegalArgumentException("Get failed.ILLegal index.");
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++)
            cur=cur.next;
        return  cur.e;

    }
    public  E getFirst(){
        return  get(0);
    }
    public  E getList(){
        return  get(size-1);
    }
}
