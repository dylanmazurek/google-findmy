package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrn implements lsc {
    public final cgq a;
    public final Context b;
    private final Object c = new Object();
    private volatile dwg d;

    public lrn(oc ocVar) {
        this.a = ocVar;
        this.b = ocVar;
    }

    public static final ddh a(cgq cgqVar, Context context) {
        return new ddh(cgqVar, new lrj(context, 0));
    }

    @Override // defpackage.lsc
    public final /* bridge */ /* synthetic */ Object r() {
        if (this.d == null) {
            synchronized (this.c) {
                if (this.d == null) {
                    this.d = ((lrl) a(this.a, this.b).q(lrl.class)).b;
                }
            }
        }
        return this.d;
    }
}
