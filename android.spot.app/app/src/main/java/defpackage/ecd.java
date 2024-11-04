package defpackage;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ecd implements TextView.OnEditorActionListener {
    public final /* synthetic */ v a;
    private final /* synthetic */ int b;

    public /* synthetic */ ecd(v vVar, int i) {
        this.b = i;
        this.a = vVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (this.b != 0) {
            if (i != 6 && i != 0) {
                return false;
            }
            ((ecc) this.a).aJ();
            return true;
        }
        ech echVar = (ech) this.a;
        echVar.af.getClass();
        if (i == 6 || i == 0) {
            EditText editText = echVar.ag.c;
            editText.getClass();
            if (ech.aJ(editText.getText().toString())) {
                echVar.aH();
                echVar.d();
                return true;
            }
        }
        return false;
    }
}
