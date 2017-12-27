package tanta.me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void contact(View view){
        switch (view.getId()){
            case R.id.facebook:
                Toast.makeText(this,"Facebook Has Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.twitter:
                Toast.makeText(this,"Twitter Has Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.instagram:
                Toast.makeText(this,"Instagram Has Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.gmail:
                Toast.makeText(this,"Gmail Has Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.phone:
                Toast.makeText(this,"Phone Has Clicked",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
