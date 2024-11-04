package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kot implements kov {
    public final /* synthetic */ kou a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TimeUnit c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ kot(kou kouVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.a = kouVar;
        this.d = obj;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // defpackage.kov
    public final ScheduledFuture a(njz njzVar) {
        if (this.e != 0) {
            Object obj = this.d;
            kou kouVar = this.a;
            hlt hltVar = new hlt(kouVar, obj, njzVar, 11, (byte[]) null);
            TimeUnit timeUnit = this.c;
            return kouVar.b.schedule(hltVar, this.b, timeUnit);
        }
        Object obj2 = this.d;
        kou kouVar2 = this.a;
        cye cyeVar = new cye(kouVar2, obj2, njzVar, 4, null);
        TimeUnit timeUnit2 = this.c;
        return kouVar2.b.schedule(cyeVar, this.b, timeUnit2);
    }
}
