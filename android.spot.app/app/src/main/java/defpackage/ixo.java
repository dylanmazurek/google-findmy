package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ixo implements View.OnFocusChangeListener {
    public final /* synthetic */ ixu a;
    private final /* synthetic */ int b;

    public /* synthetic */ ixo(ixu ixuVar, int i) {
        this.b = i;
        this.a = ixuVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.b != 0) {
            ixi ixiVar = (ixi) this.a;
            ixiVar.f(ixiVar.k());
            return;
        }
        ixu ixuVar = this.a;
        ixq ixqVar = (ixq) ixuVar;
        ixqVar.b = z;
        ixuVar.x();
        if (!z) {
            ixqVar.f(false);
            ixqVar.c = false;
        }
    }
}
