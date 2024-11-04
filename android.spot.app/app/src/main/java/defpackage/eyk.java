package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eyk implements TextView.OnEditorActionListener {
    public final /* synthetic */ TextInputLayout a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eyk(Object obj, TextInputLayout textInputLayout, int i) {
        this.c = i;
        this.b = obj;
        this.a = textInputLayout;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (this.c != 0) {
            if (i != 6 && i != 0) {
                return false;
            }
            TextInputLayout textInputLayout = this.a;
            ecl eclVar = (ecl) this.b;
            eclVar.c.hideSoftInputFromWindow(textInputLayout.getWindowToken(), 0);
            eclVar.d();
            return true;
        }
        if (i != 6 && i != 0) {
            return false;
        }
        TextInputLayout textInputLayout2 = this.a;
        eyl eylVar = (eyl) this.b;
        eylVar.a.hideSoftInputFromWindow(textInputLayout2.getWindowToken(), 0);
        eylVar.f.aH();
        return true;
    }
}
