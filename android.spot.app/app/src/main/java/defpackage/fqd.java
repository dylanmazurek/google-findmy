package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fqd implements fxn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fqd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.fxn
    public final void c(Exception exc) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    boolean z = fzy.a;
                    Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
                    return;
                } else {
                    boolean z2 = fzy.a;
                    Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
                    return;
                }
            }
            fqb.b.c(this.a, new ene(19));
            return;
        }
        fqj.b.c(this.a, new ene(20));
    }
}
