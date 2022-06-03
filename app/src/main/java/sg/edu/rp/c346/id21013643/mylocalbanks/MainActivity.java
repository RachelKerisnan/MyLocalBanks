package sg.edu.rp.c346.id21013643.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDBS;
    Button btnOCBC;
    Button btnUOB;

    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDBS = findViewById(R.id.buttonDBS);
        btnOCBC = findViewById(R.id.buttonOCBC);
        btnUOB = findViewById(R.id.buttonUOB);

        registerForContextMenu(btnDBS);
        registerForContextMenu(btnOCBC);
        registerForContextMenu(btnUOB);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "Website");
        menu.add(0, 0, 1, "Contact the Bank");

        menu.add(0, 0, 2, "English");
        menu.add(0, 0, 3, "Chinese");


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (wordClicked.equalsIgnoreCase("Bank1")) {
            if (id == R.id.webSelection) {
                Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dbs.com/default.page?gclid=CjwKCAjwp7eUBhBeEiwAZbHwkc6qeptwfUrH0S8QeENPZnZssHSvwDUQ6zsu36NZrDG1_3tlbcXi5RoCdGYQAvD_BwE&gclsrc=aw.ds"));
                startActivity(intentCall);
                return true;
            } else if (id == R.id.bankSelection) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +1800-111-1111"));
                startActivity(intentCall);
                return true;
            } else {
                return false;
            }
        }
        if (wordClicked.equalsIgnoreCase("Bank2")) {
            if (id == R.id.webSelection) {
                Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ocbc.com/group/gateway.page"));
                startActivity(intentCall);
                return true;
            } else if (id == R.id.bankSelection) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +1800-363-3333"));
                startActivity(intentCall);
                return true;
            } else {
                return false;
            }
        }
        if (wordClicked.equalsIgnoreCase("Bank3")) {
            if (id == R.id.webSelection) {
                Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pib.uob.com.sg/PIBLogin/Public/processPreCapture.do?keyId=lpc"));
                startActivity(intentCall);
                return true;
            } else if (id == R.id.bankSelection) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +1800-222-2121"));
                startActivity(intentCall);
                return true;
            } else {
                return false;
            }
        }
        return super.onContextItemSelected(item);
    }

    @Override


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

    return true;
    }
}







