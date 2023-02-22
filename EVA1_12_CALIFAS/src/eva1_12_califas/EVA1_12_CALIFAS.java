/*
Calificación en estilo EEUU
91--> 100 A
81--> 90 B
71--> 80 C
menor a 70 --> D
 */
package eva1_12_califas;



public class EVA1_12_CALIFAS {

 
    public static void main(String[] args) {
    String cal;
    cal = calif(85);
        System.out.println("Calificación para 85: "+cal);
        System.out.println("Calificación para 70: "+calif(70));
    calif(100); //ignoró el resultado
    }
    
   public static String calif (int prom){
       String R="";
     if (prom>=91 && prom<=100){ 
      R= "A";
     } else if (prom>=81 && prom <=90){
      R= "B";
     } else if (prom>=71 && prom<=80){ 
      R= "C";
     } else if (prom<=70){
     R= "D";
     } else if(prom<0 && prom>100){
     R= "Error.";     
     }
   return R;
   } 
}
