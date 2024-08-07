import java.util.Random;

/**
 * @author 田平和彦
 * @reviewer 髙橋直樹
 * 
 * 虫取り少年に関する関数を保持するクラス
 */
public class Person {
    
    protected int asset = 1000;
    protected int day = 0;
    /**
     * 虫取り少年が何を捕りに行くか、何年で億万長者になったのかを表示する関数
     */
    public void perform(){
        while (!(asset >= 100000000)) {
            Random rand = new Random();
            Insect[] insects = {new DamasterGehinii(),new LyristesEsakii(), new Trypoxylusdichotomus()};
            int num = rand.nextInt(3);
            insects[num].capture();
            insects[num].sell();
            asset+=insects[num].getValue();
            day+=insects[num].Traveltime;
            System.out.println("現在の総資産:"+asset);
        }

        System.out.println("虫取り小僧は"+DurationCalc.durationYear(day)+"年と"+(DurationCalc.durationMonth(day)+1)+"ヶ月目で億万長者になりました!");
        System.out.println("やったね!");
    }
    
}
