package com.example.cjd38.lab04;

/*
 * Lab 5 for cs 262
 *
 * @author: Cameron Dewey
 * @version 1 10-27-2016
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;


public class settingsfragment extends PreferenceFragment implements OnSharedPreferenceChangeListener {
    private SharedPreferences preferant;
    private boolean remperc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        preferant = PreferenceManager.getDefaultSharedPreferences(getActivity());
    }

    @Override
    public void onResume() {
        super.onResume();
        remperc = preferant.getBoolean("pref_remember_percent", true);
        this.setDefaultPercentPreference(remperc);
        preferant.registerOnSharedPreferenceChangeListener(this);
    }

    private void setDefaultPercentPreference(boolean remperc) {
        Preference defaultPercent = findPreference("pref_forget_percent");
        if (remperc) {
            Lab04.textView.setText("They want more Harambes!");
        } else {
            Lab04.textView.setText("They don't want more Harambes in this world...");
        }
    }

    @Override
    public void onPause() {
        preferant.unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences preferant, String key) {
        if (key.equals("pref_remember_percent")) {
            remperc = preferant.getBoolean(key, true);
        }
        this.setDefaultPercentPreference(remperc);
    }
}
