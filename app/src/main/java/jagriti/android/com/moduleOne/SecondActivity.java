package jagriti.android.com.moduleOne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import jagriti.android.com.R;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE ="jagriti.hellotoast.com.extra.MESSAGE";
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mShowCount = (TextView) findViewById(R.id.show_count);
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
    public void launchSecondActivity(View view) {
        /* Log.d(LOG_TAG, "Button clicked!");*/
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra(EXTRA_MESSAGE, Integer.toString(mCount));
        startActivity(intent);
    }
}
