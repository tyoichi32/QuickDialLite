package jp.saitama.muchan.quickdiallite;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class quickdiallite extends Activity {

	public final static String SP_NAME = "quickdiallitesp";

    public static SharedPreferences sp;
    private final int MENU_SETTING = 0;
    private final String FLAG_ACTION_CALL = "call";

    private final String LISTHEIGHT_DEFAULT = "0";
    private final String CHARSIZE_DEFAULT = "14.0f";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);

			ImageButton imageButton01 = (ImageButton)this.findViewById(R.id.ImageButton01);
			imageButton01.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton02 = (ImageButton)this.findViewById(R.id.ImageButton02);
			imageButton02.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton03 = (ImageButton)this.findViewById(R.id.ImageButton03);
			imageButton03.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton04 = (ImageButton)this.findViewById(R.id.ImageButton04);
			imageButton04.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton05 = (ImageButton)this.findViewById(R.id.ImageButton05);
			imageButton05.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton06 = (ImageButton)this.findViewById(R.id.ImageButton06);
			imageButton06.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton07 = (ImageButton)this.findViewById(R.id.ImageButton07);
			imageButton07.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton08 = (ImageButton)this.findViewById(R.id.ImageButton08);
			imageButton08.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton09 = (ImageButton)this.findViewById(R.id.ImageButton09);
			imageButton09.setImageResource(android.R.drawable.sym_action_call);

			ImageButton imageButton10 = (ImageButton)this.findViewById(R.id.ImageButton10);
			imageButton10.setImageResource(android.R.drawable.sym_action_call);

			quickdiallite.sp = getSharedPreferences(SP_NAME, MODE_WORLD_READABLE|MODE_WORLD_WRITEABLE);
			quickdiallite.sp.edit().commit();

		} catch (Exception e) {
			return;
		}

    }

    public void onClick(View v){

    	try {
			String strDialNo = "";

			if(v.getId() == R.id.ImageButton01){
				strDialNo = sp.getString("dial_number1", "");
			}
			if(v.getId() == R.id.ImageButton02){
				strDialNo = sp.getString("dial_number2", "");
			}
			if(v.getId() == R.id.ImageButton03){
				strDialNo = sp.getString("dial_number3", "");
			}
			if(v.getId() == R.id.ImageButton04){
				strDialNo = sp.getString("dial_number4", "");
			}
			if(v.getId() == R.id.ImageButton05){
				strDialNo = sp.getString("dial_number5", "");
			}
			if(v.getId() == R.id.ImageButton06){
				strDialNo = sp.getString("dial_number6", "");
			}
			if(v.getId() == R.id.ImageButton07){
				strDialNo = sp.getString("dial_number7", "");
			}
			if(v.getId() == R.id.ImageButton08){
				strDialNo = sp.getString("dial_number8", "");
			}
			if(v.getId() == R.id.ImageButton09){
				strDialNo = sp.getString("dial_number9", "");
			}
			if(v.getId() == R.id.ImageButton10){
				strDialNo = sp.getString("dial_number10", "");
			}

			String actionFalg = sp.getString("action_value", FLAG_ACTION_CALL);

			if (!strDialNo.equals("")){

			    Intent intentCall = new Intent();

			    if (actionFalg.equals(FLAG_ACTION_CALL)){
			        intentCall.setAction(Intent.ACTION_CALL);
			    }else{
			        intentCall.setAction(Intent.ACTION_DIAL);
			    }

			    intentCall.setData(Uri.parse("tel:" + strDialNo));
			    startActivity(intentCall);

			    finish();
			}else{
				 Toast.makeText(this, getString(R.string.txt_no_reg), Toast.LENGTH_SHORT).show();
			}
		} catch (Exception e) {
			return;
		}
    }

    @Override
    public void onResume(){
        try {
			super.onResume();

			TableRow tableRow01 = (TableRow)this.findViewById(R.id.TableRow01);
			TableRow tableRow02 = (TableRow)this.findViewById(R.id.TableRow02);
			TableRow tableRow03 = (TableRow)this.findViewById(R.id.TableRow03);
			TableRow tableRow04 = (TableRow)this.findViewById(R.id.TableRow04);
			TableRow tableRow05 = (TableRow)this.findViewById(R.id.TableRow05);
			TableRow tableRow06 = (TableRow)this.findViewById(R.id.TableRow06);
			TableRow tableRow07 = (TableRow)this.findViewById(R.id.TableRow07);
			TableRow tableRow08 = (TableRow)this.findViewById(R.id.TableRow08);
			TableRow tableRow09 = (TableRow)this.findViewById(R.id.TableRow09);
			TableRow tableRow10 = (TableRow)this.findViewById(R.id.TableRow10);

			int iListHeight;
			try {
				iListHeight = Integer.parseInt(sp.getString("listheight_value", LISTHEIGHT_DEFAULT));
			} catch (Exception e) {
				iListHeight = Integer.parseInt(LISTHEIGHT_DEFAULT);
			}

			tableRow01.setPadding(0, iListHeight, 0, iListHeight);
			tableRow02.setPadding(0, iListHeight, 0, iListHeight);
			tableRow03.setPadding(0, iListHeight, 0, iListHeight);
			tableRow04.setPadding(0, iListHeight, 0, iListHeight);
			tableRow05.setPadding(0, iListHeight, 0, iListHeight);
			tableRow06.setPadding(0, iListHeight, 0, iListHeight);
			tableRow07.setPadding(0, iListHeight, 0, iListHeight);
			tableRow08.setPadding(0, iListHeight, 0, iListHeight);
			tableRow09.setPadding(0, iListHeight, 0, iListHeight);
			tableRow10.setPadding(0, iListHeight, 0, iListHeight);

			TextView textView01 = (TextView)this.findViewById(R.id.TextView01);
			TextView textView02 = (TextView)this.findViewById(R.id.TextView02);
			TextView textView03 = (TextView)this.findViewById(R.id.TextView03);
			TextView textView04 = (TextView)this.findViewById(R.id.TextView04);
			TextView textView05 = (TextView)this.findViewById(R.id.TextView05);
			TextView textView06 = (TextView)this.findViewById(R.id.TextView06);
			TextView textView07 = (TextView)this.findViewById(R.id.TextView07);
			TextView textView08 = (TextView)this.findViewById(R.id.TextView08);
			TextView textView09 = (TextView)this.findViewById(R.id.TextView09);
			TextView textView10 = (TextView)this.findViewById(R.id.TextView10);

			float fCharSize;
			try {
				fCharSize = Float.parseFloat(sp.getString("charsize_value", CHARSIZE_DEFAULT));
			} catch (Exception e) {
				fCharSize = Float.parseFloat(CHARSIZE_DEFAULT);
			}

			textView01.setTextSize(fCharSize);
			textView02.setTextSize(fCharSize);
			textView03.setTextSize(fCharSize);
			textView04.setTextSize(fCharSize);
			textView05.setTextSize(fCharSize);
			textView06.setTextSize(fCharSize);
			textView07.setTextSize(fCharSize);
			textView08.setTextSize(fCharSize);
			textView09.setTextSize(fCharSize);
			textView10.setTextSize(fCharSize);

			textView01.setText(sp.getString("dial_name1", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number1", ""));
			textView02.setText(sp.getString("dial_name2", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number2", ""));
			textView03.setText(sp.getString("dial_name3", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number3", ""));
			textView04.setText(sp.getString("dial_name4", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number4", ""));
			textView05.setText(sp.getString("dial_name5", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number5", ""));
			textView06.setText(sp.getString("dial_name6", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number6", ""));
			textView07.setText(sp.getString("dial_name7", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number7", ""));
			textView08.setText(sp.getString("dial_name8", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number8", ""));
			textView09.setText(sp.getString("dial_name9", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number9", ""));
			textView10.setText(sp.getString("dial_name10", getString(R.string.txt_no_reg)) + ":" + sp.getString("dial_number10", ""));

			 //広告表示
	        AdView mAdView = (AdView) findViewById(R.id.adView);
	        AdRequest adRequest = new AdRequest.Builder()
	        		.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
	        		.addTestDevice("F12D6468FF1DC4CDD7AB4E917DD804BF")
	        		.build();
	        mAdView.loadAd(adRequest);

		} catch (NumberFormatException e) {
			return;
		}

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    	try {
			super.onCreateOptionsMenu(menu);

			MenuItem menuitem = menu.add(0,MENU_SETTING,0,R.string.settinglavel);
			menuitem.setIcon(android.R.drawable.ic_menu_manage);

			return true;
		} catch (Exception e) {
			return false;
		}
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuitem){
    	try {
			super.onOptionsItemSelected(menuitem);

			Intent intentSetting = new Intent(this, setting.class);
			startActivity(intentSetting);

			return true;
		} catch (Exception e) {
			return false;
		}
    }


}