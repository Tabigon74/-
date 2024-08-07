import java.util.Random;

/**
 * @author 田平和彦
 * @reviewer 髙橋直樹
 * 
 * 奈良にいるカブトムシ特有の関数を保持するクラス
 */
public class Trypoxylusdichotomus extends Insect{
    //カブトムシ(奈良)
    
    /**
     * 捕獲に掛かる日数を1日に設定するコンストラクタ
     */
   Trypoxylusdichotomus(){
    this.Traveltime = 1;
   }
   
   /**
    * カブトムシを捕獲するメソッド
    */
   public void capture(){
    Random rand = new Random();
    this.rate = (int)(Math.random()*100);
    this.size = rand.nextInt(60)+30;
    System.out.println(this.Traveltime+"日掛けて"+this.size + "mmのカブトムシをゲットした!");
   }
}
