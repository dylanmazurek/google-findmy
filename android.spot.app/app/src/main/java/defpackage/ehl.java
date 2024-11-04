package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehl extends ehb {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/securedevice/SetLockscreenPasswordFragment");
    public dhx af;
    private lqd ag;
    public ewg b;
    public evo c;
    public TextInputLayout d;
    public TextInputLayout e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.fragment_set_lockscreen_password, viewGroup, false);
        cs csVar = (cs) F();
        csVar.i((Toolbar) inflate.findViewById(R.id.set_password_fragment_toolbar));
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        g.s();
        g.j(A().getString("TITLE_RES_ID"));
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.password_one);
        this.d = textInputLayout;
        EditText editText = textInputLayout.c;
        editText.getClass();
        editText.setImeActionLabel(T(R.string.next), 0);
        editText.setImeOptions(5);
        this.e = (TextInputLayout) inflate.findViewById(R.id.password_two);
        boolean z = A().getBoolean("HAS_CAR_KEYS", false);
        View findViewById = inflate.findViewById(R.id.car_key_suspension_notice_section);
        if (true != z) {
            i = 8;
        } else {
            i = 0;
        }
        findViewById.setVisibility(i);
        Button button = (Button) inflate.findViewById(R.id.secure_device_button);
        button.setText(A().getString("BUTTON_TEXT_RES_ID"));
        button.setOnClickListener(new efe(this, 11));
        ((TextView) inflate.findViewById(R.id.set_password_description)).setText(U(R.string.set_password_description_text, d().g));
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        ((cfk) this.af.a).g(O(), new egv(this, 4));
    }

    public final lqc d() {
        return (lqc) eyf.b(this.b.c(), this.ag).c();
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.ag = eyf.g(A());
    }
}
