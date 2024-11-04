package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eca extends ebr {
    public ebf af;
    private eyl ag;
    private efs ah;
    private String ai;

    public static eca aG(lqd lqdVar, String str, boolean z, boolean z2, boolean z3) {
        eca ecaVar = new eca();
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("password", str);
        }
        bundle.putBoolean("supportsMessage", z);
        bundle.putBoolean("hasCarKey", z3);
        bundle.putBoolean("supportsPhoneNumber", z2);
        eyf.m(lqdVar, bundle);
        ecaVar.ak(bundle);
        return ecaVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai = A().getString("password");
        boolean z = A().getBoolean("supportsMessage");
        boolean z2 = A().getBoolean("hasCarKey");
        boolean z3 = A().getBoolean("supportsPhoneNumber");
        InputMethodManager inputMethodManager = (InputMethodManager) F().getSystemService("input_method");
        View inflate = LayoutInflater.from(y()).inflate(R.layout.fragment_full_screen_lock, viewGroup, false);
        ((Toolbar) inflate.findViewById(R.id.toolbar)).q(new he(this, 13, null));
        this.ag = new eyl(inputMethodManager, z(), inflate, z, z3, z2, this);
        if (bundle != null) {
            String string = bundle.getString("message");
            if (!TextUtils.isEmpty(string)) {
                eyl eylVar = this.ag;
                if (eylVar.b) {
                    EditText editText = eylVar.d.c;
                    editText.getClass();
                    editText.setText(string);
                }
            }
            String string2 = bundle.getString("phoneNumber");
            if (!TextUtils.isEmpty(string2)) {
                eyl eylVar2 = this.ag;
                if (eylVar2.c) {
                    EditText editText2 = eylVar2.e.c;
                    editText2.getClass();
                    editText2.setText(string2);
                }
            }
        }
        ((Button) inflate.findViewById(R.id.btn_lock)).setOnClickListener(new he(this, 14, null));
        return inflate;
    }

    public final void aH() {
        efs efsVar = this.ah;
        ebf ebfVar = this.af;
        String str = this.ai;
        String a = this.ag.a();
        String b = this.ag.b();
        efsVar.b.l(dxq.LOCK_CONFIRMATION_ACCEPTED);
        efsVar.c.g(eyf.h(efsVar.a), ebfVar, str, a, b);
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        o(1, R.style.Theme_Fmd);
        this.ah = (efs) new ddh((cgq) this).q(efs.class);
    }

    @Override // defpackage.v, defpackage.ag
    public final void j(Bundle bundle) {
        super.j(bundle);
        eyl eylVar = this.ag;
        if (eylVar != null) {
            bundle.putString("message", eylVar.a());
            bundle.putString("phoneNumber", this.ag.b());
        }
    }
}
