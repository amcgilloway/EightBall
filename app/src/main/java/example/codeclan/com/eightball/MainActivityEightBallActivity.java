package example.codeclan.com.eightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityEightBallActivity extends AppCompatActivity {

    EditText questionEditText;
    Button shakeBtn;
    TextView answerText;
    String TAG = "EIGHT_BALL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eight_ball);

        questionEditText = (EditText) findViewById(R.id.question_editText);
        shakeBtn = (Button) findViewById(R.id.shake_btn);
        answerText = (TextView) findViewById(R.id.answer_text);
    }

    public void onShakeButtonClick(View button){
        Log.d(TAG, "Question asked was: " + questionEditText.getText().toString());
        Log.d(TAG, "Shak button clicked");
    }
}
