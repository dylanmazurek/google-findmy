package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cok implements cfa {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cok(cop copVar, mh mhVar, int i) {
        this.c = i;
        this.a = copVar;
        this.b = mhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (cevVar == cev.ON_DESTROY) {
                    ((Handler) this.b).removeCallbacks(this.a);
                    cfcVar.N().c(this);
                    return;
                }
                return;
            }
            if (cevVar == cev.ON_START) {
                ((cex) this.b).c(this);
                ((cjy) this.a).c(cet.class);
                return;
            }
            return;
        }
        if (!((cop) this.a).v()) {
            cfcVar.N().c(this);
            if (((mh) this.b).C().isAttachedToWindow()) {
                ((cop) this.a).x((mh) this.b);
            }
        }
    }

    public cok(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
