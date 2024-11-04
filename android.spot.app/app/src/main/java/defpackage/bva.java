package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bva implements cfa {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bva(apc apcVar, bvd bvdVar, int i) {
        this.c = i;
        this.a = apcVar;
        this.b = bvdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [bvd, java.lang.Object] */
    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (this.c != 0) {
            if (cevVar == cev.ON_CREATE) {
                Object obj = this.a;
                ((ox) this.b).e(ny.a.a((Activity) obj));
                return;
            }
            return;
        }
        if (cevVar == cev.ON_DESTROY) {
            ((apc) this.a).l(this.b);
        }
    }

    public /* synthetic */ bva(ox oxVar, oc ocVar, int i) {
        this.c = i;
        this.b = oxVar;
        this.a = ocVar;
    }
}
