package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htn implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;

    public htn(mko mkoVar, mko mkoVar2, mko mkoVar3) {
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final htm a() {
        Context b = ((lry) this.a).b();
        return new htm(b, this.c);
    }
}
