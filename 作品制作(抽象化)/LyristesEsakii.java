import java.util.Random;

/**
 * @author 田平和彦
 * @reviewer 髙橋直樹
 * 
 * 九州にいるヤクシマエゾゼミ特有の関数を保持するクラス
 */
public class LyristesEsakii extends Insect{

    /**
     * 捕獲に掛かる日数を3日に設定するコンストラクタ
     */
   LyristesEsakii(){
    this.Traveltime = 3;
   }
   
   /**
    * ヤクシマエゾゼミを捕獲するメソッド
    */
   public void capture(){
    Random rand = new Random();
    this.rate = (int)(Math.random()*100)*10;
    this.size = rand.nextInt(10)+30;
    System.out.println(this.Traveltime+"日掛けて"+this.size + "mmのヤクシマエゾゼミをゲットした!");
   }
}
