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
public class BeachesFragment extends Fragment {
    public  BeachesFragment(){}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list,container,false);
        ArrayList<AppDataModel> info = new ArrayList<>();
        info.add(new AppDataModel(R.string.Orange_Bay,R.string.Orange_Bay_article,R.mipmap.orange));
        info.add(new AppDataModel(R.string.Ras_Mohamed,R.string.Ras_Mohamed_article,R.mipmap.rasmohamed));
        info.add(new AppDataModel(R.string.ALNayzak,R.string.ALNayzak_article,R.mipmap.nayzak));
        DataAdapter adapter = new DataAdapter(getContext(),0,info);
        ListView listView = rootView.findViewById(R.id.display_list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
