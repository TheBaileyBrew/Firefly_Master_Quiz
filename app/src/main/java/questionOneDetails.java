import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.thebaileybrew.firefly_master_quiz.R;

public class questionOneDetails extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_detail);
        {
            Button questionOneAnswerOne = findViewById(R.id.question_one_answer_one);
            questionOneAnswerOne.setOnClickListener(this);

        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.question_one_answer_one:
                TextView tv1 = findViewById(R.id.question_one_details);
                tv1.setText("Hello");
                break;
        }
    }
}
