package com.example.tourguideapp;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class DisplayFragmentAdapter extends FragmentPagerAdapter {
    Context mContext;
    public DisplayFragmentAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        mContext=context;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new HistoryFragment();
        }
        else if(position==1){
            return new MuseumFragment();
        }
        else if (position==2){
            return  new ResturantFragment();
        }
        else return new BeachesFragment() ;
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return mContext.getString(R.string.Fragment_History);
        }
        else if(position==1){
            return mContext.getString(R.string.Fragment_Museum);
        }
        else if (position==2){
            return mContext.getString(R.string.Fragment_Restaurant);
        }
        else  return mContext.getString(R.string.Fragment_Beaches);
    }
}
