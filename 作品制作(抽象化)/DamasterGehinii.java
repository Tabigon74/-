import java.util.Random;

/**
 * @author 田平和彦
 * @reviewer 髙橋直樹
 * 
 * 北海道にいるオオルリオサムシ特有の関数を保持するクラス
 */
public class DamasterGehinii extends Insect{
    //オオルリオサムシ(北海道)
    
    /**
     * 捕獲に掛かる日数を5日に設定するコンストラクタ
     */
   DamasterGehinii(){
    this.Traveltime = 5;
   }
   /**
    * オオルリオサムシを捕獲する関数。
    */
   public void capture(){
    Random rand = new Random();
    this.rate = (int)(Math.random()*100)*10;
    this.size = rand.nextInt(30)+30;
    System.out.println(this.Traveltime+"日掛けて"+this.size + "mmのオオルリオサムシをゲットした!");
   }
}
