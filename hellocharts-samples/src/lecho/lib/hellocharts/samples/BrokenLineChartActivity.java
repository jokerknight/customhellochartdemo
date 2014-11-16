package lecho.lib.hellocharts.samples;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import lecho.lib.hellocharts.util.Utils;


public class BrokenLineChartActivity extends Activity {
    RelativeLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.train_result);
        List<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();//线性图  范围0-100
//        for (int i = 0; i < 48; i++) {
//            if (i < 8 || i == 28 || i == 12 || i == 18 || i == 20 || i == 30
//                    || i == 34) {
//                lists.add(0);
//            } else {
////				int item=getRandom(0, 100);
////				Log.w(""+i, ""+item);
//                lists.add(getRandom(0, 100));
//            }
//        }
        List<Integer> checkShrinks = new ArrayList<Integer>();
        checkShrinks.add(15);
        checkShrinks.add(25);
        checkShrinks.add(26);
        checkShrinks.add(29);
        checkShrinks.add(21);
        checkShrinks.add(18);
        checkShrinks.add(22);

        List<Integer> checkDiastole = new ArrayList<Integer>();
        checkDiastole.add(44);
        checkDiastole.add(48);
        checkDiastole.add(52);
        checkDiastole.add(43);
        checkDiastole.add(40);
        checkDiastole.add(55);
        checkDiastole.add(44);

        List<Integer> checkHeartRate = new ArrayList<Integer>();
        checkHeartRate.add(65);
        checkHeartRate.add(68);
        checkHeartRate.add(70);
        checkHeartRate.add(66);
        checkHeartRate.add(68);
        checkHeartRate.add(70);
        checkHeartRate.add(71);

        linear= (RelativeLayout) findViewById(R.id.linear);
        linear.addView(new BrokenLineView(this,checkShrinks, Utils.COLOR_BLUE));
        linear.addView(new BrokenLineView(this,checkDiastole,Utils.COLOR_ORANGE));
        linear.addView(new BrokenLineView(this,checkHeartRate,Utils.COLOR_GREEN));
    }

    public int getRandom(int min,int max){
        return (int) Math.round(Math.random()*(max-min)+min);
    }
}