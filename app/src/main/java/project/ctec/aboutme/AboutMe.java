package project.ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.ImageView;

public class AboutMe extends AppCompatActivity
{
    // Defining the Buttons
    private Button colorChangeButtton;
    private Button backButton;
    private Button schoolButton;
    private Button gameButton;
    private Button foodButton;
    private Button campButton;
    private Button programmingButton;

    private LinearLayout myLayout;

    private TextView myText;
    private ImageView myImage;

    private int redColor;
    private int blueColor;
    private int greenColor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        // Attaching my Buttons
        colorChangeButtton = (Button) findViewById(R.id.colorChangeButton);
        backButton = (Button) findViewById(R.id.backButton);
        schoolButton = (Button) findViewById(R.id.schoolButton);
        gameButton = (Button) findViewById(R.id.gameButton);
        foodButton = (Button) findViewById(R.id.foodButton);
        campButton = (Button) findViewById(R.id.campingButton);
        programmingButton = (Button) findViewById(R.id.programmingButton);

        myLayout = (LinearLayout) findViewById(R.id.myLayout);

        myText = (TextView) findViewById(R.id.textView);
        myImage = (ImageView) findViewById(R.id.imageView);

        schoolButton.setWidth((int)(myLayout.getWidth()*0.5));
        gameButton.setWidth((int)(myLayout.getWidth()*0.5));
        foodButton.setWidth((int)(myLayout.getWidth()*0.5));
        programmingButton.setWidth((int)(myLayout.getWidth()*0.5));

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Ran once to setup my listeners
     */
    public void setupListeners()
    {
        colorChangeButtton.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                redColor = (int) (Math.random() * 256);
                blueColor = (int) (Math.random() * 256);
                greenColor = (int) (Math.random() * 256);

                myLayout.setBackgroundColor(Color.rgb(redColor, blueColor, greenColor));
            }

        });
        backButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                updateButtonVisibility(true);
                backButton.setVisibility(View.GONE);

            }
        });
        schoolButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                myImage.setBackgroundResource(R.drawable.back_to_school);
                myText.setText(R.string.school_string);
                updateButtonVisibility(false);

            }

        });
        gameButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                myImage.setBackgroundResource(R.drawable.gaming_image);
                myText.setText(R.string.game_string);
                updateButtonVisibility(false);

            }

        });
        foodButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                myImage.setBackgroundResource(R.drawable.food_image);
                myText.setText(R.string.food_string);
                updateButtonVisibility(false);

            }

        });
        campButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                myImage.setBackgroundResource(R.drawable.camping_image);
                myText.setText(R.string.camping_string);
                updateButtonVisibility(false);

            }

        });
        programmingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myImage.setBackgroundResource(R.drawable.coding);
                myText.setText(R.string.code_string);
                updateButtonVisibility(false);

            }

        });

    }

    /**
     * This is used to update wither the buttons are visible or not
     * @param visible A boolean of wither you want them visible or not.
     */
    private void updateButtonVisibility(boolean visible)
    {
        if(visible)
        {
            myImage.setVisibility(View.GONE);
            myText.setVisibility(View.GONE);
            programmingButton.setVisibility(View.GONE);
            schoolButton.setVisibility(View.VISIBLE);
            gameButton.setVisibility(View.VISIBLE);
            foodButton.setVisibility(View.VISIBLE);
            campButton.setVisibility(View.VISIBLE);

        }
        else
        {
            schoolButton.setVisibility(View.GONE);
            gameButton.setVisibility(View.GONE);
            foodButton.setVisibility(View.GONE);
            campButton.setVisibility(View.GONE);
            programmingButton.setVisibility(View.GONE);
            myImage.setVisibility(View.VISIBLE);
            myText.setVisibility(View.VISIBLE);
            backButton.setVisibility(View.VISIBLE);
        }

    }

}
