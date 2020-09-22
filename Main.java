public class Main {
     public static void main(String[] args) {
    AlmondMilk milk = new AlmondMilk();
    Oranges oranges = new Oranges();

    //Obj on the same hierarchal lvl
    Box<AlmondMilk> boxForMilk = new Box<>();
    Box<Oranges>  boxForOranges = new Box<>();

    debugAdd(milk, boxForMilk);
    debugAdd(oranges, boxForOranges);

    boxForMilk.remove().drink();
    boxForOranges.remove().juggle();

    }
    static <T> void debugAdd(T item, Box<T> box){
        System.out.println("Type: " + item.getClass().getSimpleName());
        box.add(item);
    }
}
