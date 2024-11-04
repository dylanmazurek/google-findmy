package defpackage;

import android.accounts.Account;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.accounts.AccountLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecc extends ebs {
    public boh af;
    public ConstraintLayout ag;
    public TextInputLayout ah;
    public dyh ai;
    public kqp aj;
    private Account ak;
    private boh al;
    private CheckBox am;

    private final void aL(boolean z) {
        boh bohVar;
        if (this.ag == null) {
            return;
        }
        if (!fma.bP(y())) {
            if (!z) {
                new Handler().postDelayed(new dzw(this, 3), 500L);
                return;
            }
        } else if (!z) {
            bohVar = this.af;
            bohVar.b(this.ag);
        }
        bohVar = this.al;
        bohVar.b(this.ag);
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hjw hjwVar;
        this.ag = (ConstraintLayout) LayoutInflater.from(y()).inflate(R.layout.fragment_password_verification, viewGroup, false);
        boh bohVar = new boh();
        this.af = bohVar;
        bohVar.c(this.ag);
        boh bohVar2 = new boh();
        this.al = bohVar2;
        bohVar2.e(y(), R.layout.fragment_password_verification_pending);
        String string = A().getString("account_name", "");
        this.ak = new Account(string, "com.google");
        AccountLayout accountLayout = (AccountLayout) this.ag.findViewById(R.id.account_item);
        int i = 1;
        accountLayout.e = true;
        dul dulVar = this.ai.c;
        dulVar.getClass();
        accountLayout.f = dulVar;
        accountLayout.d = new dun(string);
        accountLayout.f.getClass();
        accountLayout.b.setText(accountLayout.d.a);
        dul dulVar2 = accountLayout.f;
        String str = accountLayout.d.a;
        if (dulVar2.b(str)) {
            hjwVar = (hjw) dulVar2.b.get(str);
        } else {
            hjwVar = null;
        }
        TextView textView = accountLayout.c;
        if (textView != null && hjwVar != null) {
            textView.setText(hjwVar.c);
        }
        if (accountLayout.e) {
            accountLayout.a.setImageResource(R.drawable.gs_account_circle_vd_theme_48);
            dul dulVar3 = accountLayout.f;
            String str2 = accountLayout.d.a;
            str2.getClass();
            if (dulVar3.b != null) {
                dulVar3.d(str2, accountLayout);
            } else {
                if (!dulVar3.c) {
                    dulVar3.a();
                }
                dulVar3.a.put(str2, accountLayout);
            }
        } else {
            accountLayout.a.setVisibility(8);
        }
        this.ah = (TextInputLayout) this.ag.findViewById(R.id.password);
        if (Build.VERSION.SDK_INT >= 26) {
            this.ah.setImportantForAutofill(8);
        }
        TextInputLayout textInputLayout = this.ah;
        Typeface typeface = Typeface.DEFAULT;
        if (typeface != textInputLayout.m) {
            textInputLayout.m = typeface;
            textInputLayout.q.v(typeface);
            ixx ixxVar = textInputLayout.d;
            if (typeface != ixxVar.r) {
                ixxVar.r = typeface;
                ixx.o(ixxVar.h, typeface);
                ixx.o(ixxVar.o, typeface);
            }
            TextView textView2 = textInputLayout.h;
            if (textView2 != null) {
                textView2.setTypeface(typeface);
            }
        }
        EditText editText = this.ah.c;
        editText.getClass();
        editText.setOnEditorActionListener(new ecd(this, i));
        editText.addTextChangedListener(new ecb(this));
        this.ag.findViewById(R.id.sign_in_button).setOnClickListener(new he(this, 15, null));
        this.ag.findViewById(R.id.textview_forgot_password).setOnClickListener(new he(this, 16, null));
        this.am = (CheckBox) this.ag.findViewById(R.id.remember_password_checkbox);
        ((MaterialToolbar) this.ag.findViewById(R.id.toolbar)).q(new he(this, 17, null));
        return this.ag;
    }

    public final void aG() {
        this.ah.k(null);
        this.ah.l(false);
    }

    public final void aH() {
        aL(false);
        d();
    }

    public final void aI() {
        ((InputMethodManager) F().getSystemService("input_method")).hideSoftInputFromWindow(this.ah.getWindowToken(), 0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [lqz, java.lang.Object] */
    public final void aJ() {
        ecc eccVar;
        aI();
        aL(true);
        kqp kqpVar = this.aj;
        if (kqpVar != null) {
            Account account = this.ak;
            EditText editText = this.ah.c;
            editText.getClass();
            String obj = editText.getText().toString();
            boolean isChecked = this.am.isChecked();
            ((bym) kqpVar.b.a()).l(dxq.AUTH_SIGN_IN);
            if (isChecked) {
                ((bym) kqpVar.b.a()).l(dxq.AUTH_SIGN_IN_NEVER_ASK_AGAIN_CHECKBOX_CHECKED);
            }
            if (TextUtils.isEmpty(obj) && (eccVar = ((dyh) kqpVar.a).g) != null) {
                eccVar.aK(1);
                return;
            }
            ((dyh) kqpVar.a).f = isChecked;
            dhx dhxVar = (dhx) kqpVar.d.a();
            account.getClass();
            njz njzVar = new njz(kqpVar, null);
            hwx.K(true ^ TextUtils.isEmpty(obj), "password cannot be empty");
            new duv(dhxVar, account, obj, njzVar).execute(new Void[0]);
        }
    }

    public final void aK(int i) {
        int i2;
        aL(false);
        TextInputLayout textInputLayout = this.ah;
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        i2 = R.string.auth_error_message;
                    } else {
                        i2 = R.string.unable_to_fetch_auth_token_error_message;
                    }
                } else {
                    i2 = R.string.network_error;
                }
            } else {
                i2 = R.string.auth_error_message_bad_auth;
            }
        } else {
            i2 = R.string.passwords_empty;
        }
        textInputLayout.k(T(i2));
    }

    @Override // defpackage.ag
    public final void ab() {
        F().getWindow().setSoftInputMode(3);
        super.ab();
    }

    @Override // defpackage.ag
    public final void ad() {
        boolean z;
        dyh dyhVar = this.ai;
        boolean z2 = true;
        if (dyhVar.g != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI not attached");
        if (dyhVar.g != this) {
            z2 = false;
        }
        hwx.K(z2, "detaching wrong UI");
        this.aj = null;
        dyhVar.g = null;
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        boolean z;
        super.af();
        dyh dyhVar = this.ai;
        if (dyhVar.g == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI already attached");
        dyhVar.g = this;
        dyhVar.g.aj = dyhVar.h;
        EditText editText = this.ah.c;
        editText.getClass();
        editText.requestFocus();
        this.ah.postDelayed(new dzw(this, 2), 100L);
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        bwb.n(F().getWindow().getDecorView(), new dvf(view, 2));
        O().N().a(new heu(this, 1));
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        o(1, R.style.Theme_Fmd);
    }
}
