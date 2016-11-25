package bn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.cse323.dotnet.driverstress.R;


public class MainActivityBN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bn);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
        menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.us_flag));
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * On selecting action bar icons
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case R.id.action_setting:
                // Setting Action
                Toast.makeText(this,"We need to discuss about the Setting Feature!!!",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_language_bd:
                // Language change to Bangla & English
                englishLanguage();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Launching new activity
     * */
    private void englishLanguage() {
        onBackPressed();
        /*Intent i = new Intent(MainActivityBN.this, MainActivity.class);
        startActivity(i);*/
    }
}
