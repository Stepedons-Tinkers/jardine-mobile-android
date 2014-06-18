package co.nextix.jardine.activities.select.fragments;

import co.nextix.jardine.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SelectCustomerContactPersonFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View myFragmentView = inflater.inflate(R.layout.fragment_activity_select_customer_contact_person,
				container, false);

		return myFragmentView;
	}

}
