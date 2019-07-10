package com.inks.sokoban;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  private   ArrayList<int[][]> arrayList=new ArrayList<>();
    private  Button up,down,left,right,back,nextup,nextdown;
    private SokobanView sokobanView;
    private Toolbar mToolbar;
    private int     LV=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LV_data lv_data=new LV_data();
        arrayList=lv_data.arrayList;

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("推箱子（第"+LV+"关）");       //设置标题
        mToolbar.setTitleTextColor(Color.parseColor("#ffffff"));    //设置标题颜色
        setSupportActionBar(mToolbar);
        sokobanView= (SokobanView) findViewById(R.id.nnn);
        sokobanView.setPassLitener(passLitener);

        up= (Button) findViewById(R.id.shang);
        down= (Button) findViewById(R.id.xia);
        left= (Button) findViewById(R.id.zuo);
        right= (Button) findViewById(R.id.you);
        back= (Button) findViewById(R.id.back);
        nextup= (Button) findViewById(R.id.shangyi);
        nextdown= (Button) findViewById(R.id.xiayi);

        up.setOnClickListener(cccc);
        down.setOnClickListener(cccc);
        left.setOnClickListener(cccc);
        right.setOnClickListener(cccc);
        back.setOnClickListener(cccc);
        nextup.setOnClickListener(cccc);
        nextdown.setOnClickListener(cccc);

    }

    SokobanView.PassLitener passLitener = new SokobanView.PassLitener() {
        @Override
        public void pass() {
            final AlertDialog.Builder normalDialog =
                    new AlertDialog.Builder(MainActivity.this);
            normalDialog.setTitle("恭喜你");
            normalDialog.setMessage("真厉害，你已通过本关！");
            normalDialog.setPositiveButton("下一关",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if(LV<arrayList.size()){
                                LV=LV+1;
                                sokobanView.setaaa(arrayList.get(LV-1));
                                mToolbar.setTitle("推箱子（第"+LV+"关）");       //设置标题
                            }else{
                                final Snackbar snackbar = Snackbar.make(up, "已是最后一关", Snackbar
                                        .LENGTH_LONG);
                                snackbar.show();
                                snackbar.setAction("确定", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        snackbar.dismiss();
                                    }
                                });
                            }

                        }
                    });
            // 显示
            normalDialog.show();

        }
    };
    View.OnClickListener cccc = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.shang:
                    sokobanView.moveUp();
                    break;
                case R.id.xia:
                    sokobanView.moveDown();
                    break;
                case R.id.zuo:
                    sokobanView.moveLeft();
                    break;
                case R.id.you:
                    sokobanView.moveRight();
                    break;
                case R.id.back:
                    sokobanView.moveBack();
                    break;
                case R.id.shangyi:
                    if(LV>1){
                        LV=LV-1;
                        sokobanView.setaaa(arrayList.get(LV-1));
                        mToolbar.setTitle("推箱子（第"+LV+"关）");       //设置标题
                    }
                    break;
                case R.id.xiayi:
                    if(LV<arrayList.size()){
                        LV=LV+1;
                        sokobanView.setaaa(arrayList.get(LV-1));
                        mToolbar.setTitle("推箱子（第"+LV+"关）");       //设置标题
                    }else{
                        final Snackbar snackbar = Snackbar.make(up, "已是最后一关", Snackbar
                                .LENGTH_LONG);
                        snackbar.show();
                        snackbar.setAction("确定", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                snackbar.dismiss();
                            }
                        });
                    }
                    break;
            }

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tuixiangzhi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item1) {
            sokobanView.setaaa(arrayList.get(LV-1));

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
