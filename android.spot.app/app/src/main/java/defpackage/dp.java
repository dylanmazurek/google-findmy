package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dp extends od {
    private cw a;
    private final bux c;

    public dp(Context context, int i) {
        super(context, a(context, i));
        this.c = new bux() { // from class: do
            @Override // defpackage.bux
            public final boolean f(KeyEvent keyEvent) {
                return dp.this.d(keyEvent);
            }
        };
        cw b = b();
        ((dn) b).H = a(context, i);
        b.o();
    }

    private static int a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    private final void h() {
        bty.e(getWindow().getDecorView(), this);
        bza.d(getWindow().getDecorView(), this);
        ix.b(getWindow().getDecorView(), this);
    }

    @Override // defpackage.od, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().d(view, layoutParams);
    }

    public final cw b() {
        if (this.a == null) {
            int i = cw.b;
            this.a = new dn(getContext(), getWindow(), this);
        }
        return this.a;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return buy.a(this.c, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        b().p(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return b().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().f();
    }

    @Override // defpackage.od, android.app.Dialog
    public void onCreate(Bundle bundle) {
        b().e();
        super.onCreate(bundle);
        b().o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.od, android.app.Dialog
    public final void onStop() {
        super.onStop();
        b().h();
    }

    @Override // defpackage.od, android.app.Dialog
    public void setContentView(int i) {
        h();
        b().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        b().m(getContext().getString(i));
    }

    @Override // defpackage.od, android.app.Dialog
    public void setContentView(View view) {
        h();
        b().k(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().m(charSequence);
    }

    @Override // defpackage.od, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        b().l(view, layoutParams);
    }
}
