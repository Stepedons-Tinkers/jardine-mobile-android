package co.nextix.jardine.fragments;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.nextix.jardine.R;

public class StartActivityFragment extends Fragment {

	public StartActivityFragment() {
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		getActivity().setRequestedOrientation(
				ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		View rootView = inflater.inflate(R.layout.fragment_start_activity, container,
				false);
		
		TextView crm_no = (TextView) rootView.findViewById(R.id.crm_no);
		return rootView;
	}

}
