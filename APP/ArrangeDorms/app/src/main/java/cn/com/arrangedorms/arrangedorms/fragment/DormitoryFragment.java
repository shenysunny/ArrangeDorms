package cn.com.arrangedorms.arrangedorms.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.com.arrangedorms.arrangedorms.R;


/**
 * Created by Administrator on 2017/10/24.
 * 作用：
 */

public class DormitoryFragment extends Fragment {

    private TextView tv_content;

    public DormitoryFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_charactercolor,container,false);
        tv_content = (TextView) view.findViewById(R.id.tv_content);
        tv_content.setText("DormitoryFragment");
        return view;
    }

}
