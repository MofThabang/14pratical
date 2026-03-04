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





















  

  
