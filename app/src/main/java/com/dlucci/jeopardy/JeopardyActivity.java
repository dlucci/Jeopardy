package com.dlucci.jeopardy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class JeopardyActivity extends Activity implements OnClickListener{

    @InjectView(R.id.plus200) Button plus200;
    @InjectView(R.id.minus200) Button minus200;
    @InjectView(R.id.plus400) Button plus400;
    @InjectView(R.id.minus400) Button minus400;
    @InjectView(R.id.plus600) Button plus600;
    @InjectView(R.id.minus600) Button minus600;
    @InjectView(R.id.plus800) Button plus800;
    @InjectView(R.id.minus800) Button minus800;
    @InjectView(R.id.plus1000) Button plus1000;
    @InjectView(R.id.minus1000) Button minus1000;
    @InjectView(R.id.plus1200) Button plus1200;
    @InjectView(R.id.minus1200) Button minus1200;
    @InjectView(R.id.plus1600) Button plus1600;
    @InjectView(R.id.minus1600) Button minus1600;
    @InjectView(R.id.plus2000) Button plus2000;
    @InjectView(R.id.minus2000) Button minus2000;

    @InjectView(R.id.score) TextView score;

    private int money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeopardy);
        ButterKnife.inject(this);

        plus200.setOnClickListener(this);
        minus200.setOnClickListener(this);
        plus400.setOnClickListener(this);
        minus400.setOnClickListener(this);
        plus600.setOnClickListener(this);
        minus600.setOnClickListener(this);
        plus800.setOnClickListener(this);
        minus800.setOnClickListener(this);
        plus1000.setOnClickListener(this);
        minus1000.setOnClickListener(this);
        plus1200.setOnClickListener(this);
        minus1200.setOnClickListener(this);
        plus1600.setOnClickListener(this);
        minus1600.setOnClickListener(this);
        plus2000.setOnClickListener(this);
        minus2000.setOnClickListener(this);

        money = Integer.parseInt(score.getText().toString());
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == plus200.getId()){
            money+=200;
            score.setText(new Integer(money));
        }/* else if(id == minus200.getId()){
            money-=200;
            score.setText(new Integer(money));
        } else if(id == plus400.getId()){

        } else if(id == minus400.getId()){

        } else if(id == plus600.getId()){

        } else if(id == minus600.getId()){

        } else if(id == plus800.getId()){

        } else if(id == minus800.getId()){

        } else if(id == plus1000.getId()){

        } else if(id == minus1000.getId()){

        } else if(id == plus1200.getId()){

        } else if(id == minus1200.getId()){

        } else if(id == plus1600.getId()){

        } else if(id == minus1600.getId()){

        } else if(id == plus2000.getId()) {

        } else if(id == minus2000.getId()){

        }*/
    }
}
