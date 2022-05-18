public class Facorial {

    public int fact(int num){
      if(num <=2){
          return  num;
      }else{
          return  num * fact(num -1);
      }
    }
}
