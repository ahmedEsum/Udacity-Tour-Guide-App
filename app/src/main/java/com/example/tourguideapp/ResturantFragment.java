package com.example.tourguideapp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
public class ResturantFragment extends Fragment {
    public ResturantFragment(){}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list,container,false);
        ArrayList<AppDataModel> info = new ArrayList<>();
        info.add(new AppDataModel(R.string.Abou_Tarek,R.string.abou_tark_article,R.mipmap.kosh));
        info.add(new AppDataModel(R.string.Le_Pacha_1901,R.string.la_pasha_article,R.mipmap.lepacha1901cairo));
        info.add(new AppDataModel(R.string.El_Prince,R.string.El_pricnce_article,R.mipmap.elprince));
        info.add(new AppDataModel(R.string.Indira_Indian,R.string.indian_article,R.mipmap.indiraindianrestaurant));
        DataAdapter adapter = new DataAdapter(getContext(),0,info);
        ListView listView = rootView.findViewById(R.id.display_list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
