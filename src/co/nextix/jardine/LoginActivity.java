package co.nextix.jardine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
	}
	
	public void signInClicked (View view){
		startActivity(new Intent(getApplicationContext(), DashBoardActivity.class));
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
	}
}
