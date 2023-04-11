package cn.jnu.edu.x2020101336;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cal = this.findViewById(R.id.Calculate);
        EditText edit_score = this.findViewById(R.id.edittext_score);
        TextView text_score = this.findViewById(R.id.score);

        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String score = edit_score.getText().toString();
                String []arrayScore = score.split(",");
                BowlingGame game = new BowlingGame();
                for (int i = 0; i < arrayScore.length; i++)
                {
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                text_score.setText("The total score:" + game.score());

            }
        });
    }
}