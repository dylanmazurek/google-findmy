package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.adm.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ech extends ebt {
    public exp af;
    public TextInputLayout ag;
    public ehr ah;
    private String ai;

    public static ech aG(String str) {
        ech echVar = new ech();
        Bundle bundle = new Bundle();
        bundle.putString("deviceNickname", str);
        echVar.ak(bundle);
        return echVar;
    }

    public static boolean aJ(String str) {
        if (!TextUtils.isEmpty(str.trim())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        View inflate = F().getLayoutInflater().inflate(R.layout.dialog_rename, (ViewGroup) null);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.rename_device);
        this.ag = textInputLayout;
        EditText editText = textInputLayout.c;
        editText.getClass();
        editText.setText(this.ai);
        EditText editText2 = this.ag.c;
        editText2.getClass();
        int i = 0;
        editText2.setOnEditorActionListener(new ecd(this, i));
        iqd iqdVar = new iqd(F());
        iqdVar.s(R.string.rename_dialog_title);
        iqdVar.t(inflate);
        iqdVar.r(R.string.rename_dialog_change, new ece((Object) this, i));
        iqdVar.p(android.R.string.cancel, new ece((Object) this, 2));
        final cq b = iqdVar.b();
        b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ecf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ech echVar = ech.this;
                Button button = b.a.i;
                if (echVar.af != null) {
                    EditText editText3 = echVar.ag.c;
                    editText3.getClass();
                    button.setEnabled(echVar.aI(editText3.getText().toString()));
                }
                EditText editText4 = echVar.ag.c;
                editText4.getClass();
                editText4.addTextChangedListener(new ecg(echVar, button));
            }
        });
        Window window = b.getWindow();
        if (window != null) {
            window.setSoftInputMode(36);
        }
        return b;
    }

    public final void aH() {
        EditText editText = this.ag.c;
        editText.getClass();
        String trim = editText.getText().toString().trim();
        exp expVar = this.af;
        expVar.getClass();
        expVar.b(trim);
    }

    public final boolean aI(String str) {
        if (aJ(str)) {
            String trim = str.trim();
            String str2 = this.ai;
            str2.getClass();
            if (!trim.equals(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ag
    public final void ab() {
        F().getWindow().setSoftInputMode(3);
        super.ab();
    }

    @Override // defpackage.ag
    public final void ad() {
        exp expVar = this.af;
        if (expVar != null) {
            expVar.d(this);
        }
        super.ad();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ehq] */
    @Override // defpackage.ag
    public final void af() {
        super.af();
        jer g = this.ah.g();
        if (g.g()) {
            g.c().h(this);
        }
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        String string = A().getString("deviceNickname");
        string.getClass();
        this.ai = string;
    }

    @Override // defpackage.v, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        exp expVar = this.af;
        if (expVar != null) {
            expVar.c();
        }
    }
}
