package com.example.trip_project;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // LayoutInflater 사용해 Resource Layout을 View로 변환해준 후 findViewById() 호출
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_frame3, container, false);

        // ListView 아이템에 표시될 사용자 테이터 정의
        String[] menuItems = {"버전 정보", "이용 약관", "개인정보처리방침"};

        ListView listView = (ListView) view.findViewById(R.id.mypageListview);
        // 데이터 입력받을 Adapter 생성
        // fragment에서는 'this' 사용이 불가하므로, Activity의 참조 획득이 가능한 getActivity()함수 사용
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, menuItems);

        listView.setAdapter(listViewAdapter);

        return view;
    }

}
