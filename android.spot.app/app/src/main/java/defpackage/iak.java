package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iak implements lsh {
    private final mko a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final mko f;
    private final mko g;

    public iak(mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, mko mkoVar5, mko mkoVar6, mko mkoVar7) {
        this.a = mkoVar;
        this.b = mkoVar2;
        this.c = mkoVar3;
        this.d = mkoVar4;
        this.e = mkoVar5;
        this.f = mkoVar6;
        this.g = mkoVar7;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ktl a() {
        Context context = (Context) this.a.a();
        fma fmaVar = (fma) this.b.a();
        njz a = ((ian) this.c).a();
        eme a2 = ((emf) this.d).a();
        jzc jzcVar = (jzc) this.e.a();
        jzd jzdVar = (jzd) this.f.a();
        jzc jzcVar2 = (jzc) this.g.a();
        jfh jfhVar = new jfh(false);
        jfh jfhVar2 = new jfh(Long.valueOf(TimeUnit.MINUTES.toMillis(30L)));
        long j = kts.a;
        if (context != null) {
            if (fmaVar != null) {
                if (jzcVar != null) {
                    if (jzcVar2 != null) {
                        if (jzdVar != null) {
                            ktl ktlVar = new ktl(context, fmaVar, a, jzdVar, jzcVar, jzcVar2, jzdVar, a2, jfhVar, jfhVar, jfhVar, jfhVar2, j);
                            boolean z = true;
                            if (ktlVar.f != null && ktlVar.d == null) {
                                z = false;
                            }
                            hwx.V(z, "If authContextManager is set, networkExecutor must be set.");
                            return ktlVar;
                        }
                        throw new NullPointerException("Null transportExecutor");
                    }
                    throw new NullPointerException("Null networkExecutor");
                }
                throw new NullPointerException("Null ioExecutor");
            }
            throw new NullPointerException("Null clock");
        }
        throw new NullPointerException("Null context");
    }
}
