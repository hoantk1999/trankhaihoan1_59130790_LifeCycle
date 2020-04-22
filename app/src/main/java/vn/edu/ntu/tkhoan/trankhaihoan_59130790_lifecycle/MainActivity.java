package vn.edu.ntu.tkhoan.trankhaihoan_59130790_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart Call ");
        txtTG= findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate= spf.format(new Date());
        txtTG.setText(strDate);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart Call ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume Call ");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("LifeCycle", "onPause Call ");
        Toast.makeText(getApplicationContext(), "trankhaihoan", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop Call ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy Call ");
    }
}
