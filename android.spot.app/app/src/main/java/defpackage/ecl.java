package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecl extends ebw {
    public TextInputLayout a;
    public ebf af;
    public dhx ag;
    private ScrollView ah;
    public TextInputLayout b;
    public InputMethodManager c;
    public evo d;
    public efw e;

    private final String o() {
        EditText editText = this.a.c;
        editText.getClass();
        return editText.getText().toString();
    }

    private final String p() {
        EditText editText = this.b.c;
        editText.getClass();
        return editText.getText().toString();
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = LayoutInflater.from(y()).inflate(R.layout.fragment_fullscreen_set_password, viewGroup, false);
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.toolbar);
        cs csVar = (cs) F();
        csVar.i(materialToolbar);
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        g.s();
        this.ah = (ScrollView) inflate.findViewById(R.id.set_password_panel_scrollview);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.password_one);
        this.a = textInputLayout;
        EditText editText = textInputLayout.c;
        editText.getClass();
        editText.setImeActionLabel(T(R.string.next), 0);
        editText.setImeOptions(5);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.password_two);
        this.b = textInputLayout2;
        EditText editText2 = textInputLayout2.c;
        editText2.getClass();
        editText2.setImeActionLabel(T(R.string.secure_device), 0);
        editText2.setImeOptions(6);
        editText2.setOnEditorActionListener(new eyk(this, textInputLayout2, 1));
        if (bundle != null) {
            String string = bundle.getString("password_one");
            if (!TextUtils.isEmpty(string)) {
                EditText editText3 = this.a.c;
                editText3.getClass();
                editText3.setText(string);
            }
            String string2 = bundle.getString("password_two");
            if (!TextUtils.isEmpty(string2)) {
                EditText editText4 = this.b.c;
                editText4.getClass();
                editText4.setText(string2);
            }
        }
        View findViewById = inflate.findViewById(R.id.car_key_suspension_notice_section);
        if (true != A().getBoolean("hasCarKey")) {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((Button) inflate.findViewById(R.id.btn_set_password)).setOnClickListener(new he(this, 18, null));
        return inflate;
    }

    @Override // defpackage.ag
    public final void ab() {
        F().getWindow().setSoftInputMode(3);
        super.ab();
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        ((cfk) this.ag.a).g(O(), new qk(this, 14));
        this.e.b.g(O(), new qk(this, 15));
    }

    public final void d() {
        lpt lptVar;
        lpt lptVar2;
        int an;
        String o = o();
        String p = p();
        efw efwVar = this.e;
        Context x = x();
        ebf ebfVar = this.af;
        jer a = efwVar.a();
        if (!a.g()) {
            ((jni) ((jni) efw.a.f()).j("com/google/android/apps/adm/integrations/android/AndroidSetPasswordViewModel", "onSetPassword", 69, "AndroidSetPasswordViewModel.java")).r("No device present when verifying password.");
            return;
        }
        lqc lqcVar = (lqc) a.c();
        if (bsf.j(lqcVar)) {
            jer jerVar = jdl.a;
            if (!bsf.i(lqcVar)) {
                if (lqcVar.b == 3) {
                    lptVar = (lpt) lqcVar.c;
                } else {
                    lptVar = lpt.C;
                }
                if (lptVar.i >= 30 && (an = hzc.an(lqcVar.f)) != 0 && an == 6) {
                    jerVar = fma.by(x, o, p);
                } else {
                    if (lqcVar.b == 3) {
                        lptVar2 = (lpt) lqcVar.c;
                    } else {
                        lptVar2 = lpt.C;
                    }
                    lqs lqsVar = lptVar2.s;
                    if (lqsVar == null) {
                        lqsVar = lqs.k;
                    }
                    jerVar = fma.bx(x, o, p, lqsVar);
                }
            }
            efwVar.b.l(jerVar);
            if (!jerVar.g() && G().f("set_password_confirmation_dialog") == null) {
                hwx.J(!TextUtils.isEmpty(o));
                ecj ecjVar = new ecj();
                Bundle bundle = new Bundle();
                bundle.putString("bundle_key_password", o);
                ecjVar.ak(bundle);
                ecjVar.cs(G(), "set_password_confirmation_dialog");
                return;
            }
            return;
        }
        ebfVar.d();
        efwVar.d.m(R.string.lock_result_fail);
    }

    public final void e(View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        Rect rect2 = new Rect();
        this.ah.getDrawingRect(rect2);
        if (!rect2.contains(rect)) {
            this.ah.scrollTo(0, view.getTop());
        }
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        F().c().b(this, new eck(this));
        this.c = (InputMethodManager) F().getSystemService("input_method");
        this.e = (efw) new ddh((cgq) this).q(efw.class);
    }

    @Override // defpackage.ag
    public final void j(Bundle bundle) {
        bundle.putString("password_one", o());
        bundle.putString("password_two", p());
    }
}
