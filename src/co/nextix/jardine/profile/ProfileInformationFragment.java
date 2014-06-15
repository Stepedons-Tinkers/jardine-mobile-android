package co.nextix.jardine.profile;

import co.nextix.jardine.R;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileInformationFragment extends Fragment {
	public static Fragment newInstance() {
		ProfileInformationFragment fragment = new ProfileInformationFragment();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.profile_info_layout, null);

		return view;
	}
}
