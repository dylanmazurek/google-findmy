package com.google.android.apps.adm.accounts;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import defpackage.dul;
import defpackage.dun;
import defpackage.ezt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccountLayout extends ezt {
    public ImageView a;
    public TextView b;
    public TextView c;
    public dun d;
    public boolean e;
    public dul f;

    public AccountLayout(Context context) {
        super(context);
        this.e = false;
    }

    public final void a(Bitmap bitmap) {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.account_image);
        this.b = (TextView) findViewById(R.id.account_name);
        this.c = (TextView) findViewById(R.id.account_display_name);
    }

    public AccountLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }

    public AccountLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
    }
}
