package tabs.palringo.com.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String s = "hi	bye";//tabs
		String s2 = "hi    bye";//space
		setContentView(R.layout.activity_main);
	}
}
