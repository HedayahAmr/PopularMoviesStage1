package com.example.lap.popular_movies_stage1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.squareup.picasso.Picasso;

public class ActivityDetalie extends AppCompatActivity {
    @BindView(R.id.movie_posters)
    ImageView Poster ;
    @BindView(R.id.overview)
    TextView OverView ;
    @BindView(R.id.tv_Title)
    TextView Movei_Name;
    @BindView(R.id.release_data)
    TextView DataRelease ;
 @BindView(R.id.tv_detail_rate)
 TextView MovieRate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

      //stackoverflow.com_how-to-pass-json-image-from-recycler-view-to-another-activity
        String MovieImage = getIntent().getStringExtra("poster");
        String title = getIntent().getStringExtra("title");
        String Movierate = getIntent().getStringExtra("rate");
        String release = getIntent().getStringExtra("release");
        String overview = getIntent().getStringExtra("overview");

       Movei_Name.setText(title);
       OverView.setText(overview);
      MovieRate.setText(Movierate);
       DataRelease.setText(release);
        Picasso.get()
                .load(MovieImage)
                .placeholder(R.drawable.image_loading)
                .error(R.drawable.image_not_found)
                .into(Poster);

    }
}


