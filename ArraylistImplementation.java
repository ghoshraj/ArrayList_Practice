package arraylist;

class Arraylistimp{
    private int count = 0;
    private Object arr[] = new Object[10];

    private void increasearraysize(){
        Object temp[] = new Object[arr.length + 3];
        System.arraycopy(arr , 0 , temp, 0 , arr.length);
        arr = temp;
    }
    public int size(){
        return count;
    }
    public void add(Object e){
        if (count >= arr.length)
            increasearraysize();
        arr[count++] = e;
    }
    public void add(Object e, int index){
        if (index >= size() || index <= -1)
            throw new ArrayIndexOutOfBoundsException();
        if (count > arr.length)
            increasearraysize();
        count++;
        for (int i = size() - 1 ; i >= index; i--){
            arr[i + 1] = arr[i];
        }
        arr[index] = e;
    }
    public Object get(int index){
        if (index >= size() || index <= -1)
            throw new ArrayIndexOutOfBoundsException();
        return arr[index];
    }
    public void remove(int index){
        if (index >= size() || index <= -1)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = index + 1; i < size(); i++){
            arr[i - 1] = arr[i];
        }
        arr[count - 1] = null;
        count--;
    }
}
public class ArraylistImplementation {
    public static void main(String[] args) {
        Arraylistimp imp = new Arraylistimp();
        imp.add(10);
        imp.add(20);
        imp.add(30);
        imp.add(40);
        imp.add(50);
        System.out.println(imp.size());
        for (int i = 0; i < imp.size(); i++){
            System.out.println(imp.get(i));
        }
        System.out.println("________________");
        imp.remove(3);
        for (int i = 0; i < imp.size(); i++){
            System.out.println(imp.get(i));
        }
        System.out.println("_____________________");
        imp.add(40,3);
        for (int i = 0; i < imp.size(); i++){
            System.out.println(imp.get(i));
        }
    }
}
