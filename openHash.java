  public class openHash {
    private class entry {
      String key;
      String value;
      bolean deleted;
    }

       Entry(String k, String v) {
         key =k;
         value =v;
         deleted=false;
       }
    }
 private Entry[] table;
    private int m;
    private int size;

    private int hash(String key) {
    int h = key.hashCode();
    h = Math.abs(h);
    return (h % m) + 1;  // indices [1..m]
}
    private int hash(String key) {
    int h = key.hashCode();
    h = Math.abs(h);
    return (h % m) + 1;  // indices [1..m]
}
     public void insert (String key, String value){
        if (isFull()) return;

        int i= hash(key);
       while (table[i] != null && !table[i].deleted{
         if (table[i].key.equals(key)){
           table[i].value= value;
           return;
         }
         i = (i % m) +1;
       }
       table[i] = new Entry(key, value);
       size++;
     }

    

   





