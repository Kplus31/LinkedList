public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Duyet tung phan tu
    public void traverse() {
        Node<T> temp = head;
        while(temp!=null){
            // In phan tu
            System.out.println(temp.getData());
            // Chuyen den phan tu tiep theo
            temp = temp.getNext();
        }
    }
    // Them node vao dau danh sach
    public void addFirst(T item) {
        // B1
        // Node<T> newNode = new Node<>(item, head);
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);
        // B2
        this.head = newNode;
    }
    // Them node vao cuoi danh sach
    public void addLast(T item) {
        if(head==null){
            addFirst(item);
        }
        else {
            // B1
            Node<T> newNode = new Node<>(item, null);
            // B2
            Node<T> temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // Them vao phia sau mot node
    public void insertAfter(T key, T toInsert) {

        // B2: Tim vi tri cua key
        Node<T> temp = head;
        // Tim node chua key
        while(temp!=null && !temp.getData().equals(key)) {
            temp = temp.getNext();
        } 
        // Tim ra duoc node chua key hoac la di den cuoi ll

        // Them vao khi temp khac null
        if(temp!=null){
            // // B1
            // Node<T> newNode = new Node<>();
            // newNode.setData(toInsert);
            // // 2
            // newNode.setNext(temp.getNext());

            // 1 + 2
            Node<T> newNode = new Node<>(toInsert, temp.getNext());
            // 3
            temp.setNext(newNode);
        }
    }

    // Xoa mot node
    public boolean remove(T key) {
        if(head==null)
        return false;

        // Xoa neu key o vi tri dau tien
        if(head.getData().equals(key)){
            this.head = head.getNext();
            return true;
        }

        // Tao bien tam
        Node<T> prev = null;
        Node<T> cur = head;

        while(cur!=null && !cur.getData().equals(key)){
            prev = cur;
            cur = cur.getNext();
        }    

        if(cur==null)
            return false;
        // Xoa node
        prev.setNext(cur.getNext());
            return true;
    }

    public boolean isEmpty(){
        // if(head==null)
        //     return true;
        // else
        //     return false;
        return head==null;
    }

    public int size(){
        int count = 0;

        Node<T> temp = head;
        while(temp!=null){
            // Tang gia tri
            count++;
            // Chuyen den phan tu tiep theo
            temp = temp.getNext();
        }
        return count;
    }
}
