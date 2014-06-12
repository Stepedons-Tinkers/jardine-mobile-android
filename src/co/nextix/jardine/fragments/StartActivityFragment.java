package co.nextix.jardine.fragments;

import android.content.pm.ActivityInfo;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import co.nextix.jardine.R;

public class StartActivityFragment extends Fragment {

	private Button activityInfo = null;
	private Button jdiProductStockCheck = null;
	private Button jdiMerchandisingCheck = null;
	private Button competitorProductStockCheck = null;
	private Button marketingIntel = null;
	private Button projectRequirements = null;
	private Button diyOrSupermarketPhotos = null;
	private Button customerContactPerson = null;
	private Button product = null;

	public StartActivityFragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		getActivity().setRequestedOrientation(
				ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

		View rootView = inflater.inflate(R.layout.fragment_activity_details,
				container, false);

		this.activityInfo = (Button) rootView.findViewById(R.id.activity_info);
		this.activityInfo.getBackground().setColorFilter(
				new LightingColorFilter(0x0033FF, 0x0066FF));
		
		this.jdiProductStockCheck = (Button) rootView.findViewById(R.id.jdi_stock_check);
		this.jdiMerchandisingCheck = (Button) rootView.findViewById(R.id.jdi_merchandising_check);
		this.competitorProductStockCheck = (Button) rootView.findViewById(R.id.competitor_stock_check);
		this.marketingIntel = (Button) rootView.findViewById(R.id.marketing_intel);
		this.projectRequirements = (Button) rootView.findViewById(R.id.project_requirements);
		this.diyOrSupermarketPhotos = (Button) rootView.findViewById(R.id.diy_supermarket_photos);
		this.customerContactPerson = (Button) rootView.findViewById(R.id.customer_contact_person);
		this.product = (Button) rootView.findViewById(R.id.products);
		return rootView;
	}
}
