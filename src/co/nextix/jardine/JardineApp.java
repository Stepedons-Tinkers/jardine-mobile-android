package co.nextix.jardine;

import co.nextix.jardine.database.DatabaseAdapter;
import android.app.Application;

public class JardineApp extends Application {

	public static String TAG = "Jardine";

	@Override
	public void onCreate() {
		DatabaseAdapter.init(this);
		DatabaseAdapter.getInstance().open();
		super.onCreate();
	}

}
