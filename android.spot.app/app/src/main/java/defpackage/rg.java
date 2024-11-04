package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rg extends v {
    final Handler af = new Handler(Looper.getMainLooper());
    final Runnable ag = new nl(this, 11, null);
    public qy ah;
    public int ai;
    public int aj;
    public ImageView ak;
    TextView al;

    private final int aF(int i) {
        Context x = x();
        if (x == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        x.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = x.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        CharSequence b;
        cp cpVar = new cp(y());
        cpVar.k(this.ah.d());
        View inflate = LayoutInflater.from(cpVar.a()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.ak = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.al = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (ja.b(this.ah.a())) {
            b = T(R.string.confirm_device_credential_password);
        } else {
            b = this.ah.b();
        }
        cpVar.g(b, new ece((v) this, 1));
        cpVar.l(inflate);
        cq b2 = cpVar.b();
        b2.setCanceledOnTouchOutside(false);
        return b2;
    }

    @Override // defpackage.ag
    public final void ad() {
        super.ad();
        this.af.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        qy qyVar = this.ah;
        qyVar.t = 0;
        qyVar.i(1);
        this.ah.h(T(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        qy c = ji.c(this, this.m.getBoolean("host_activity", true));
        this.ah = c;
        if (c.u == null) {
            c.u = new cfn();
        }
        int i = 0;
        c.u.g(this, new re(this, 0));
        qy qyVar = this.ah;
        if (qyVar.v == null) {
            qyVar.v = new cfn();
        }
        qyVar.v.g(this, new re(this, 2));
        if (Build.VERSION.SDK_INT >= 26) {
            this.ai = aF(R.attr.colorError);
        } else {
            Context x = x();
            if (x != null) {
                i = bqx.c(x, R.color.biometric_error_color);
            }
            this.ai = i;
        }
        this.aj = aF(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ah.g(true);
    }
}
