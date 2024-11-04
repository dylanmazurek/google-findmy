package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dol implements dix {
    private final dix a;
    private final Resources b;

    public dol(Resources resources, dix dixVar) {
        bsc.q(resources);
        this.b = resources;
        bsc.q(dixVar);
        this.a = dixVar;
    }

    @Override // defpackage.dix
    public final dlf a(Object obj, int i, int i2, div divVar) {
        return dpr.f(this.b, this.a.a(obj, i, i2, divVar));
    }

    @Override // defpackage.dix
    public final boolean b(Object obj, div divVar) {
        return this.a.b(obj, divVar);
    }
}
