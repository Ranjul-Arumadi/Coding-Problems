/*create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.
*/



class Main{
  public static void main(String[] args) {
    Footwear fw[] = new Footwear[4];

    fw[0] = new Footwear(1, "A", "Wet", 1000);
    fw[1] = new Footwear(2, "A", "Wet", 100);
    fw[2] = new Footwear(3, "C", "Wet", 3000);
    fw[3] = new Footwear(4, "D", "Dry", 2000);

    int countByType = getCountByType(fw, "wet");
    Footwear ans[] = getSecondHighestPriceByBrand(fw, "A");

    System.out.println("getCountByType: "+ countByType);

    if(ans!=null){
      System.out.println("getSecondHighestPriceByBrand: "+ans[0].getPrice());
    }
    else{
      System.out.println("Brand not available");
    }
  }

  static int getCountByType(Footwear[] f , String type){
    int count=0;
    for(Footwear ff : f){
      if(ff.getFootwearType().equalsIgnoreCase(type)){
        count++;
      }
    }

    return count;
  }

  static Footwear[] getSecondHighestPriceByBrand(Footwear[] f, String name){

    int max= Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    int flag=1;
    int flag1=1;

    //find max
    for(Footwear ff:f){
      if(ff.getFootwearName().equalsIgnoreCase(name)){
        max = Math.max(max, ff.getPrice());
        flag=0;
      }
    }
    if(flag==1){
      return null;
    }
    //find second largest
    for(Footwear ff:f){
      if(ff.getFootwearName().equalsIgnoreCase(name) && ff.getPrice()!=max){
        flag1=0;
        secondMax = Math.max(secondMax, ff.getPrice());
      }
    }
    if(flag1==1){
      return null;
    }
    
    Footwear ff[] = new Footwear[1];
    for(Footwear fff:f){
      if(fff.getFootwearName().equalsIgnoreCase(name) && fff.getPrice()==secondMax){
        ff[0] = fff;
        break;
      }
    }
    
    return ff;

  }
}

class Footwear{
  int footwearId;
  String footwearName;
  String footwearType;
  int price;

  

  public Footwear(int footwearId, String footwearName, String footwearType, int price) {
    this.footwearId = footwearId;
    this.footwearName = footwearName;
    this.footwearType = footwearType;
    this.price = price;
  }


  public int getFootwearId() {
    return footwearId;
  }
  public void setFootwearId(int footwearId) {
    this.footwearId = footwearId;
  }
  public String getFootwearName() {
    return footwearName;
  }
  public void setFootwearName(String footwearName) {
    this.footwearName = footwearName;
  }
  public String getFootwearType() {
    return footwearType;
  }
  public void setFootwearType(String footwearType) {
    this.footwearType = footwearType;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
}
/* 
create the class footwearProgrammm with the main method.
implement the 2 static methods.getCountByType and
getSecondHighestPriceByBrand in the Solution class.


getCountByType method:
   this method will take two input parameters.
array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the
footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the
array of footwear abjects,then the method should return 0.



getSecondHighestPriceByBrand method:
  this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects


whose brand name matches with the input string parameter.


if no footwear with the given brand is present in the array of the footwear objects,the the method
should return null.

NOTE: no two footwear objects would have the same footwearId.All the searches should be case insensitive.
the above mentioned static methods should be called from the main method.

for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects


if the returned footwear object is not null.else it should print "Brand not available".
for example.
112
ABC
25555
  where 112 is the footwear id,ABC is brand name,25555 is price.

consider the sample input and output.
100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok

Sample output:
3
99
reebok
5666

Sample input2:

100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output:
Footwear not available
Brand not available
*/
