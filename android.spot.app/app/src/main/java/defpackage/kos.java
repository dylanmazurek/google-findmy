package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kos implements kov {
    public final /* synthetic */ kou a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TimeUnit e;
    private final /* synthetic */ int f;

    public /* synthetic */ kos(kou kouVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f = i;
        this.a = kouVar;
        this.b = runnable;
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
    }

    @Override // defpackage.kov
    public final ScheduledFuture a(njz njzVar) {
        if (this.f != 0) {
            Runnable runnable = this.b;
            kou kouVar = this.a;
            hlt hltVar = new hlt(kouVar, runnable, njzVar, 10, (byte[]) null);
            TimeUnit timeUnit = this.e;
            long j = this.d;
            return kouVar.b.scheduleAtFixedRate(hltVar, this.c, j, timeUnit);
        }
        Runnable runnable2 = this.b;
        kou kouVar2 = this.a;
        hlt hltVar2 = new hlt(kouVar2, runnable2, njzVar, 9, (byte[]) null);
        TimeUnit timeUnit2 = this.e;
        long j2 = this.d;
        return kouVar2.b.scheduleWithFixedDelay(hltVar2, this.c, j2, timeUnit2);
    }
}
