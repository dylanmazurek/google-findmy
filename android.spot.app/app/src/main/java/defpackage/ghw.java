package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghw extends mnp implements mol {
    int a;
    final /* synthetic */ goa b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ Map e;
    final /* synthetic */ gok f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghw(gok gokVar, goa goaVar, long j, long j2, Map map, mmx mmxVar) {
        super(2, mmxVar);
        this.f = gokVar;
        this.b = goaVar;
        this.c = j;
        this.d = j2;
        this.e = map;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghw) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            gok gokVar = this.f;
            goa goaVar = this.b;
            long j = this.c;
            long j2 = this.d;
            Map map = this.e;
            this.a = 1;
            obj = ((apc) gokVar.a).C(goaVar, j, j2, map, this);
            if (obj == mneVar) {
                return mneVar;
            }
        }
        return obj;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new ghw(this.f, this.b, this.c, this.d, this.e, mmxVar);
    }
}
