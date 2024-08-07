/**
 * @author 田平和彦
 * @reviewer 髙橋直樹
 * 
 * 共通している虫に対する関数を持つクラス
 * 
 */
public abstract class Insect {
   int Traveltime = 0;
   int rate = 0;
   int size = 0;
   /**
    * 虫を売る際のメソッド
    */
   public void sell(){
    System.out.println("今回の平均単価は"+this.rate +"でした。");
    System.out.println("売却額:"+this.getValue());
   }
   
   /**
    * 虫の販売額を返すメソッド
    * @return 現在の販売額
    */
   public int getValue(){
    return this.rate*this.size;
   }
   
   /**
    * 虫を捕獲し、捕まえた虫の平均価格とサイズを確定させるメソッド
    */
   public abstract void capture();

}
