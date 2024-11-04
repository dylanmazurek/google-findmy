package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gic extends mpe implements moh {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gic(long j, mpk mpkVar, Map map, long j2, int i) {
        super(1);
        this.e = i;
        this.a = j;
        this.c = mpkVar;
        this.d = map;
        this.b = j2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [moh, java.lang.Object] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        if (this.e != 0) {
            Object obj2 = this.d;
            long j = this.b;
            awq.h((awr) obj2, blk.a(j) + blk.a(0L), blk.b(j) + blk.b(0L), this.c);
            return mlh.a;
        }
        gig gigVar = (gig) obj;
        gigVar.getClass();
        ljh ljhVar = (ljh) gigVar.z(5);
        ljhVar.w(gigVar);
        gih gihVar = gigVar.b;
        if (gihVar == null) {
            gihVar = gih.c;
        }
        Object obj3 = this.c;
        long j2 = this.a;
        if (gihVar.a < j2) {
            long j3 = this.b;
            ((mpk) obj3).a = true;
            ljh k = gih.c.k();
            k.getClass();
            frx.N(j3, k);
            frx.O(j2, k);
            gih M = frx.M(k);
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            gig gigVar2 = (gig) ljhVar.b;
            gigVar2.b = M;
            gigVar2.a |= 1;
        }
        for (Map.Entry entry : ((jiy) this.d).entrySet()) {
            String str = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            gih gihVar2 = (gih) Collections.unmodifiableMap(gigVar.c).get(str);
            if (gihVar2 == null) {
                gihVar2 = gih.c;
                gihVar2.getClass();
            }
            if (gihVar2.a < j2) {
                ((mpk) obj3).a = true;
                Collections.unmodifiableMap(Collections.unmodifiableMap(((gig) ljhVar.b).c)).getClass();
                ljh k2 = gih.c.k();
                k2.getClass();
                frx.N(longValue, k2);
                frx.O(j2, k2);
                gih M2 = frx.M(k2);
                str.getClass();
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                gig gigVar3 = (gig) ljhVar.b;
                lkl lklVar = gigVar3.c;
                if (!lklVar.b) {
                    gigVar3.c = lklVar.a();
                }
                gigVar3.c.put(str, M2);
            }
        }
        ljn q = ljhVar.q();
        q.getClass();
        return (gig) q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gic(awr awrVar, long j, long j2, moh mohVar, int i) {
        super(1);
        this.e = i;
        this.d = awrVar;
        this.b = j;
        this.a = 0L;
        this.c = mohVar;
    }
}
