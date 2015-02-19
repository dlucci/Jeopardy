package com.dlucci.jeopardy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.InjectViews;
import butterknife.OnClick;


public class JeopardyActivity extends Activity{

    @InjectViews({R.id.plus200, R.id.minus200, R.id.plus400, R.id.minus400, R.id.plus600,
            R.id.minus600, R.id.plus800, R.id.minus800, R.id.plus1000,R.id.minus1000,
            R.id.plus1200, R.id.minus1200, R.id.plus1600, R.id.minus1600, R.id.plus2000,
            R.id.minus2000})
    List<Button> buttonList;

    @InjectView(R.id.score) TextView score;

    private static int money;

    private String filteredMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeopardy);
        ButterKnife.inject(this);

        filteredMoney = score.getText().toString().substring(1);

        money = Integer.parseInt(filteredMoney);
    }

    @OnClick({R.id.plus200, R.id.minus200, R.id.plus400, R.id.minus400, R.id.plus600,
            R.id.minus600, R.id.plus800, R.id.minus800, R.id.plus1000,R.id.minus1000,
            R.id.plus1200, R.id.minus1200, R.id.plus1600, R.id.minus1600, R.id.plus2000,
            R.id.minus2000})
    public void clicked(Button b){
        int value = new Integer((String) b.getText()).intValue();
        money+=value;
        score.setText("$" + new Integer(money).toString());
    }
}