package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvc extends cs implements lsc {
    private lrs q;
    private volatile lri r;
    private final Object s = new Object();
    public boolean p = false;

    public dvc() {
        m(new cr((cs) this, 3));
    }

    @Override // defpackage.oc, defpackage.ces
    public final cgn P() {
        return ((lrc) hzc.ai(this, lrc.class)).f().c(super.P());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aj, defpackage.oc, defpackage.cd, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof lsc) {
            lrn lrnVar = (lrn) q().b;
            lrs lrsVar = ((lrl) lrn.a(lrnVar.a, lrnVar.b).q(lrl.class)).a;
            this.q = lrsVar;
            if (lrsVar.a == null) {
                lrsVar.a = Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cs, defpackage.aj, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        lrs lrsVar = this.q;
        if (lrsVar != null) {
            lrsVar.a = null;
        }
    }

    public final lri q() {
        if (this.r == null) {
            synchronized (this.s) {
                if (this.r == null) {
                    this.r = new lri(this);
                }
            }
        }
        return this.r;
    }

    @Override // defpackage.lsc
    public final Object r() {
        return q().r();
    }
}
