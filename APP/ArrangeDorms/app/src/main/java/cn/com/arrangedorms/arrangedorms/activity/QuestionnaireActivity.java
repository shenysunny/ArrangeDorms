package cn.com.arrangedorms.arrangedorms.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;

import cn.com.arrangedorms.arrangedorms.R;

public class QuestionnaireActivity extends AppCompatActivity {

    private RadioGroup rg_one;
    private RadioGroup rg_two;
    private RadioGroup rg_three;
    private RadioButton rb_one_one;
    private RadioButton rb_one_two;
    private RadioButton rb_two_one;
    private RadioButton rb_two_two;
    private RadioButton rb_three_one;
    private RadioButton rb_three_two;

    private Button btn_ensure;

    private String question_one= "";
    private String question_two= "";
    private String question_three= "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);
         //初始化
        initView();
    }

    private void initView() {
        rg_one = (RadioGroup) findViewById(R.id.rg_one);
        rg_two = (RadioGroup) findViewById(R.id.rg_two);
        rg_three = (RadioGroup) findViewById(R.id.rg_three);
        rb_one_one = (RadioButton) findViewById(R.id.rb_one_one);
        rb_one_two = (RadioButton) findViewById(R.id.rb_one_two);
        rb_two_one = (RadioButton) findViewById(R.id.rb_two_one);
        rb_two_two = (RadioButton) findViewById(R.id.rb_two_two);
        rb_three_one = (RadioButton) findViewById(R.id.rb_three_one);
        rb_three_two = (RadioButton) findViewById(R.id.rb_three_two);
        btn_ensure = (Button) findViewById(R.id.btn_ensure);



        rg_one.setOnCheckedChangeListener(rg_oneOnCheckedChangeListener);
        rg_two.setOnCheckedChangeListener(rg_oneOnCheckedChangeListener);
        rg_three.setOnCheckedChangeListener(rg_oneOnCheckedChangeListener);

        btn_ensure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取问卷调查数据
                String[] aa = {question_one,question_two,question_three};
                Log.e("问卷调查数据",aa[1].toString());
                //联网上传数据，并得到返回值
            }
        });
    }

    private RadioGroup.OnCheckedChangeListener rg_oneOnCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == rb_one_one.getId()){
                Log.e("选中的值：",rb_one_one.getText().toString());
                question_one = "A";
            }else if (checkedId == rb_one_two.getId()){
                Log.e("选中的值：",rb_one_two.getText().toString());
                question_one = "B";
            }else if (checkedId == rb_two_one.getId()){
                Log.e("选中的值：",rb_two_one.getText().toString());
                question_two = "A";
            }else if (checkedId == rb_two_two.getId()){
                Log.e("选中的值：",rb_two_two.getText().toString());
                question_two = "B";
            }else if (checkedId == rb_three_one.getId()){
                Log.e("选中的值：",rb_three_one.getText().toString());
                question_three = "A";
            }else if (checkedId == rb_three_two.getId()){
                Log.e("选中的值：",rb_three_two.getText().toString());
                question_three = "B";
            }
        }
    };


}
