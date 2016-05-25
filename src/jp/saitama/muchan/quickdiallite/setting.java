/**
 *
 */
package jp.saitama.muchan.quickdiallite;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.widget.ListView;

/**
 * @author muchan
 *
 */
public class setting extends PreferenceActivity {

	PreferenceScreen screenPrefDialRoot1;
	PreferenceScreen screenPrefDialRoot2;
	PreferenceScreen screenPrefDialRoot3;
	PreferenceScreen screenPrefDialRoot4;
	PreferenceScreen screenPrefDialRoot5;
	PreferenceScreen screenPrefDialRoot6;
	PreferenceScreen screenPrefDialRoot7;
	PreferenceScreen screenPrefDialRoot8;
	PreferenceScreen screenPrefDialRoot9;
	PreferenceScreen screenPrefDialRoot10;

	PreferenceScreen screenPref1;
	PreferenceScreen screenPref2;
	PreferenceScreen screenPref3;
	PreferenceScreen screenPref4;
	PreferenceScreen screenPref5;
	PreferenceScreen screenPref6;
	PreferenceScreen screenPref7;
	PreferenceScreen screenPref8;
	PreferenceScreen screenPref9;
	PreferenceScreen screenPref10;

	EditTextPreference pref_screen_free_name1;

	Preference screenPref_del1;
	PreferenceScreen screenPref_del2;
	PreferenceScreen screenPref_del3;
	PreferenceScreen screenPref_del4;
	PreferenceScreen screenPref_del5;
	PreferenceScreen screenPref_del6;
	PreferenceScreen screenPref_del7;
	PreferenceScreen screenPref_del8;
	PreferenceScreen screenPref_del9;
	PreferenceScreen screenPref_del10;

	ListPreference listDialOrCall;
	ListPreference listListHeight;
	ListPreference listCharSize;

	private static final int REQUEST_PICK_CONTACT1 = 1;
	private static final int REQUEST_PICK_CONTACT2 = 2;
	private static final int REQUEST_PICK_CONTACT3 = 3;
	private static final int REQUEST_PICK_CONTACT4 = 4;
	private static final int REQUEST_PICK_CONTACT5 = 5;
	private static final int REQUEST_PICK_CONTACT6 = 6;
	private static final int REQUEST_PICK_CONTACT7 = 7;
	private static final int REQUEST_PICK_CONTACT8 = 8;
	private static final int REQUEST_PICK_CONTACT9 = 9;
	private static final int REQUEST_PICK_CONTACT10 = 10;

	public ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
			super.onCreate(savedInstanceState);

			addPreferencesFromResource(R.xml.preference);

			quickdiallite.sp.edit().commit();

			//動作設定
			listDialOrCall = (ListPreference)findPreference("selected_action_cord");
			listListHeight = (ListPreference)findPreference("selected_action_listheight");
			listCharSize = (ListPreference)findPreference("selected_action_charsize");

			screenPrefDialRoot1 = (PreferenceScreen)findPreference("pref_screen_dial_root1");
			screenPrefDialRoot2 = (PreferenceScreen)findPreference("pref_screen_dial_root2");
			screenPrefDialRoot3 = (PreferenceScreen)findPreference("pref_screen_dial_root3");
			screenPrefDialRoot4 = (PreferenceScreen)findPreference("pref_screen_dial_root4");
			screenPrefDialRoot5 = (PreferenceScreen)findPreference("pref_screen_dial_root5");
			screenPrefDialRoot6 = (PreferenceScreen)findPreference("pref_screen_dial_root6");
			screenPrefDialRoot7 = (PreferenceScreen)findPreference("pref_screen_dial_root7");
			screenPrefDialRoot8 = (PreferenceScreen)findPreference("pref_screen_dial_root8");
			screenPrefDialRoot9 = (PreferenceScreen)findPreference("pref_screen_dial_root9");
			screenPrefDialRoot10 = (PreferenceScreen)findPreference("pref_screen_dial_root10");

			//親のPreferenceScreen
			screenPrefDialRoot1.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot2.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot3.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot4.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot5.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot6.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot7.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot8.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot9.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot10.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});


			//ダイヤル登録
			screenPref1 = (PreferenceScreen)findPreference("pref_screen1");
			screenPref2 = (PreferenceScreen)findPreference("pref_screen2");
			screenPref3 = (PreferenceScreen)findPreference("pref_screen3");
			screenPref4 = (PreferenceScreen)findPreference("pref_screen4");
			screenPref5 = (PreferenceScreen)findPreference("pref_screen5");
			screenPref6 = (PreferenceScreen)findPreference("pref_screen6");
			screenPref7 = (PreferenceScreen)findPreference("pref_screen7");
			screenPref8 = (PreferenceScreen)findPreference("pref_screen8");
			screenPref9 = (PreferenceScreen)findPreference("pref_screen9");
			screenPref10 = (PreferenceScreen)findPreference("pref_screen10");

			//ダイヤル削除
			screenPref_del1 = (Preference)findPreference("pref_screen_del1");
			screenPref_del1.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name1");
						editor.remove("dial_number1");
						editor.commit();
						((PreferenceScreen)screenPref1).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot1).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del2 = (PreferenceScreen)findPreference("pref_screen_del2");
			screenPref_del2.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name2");
						editor.remove("dial_number2");
						editor.commit();
						((PreferenceScreen)screenPref2).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot2).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del3 = (PreferenceScreen)findPreference("pref_screen_del3");
			screenPref_del3.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name3");
						editor.remove("dial_number3");
						editor.commit();
						((PreferenceScreen)screenPref3).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot3).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del4 = (PreferenceScreen)findPreference("pref_screen_del4");
			screenPref_del4.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name4");
						editor.remove("dial_number4");
						editor.commit();
						((PreferenceScreen)screenPref4).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot4).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del5 = (PreferenceScreen)findPreference("pref_screen_del5");
			screenPref_del5.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name5");
						editor.remove("dial_number5");
						editor.commit();
						((PreferenceScreen)screenPref5).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot5).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del6 = (PreferenceScreen)findPreference("pref_screen_del6");
			screenPref_del6.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name6");
						editor.remove("dial_number6");
						editor.commit();
						((PreferenceScreen)screenPref6).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot6).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del7 = (PreferenceScreen)findPreference("pref_screen_del7");
			screenPref_del7.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name7");
						editor.remove("dial_number7");
						editor.commit();
						((PreferenceScreen)screenPref7).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot7).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del8 = (PreferenceScreen)findPreference("pref_screen_del8");
			screenPref_del8.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name8");
						editor.remove("dial_number8");
						editor.commit();
						((PreferenceScreen)screenPref8).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot8).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del9 = (PreferenceScreen)findPreference("pref_screen_del9");
			screenPref_del9.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name9");
						editor.remove("dial_number9");
						editor.commit();
						((PreferenceScreen)screenPref9).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot9).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del10 = (PreferenceScreen)findPreference("pref_screen_del10");
			screenPref_del10.setOnPreferenceClickListener(new OnPreferenceClickListener(){
				@Override
				public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name10");
						editor.remove("dial_number10");
						editor.commit();
						((PreferenceScreen)screenPref10).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot10).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});

			//動作設定
			((ListPreference)listDialOrCall).setSummary(quickdiallite.sp.getString("action_sumary", getString(R.string.list_summary_dorc)));
			((ListPreference)listListHeight).setSummary(quickdiallite.sp.getString("listheight_sumary", getString(R.string.list_summary_listheight)));
			((ListPreference)listCharSize).setSummary(quickdiallite.sp.getString("charsize_sumary", getString(R.string.list_summary_charsize)));

			((PreferenceScreen)screenPrefDialRoot1).setSummary(quickdiallite.sp.getString("dial_name1", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number1", ""));
			((PreferenceScreen)screenPrefDialRoot2).setSummary(quickdiallite.sp.getString("dial_name2", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number2", ""));
			((PreferenceScreen)screenPrefDialRoot3).setSummary(quickdiallite.sp.getString("dial_name3", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number3", ""));
			((PreferenceScreen)screenPrefDialRoot4).setSummary(quickdiallite.sp.getString("dial_name4", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number4", ""));
			((PreferenceScreen)screenPrefDialRoot5).setSummary(quickdiallite.sp.getString("dial_name5", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number5", ""));
			((PreferenceScreen)screenPrefDialRoot6).setSummary(quickdiallite.sp.getString("dial_name6", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number6", ""));
			((PreferenceScreen)screenPrefDialRoot7).setSummary(quickdiallite.sp.getString("dial_name7", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number7", ""));
			((PreferenceScreen)screenPrefDialRoot8).setSummary(quickdiallite.sp.getString("dial_name8", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number8", ""));
			((PreferenceScreen)screenPrefDialRoot9).setSummary(quickdiallite.sp.getString("dial_name9", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number9", ""));
			((PreferenceScreen)screenPrefDialRoot10).setSummary(quickdiallite.sp.getString("dial_name10", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number10", ""));

			//ダイヤル登録
			((PreferenceScreen)screenPref1).setSummary(quickdiallite.sp.getString("dial_name1", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number1", ""));
			((PreferenceScreen)screenPref2).setSummary(quickdiallite.sp.getString("dial_name2", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number2", ""));
			((PreferenceScreen)screenPref3).setSummary(quickdiallite.sp.getString("dial_name3", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number3", ""));
			((PreferenceScreen)screenPref4).setSummary(quickdiallite.sp.getString("dial_name4", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number4", ""));
			((PreferenceScreen)screenPref5).setSummary(quickdiallite.sp.getString("dial_name5", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number5", ""));
			((PreferenceScreen)screenPref6).setSummary(quickdiallite.sp.getString("dial_name6", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number6", ""));
			((PreferenceScreen)screenPref7).setSummary(quickdiallite.sp.getString("dial_name7", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number7", ""));
			((PreferenceScreen)screenPref8).setSummary(quickdiallite.sp.getString("dial_name8", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number8", ""));
			((PreferenceScreen)screenPref9).setSummary(quickdiallite.sp.getString("dial_name9", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number9", ""));
			((PreferenceScreen)screenPref10).setSummary(quickdiallite.sp.getString("dial_name10", getString(R.string.txt_no_reg)) + ":" + quickdiallite.sp.getString("dial_number10", ""));

			//動作設定
			listDialOrCall.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {

					try {
						String summary = "";
						String value = "";
						String[] entries = getResources().getStringArray(R.array.list_dorc);
						String[] values = getResources().getStringArray(R.array.list_dorcvalues);
						for (int i = 0; i < values.length; ++i) {
							if (values[i].equals(newValue)) {
								summary = entries[i];
								value = values[i];
								break;
							}
						}
						((ListPreference)preference).setSummary(summary);
						Editor editor = quickdiallite.sp.edit();
						editor.putString("action_value",value);
						editor.putString("action_sumary",summary);
						editor.commit();

						return true;
					} catch (NotFoundException e) {
						return false;
					}
				}
			});

			//動作設定
			listListHeight.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {

					try {
						String summary = "";
						String value = "";
						String[] entries = getResources().getStringArray(R.array.list_height);
						String[] values = getResources().getStringArray(R.array.list_heightvalues);
						for (int i = 0; i < values.length; ++i) {
							if (values[i].equals(newValue)) {
								summary = entries[i];
								value = values[i];
								break;
							}
						}
						((ListPreference)preference).setSummary(summary);
						Editor editor = quickdiallite.sp.edit();
						editor.putString("listheight_value",value);
						editor.putString("listheight_sumary",summary);
						editor.commit();


						return true;
					} catch (NotFoundException e) {
						return false;
					}
				}
			});

			//動作設定
			listCharSize.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {

					try {
						String summary = "";
						String value = "";
						String[] entries = getResources().getStringArray(R.array.list_charsize);
						String[] values = getResources().getStringArray(R.array.list_charsizevalues);
						for (int i = 0; i < values.length; ++i) {
							if (values[i].equals(newValue)) {
								summary = entries[i];
								value = values[i];
								break;
							}
						}
						((ListPreference)preference).setSummary(summary);
						Editor editor = quickdiallite.sp.edit();
						editor.putString("charsize_value",value);
						editor.putString("charsize_sumary",summary);
						editor.commit();

						return true;
					} catch (NotFoundException e) {
						return false;
					}
				}
			});

			//ダイヤル登録
			screenPref1.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();
						startActivityForResult(intent, REQUEST_PICK_CONTACT1);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref2.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();
						startActivityForResult(intent, REQUEST_PICK_CONTACT2);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref3.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT3);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref4.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT4);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref5.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT5);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref6.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT6);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref7.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT7);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref8.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT8);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref9.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT9);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref10.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT10);
						showProgressDlg();
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});

			// TODO 手動設定
			pref_screen_free_name1.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = quickdiallite.sp.edit();
						editor.remove("dial_name1");
						editor.remove("dial_number1");
						editor.commit();
						((PreferenceScreen)screenPref1).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot1).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});


		} catch (Exception e) {
			return;
		}

    }

    //ダイヤル登録（共通動作）
	private Intent com_screenPref_onClick(){

		try {
			Intent intent;
			int sdkVersion = Integer.parseInt(Build.VERSION.SDK);
			if (sdkVersion < Build.VERSION_CODES.ECLAIR) {
				intent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts/phones"));
			}else{
				intent = new Intent(Intent.ACTION_PICK, Uri.parse("content://com.android.contacts/data/phones"));
			}
			return intent;
		} catch (NumberFormatException e) {
			return null;
		}
	}

	//ダイヤル登録（電話帳戻り）
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {

        try {
	    	super.onActivityResult(requestCode, resultCode, intent);

	        Editor editor;

			if (resultCode == Activity.RESULT_OK) {

				Uri uri = intent.getData();
				Cursor personCursor = managedQuery(uri, null, null, null, null);
				if (personCursor.moveToFirst()) {

					int nameIndex;
					int numberIndex;

					int sdkVersion = Integer.parseInt(Build.VERSION.SDK);
			        if (sdkVersion < Build.VERSION_CODES.ECLAIR) {
						 nameIndex = personCursor.getColumnIndexOrThrow("name");
						 numberIndex = personCursor.getColumnIndexOrThrow("number");
			        }else{
						 nameIndex = personCursor.getColumnIndexOrThrow("display_name");
						 numberIndex = personCursor.getColumnIndexOrThrow("data1");
			        }

					String name = personCursor.getString(nameIndex);
					String number = personCursor.getString(numberIndex);

					editor = quickdiallite.sp.edit();

					if (requestCode == REQUEST_PICK_CONTACT1){
						((PreferenceScreen)screenPref1).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot1).setSummary(name + ":" + number);
						editor.putString("dial_name1",name);
						editor.putString("dial_number1",number);
					}else if (requestCode == REQUEST_PICK_CONTACT2){
						((PreferenceScreen)screenPref2).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot2).setSummary(name + ":" + number);
						editor.putString("dial_name2",name);
						editor.putString("dial_number2",number);
					}else if (requestCode == REQUEST_PICK_CONTACT3){
						((PreferenceScreen)screenPref3).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot3).setSummary(name + ":" + number);
						editor.putString("dial_name3",name);
						editor.putString("dial_number3",number);
					}else if (requestCode == REQUEST_PICK_CONTACT4){
						((PreferenceScreen)screenPref4).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot4).setSummary(name + ":" + number);
						editor.putString("dial_name4",name);
						editor.putString("dial_number4",number);
					}else if (requestCode == REQUEST_PICK_CONTACT5){
						((PreferenceScreen)screenPref5).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot5).setSummary(name + ":" + number);
						editor.putString("dial_name5",name);
						editor.putString("dial_number5",number);
					}else if (requestCode == REQUEST_PICK_CONTACT6){
						((PreferenceScreen)screenPref6).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot6).setSummary(name + ":" + number);
						editor.putString("dial_name6",name);
						editor.putString("dial_number6",number);
					}else if (requestCode == REQUEST_PICK_CONTACT7){
						((PreferenceScreen)screenPref7).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot7).setSummary(name + ":" + number);
						editor.putString("dial_name7",name);
						editor.putString("dial_number7",number);
					}else if (requestCode == REQUEST_PICK_CONTACT8){
						((PreferenceScreen)screenPref8).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot8).setSummary(name + ":" + number);
						editor.putString("dial_name8",name);
						editor.putString("dial_number8",number);
					}else if (requestCode == REQUEST_PICK_CONTACT9){
						((PreferenceScreen)screenPref9).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot9).setSummary(name + ":" + number);
						editor.putString("dial_name9",name);
						editor.putString("dial_number9",number);
					}else if (requestCode == REQUEST_PICK_CONTACT10){
						((PreferenceScreen)screenPref10).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot10).setSummary(name + ":" + number);
						editor.putString("dial_name10",name);
						editor.putString("dial_number10",number);
					}

					editor.commit();
				}
			}

			progressDialog.dismiss();

		} catch (Exception e) {

			if (progressDialog != null) progressDialog.dismiss();

			return;
		}
    }

    private boolean screenPrefDialRoot_OnPreferenceClick(Preference preference){

        try {
			PreferenceScreen screenPref = (PreferenceScreen) preference;
			//子画面オブジェクトを取得する
			Dialog d = screenPref.getDialog();
			//子画面のOnDismissListenerをハンドルする
			d.setOnDismissListener(new OnDismissListener(){
			@Override
			public void onDismiss(DialogInterface dialog) {
			    try {
					Dialog_OnDismiss(dialog);
				} catch (Exception e) {
					return;
				}
			}});

			return true;
		} catch (Exception e) {
			return false;
		}
    }

    private void Dialog_OnDismiss(DialogInterface dialog){

        try {
			//再描画
			ListView v = this.getListView();
			v.invalidateViews();
		} catch (Exception e) {
			return;
		}

    }

    public void showProgressDlg(){
        try {
			progressDialog = new ProgressDialog(this);
			//progressDialog.setTitle(R.string.dialogTitle);
			progressDialog.setMessage("Processing･･･");
			progressDialog.setIndeterminate(false);
			progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			progressDialog.show();
		} catch (Exception e) {
			return;
		}
    }

}
