package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdt implements fdg {
    final /* synthetic */ Runnable a;
    final /* synthetic */ gok b;

    public fdt(gok gokVar, Runnable runnable) {
        this.a = runnable;
        this.b = gokVar;
    }

    @Override // defpackage.fdg
    public final void a() {
        ((Handler) this.b.a).post(this.a);
    }
}
