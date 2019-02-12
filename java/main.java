package superpi;
/**
 * @author DDMP6
 */
public class SuperPI {
    public static void main(String[] args) {
       long t0 = System.currentTimeMillis(); //t0 - čas při započetí výpočtu
       pocetPi(10000000);//nastavení počtu iterací ovlivňuje přesnost výsledku
       long t1 = System.currentTimeMillis();//t1 - čas po dokončení výpočtu
       long cas =  t1-t0; //cas - celkový čas trvání výpočtu
      
      //dále přepočet na minuty a sekundy
       int min = (int)cas/60000;
       int sec = (int)cas%60000/1000;
       int milis = (int)cas%1000;
      
       System.out.println("Výpočet trval " + min + "m " + sec + "," + milis + "s" );
    }
  //výpočet Pi s průběžným výpisem aproximace, součet nekonečné Leibnizovi řady
     public static double pocetPi(int x){
         double out=0;
         for (int i =0;i<x;i++){
             out=out + (plusminus(i)/(2*i+1));
             System.out.println(4*out);
         }
         return 4*out;
     }
  //generování +1 a -1 v závislosti na sudém nebo lichém vstupu
     public static double plusminus(int x){
         if (x%2>0){
            return -1;
         }
         else{
            return 1; 
         }
     }
}
