package indosat.cendekiamilenia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import indosat.cendekiamilenia.R;

/**
 * Created by Ari on 8/22/2016.
 */
public class ScholarshipForm extends Fragment{
    private static String TAG = ScholarshipForm.class.getSimpleName();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
		/* Inflate the layout for this fragment */
        View rootView = inflater.inflate(R.layout.scholarship_form, container, false);

        FragmentTransaction transaction = getFragmentManager()
                .beginTransaction();
		/*
		 * When this container fragment is created, we fill it with our first
		 * "real" fragment
		 */
        transaction.replace(R.id.scholarship_frame, new ScholarshipForm1());

        transaction.commit();

        return rootView;
    }
}
