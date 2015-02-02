package com.hanson.ProgressDialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DemoActivity extends Activity {
    private Dialog progressDialog;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new Dialog(DemoActivity.this,R.style.progress_dialog);
                progressDialog.setContentView(R.layout.dialog);
                progressDialog.setCancelable(true);
                progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                TextView msg = (TextView) progressDialog.findViewById(R.id.id_tv_loadingmsg);
                msg.setText("卖力加载中");
                progressDialog.show();
            }
        });
    }

    public void cancel(){
        progressDialog.dismiss();
    }
}
