  public class chainedHash{
       private class node{
         String key;
         String value;
         Node next;

         Node (String k, Sring v) {
           key = k;
           value =v;
         }
       }
    
    private Node[] table;
    private int m;
    private int hash(String key){
    int h = Math.abs(key.hashCode());
      return ( h% m) +1;
    
    }
    public void insert ( String key, String value){
      int i= hash (key);

  node head + table[i];

  if (head == null){
    table[i] = new node ( key,value);
    return;
  }

  Node current = head;
  Node prev = null;

    

    prev.next = new Node(key, value);
}
    while ( current != null){
    if ( current.key.equal(key)){
      current.value = value;
      return;
    }
    prev = current:
      current = current.next;
  }



















    






























  






















  

  
