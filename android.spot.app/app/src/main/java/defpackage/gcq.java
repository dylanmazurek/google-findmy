package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcq implements gbf, gcn {
    public final juw a;
    public final List b;
    public final gbq c;
    public final long d;

    public gcq(juw juwVar, List list, gbq gbqVar, long j) {
        this.a = juwVar;
        this.b = list;
        this.c = gbqVar;
        this.d = j;
    }

    @Override // defpackage.gcn
    public final /* synthetic */ gbs a() {
        return frx.w(this);
    }

    @Override // defpackage.gcn
    public final List b() {
        return this.b;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        juv juvVar = frx.w(this).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        q.d("rootVeId", juvVar.c);
        juv juvVar2 = frx.x(this).c;
        if (juvVar2 == null) {
            juvVar2 = juv.e;
        }
        q.d("targetVeId", juvVar2.c);
        return q.toString();
    }
}
