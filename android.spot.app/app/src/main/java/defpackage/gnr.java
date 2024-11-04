package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnr extends jyh implements jzb {
    public volatile jzb a;

    public gnr(jyz jyzVar, jzb jzbVar) {
        super(jyzVar);
        this.a = jzbVar;
        jyzVar.c(new gcb(this, 6), jxv.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
