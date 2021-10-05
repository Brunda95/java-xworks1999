class SuperMarket{
static String biscuits[]={"parleG","Hide and Seek","good day"};
static String deos[]={"yardlee","Axe","godFateher"};
static String clothes[]={"cotton","synthetic","nylon"};
static String choclates[]={"dairymilk","perk","munch"};
static String vegitables[]={"carrot","beetrot","brinjal"};
public static void main(String a[]){
getBiscuits(biscuits);
getDoes(deos);
System.out.println(deos);
getClothes(clothes);
getChoclates(choclates);
getVegitables(vegitables);
}
public static void getBiscuits(String[] biscuits){
System.out.println("inside getbiscuits method with string array parameters");
for(int i=0;i<biscuits.length;i++){
System.out.println(biscuits[i]);
}
}
public static void getDoes(String[] does){
System.out.println("collection of deos in single row") ;
for(int i=0;i<deos.length;i++){
System.out.println(deos[i]);
}
}
public static void getClothes(String[] Clothes){
System.out.println("All Material of clothes are provied") ;
for(int i=0;i<clothes.length;i++){
System.out.println(clothes[i]);
}
}
public static void getChoclates(String[] choclates){
System.out.println("Tasty choclates") ;
for(int i=0;i<choclates.length;i++){
System.out.println(choclates[i]);
}
}
public static void getVegitables(String[] vegitables){
System.out.println("healthy vegitables");
for(int i=0;i<vegitables.length;i++){
System.out.println(vegitables[i]);
}
}
}

