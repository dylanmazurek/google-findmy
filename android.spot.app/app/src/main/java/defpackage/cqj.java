package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqj extends cqm {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqj(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        cvu cvuVar = this.b;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            cqc.b();
            Log.w(cvu.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long af = moz.af(millis, 900000L);
        long af2 = moz.af(millis, 900000L);
        if (af < 900000) {
            cqc.b();
            Log.w(cvu.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        cvuVar.h = moz.af(af, 900000L);
        if (af2 < 300000) {
            cqc.b();
            Log.w(cvu.a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (af2 > cvuVar.h) {
            cqc.b();
            Log.w(cvu.a, a.ap(af, "Flex duration greater than interval duration; Changed to "));
        }
        cvuVar.i = moz.ai(af2, 300000L, cvuVar.h);
    }

    @Override // defpackage.cqm
    public final /* bridge */ /* synthetic */ apc a() {
        cvu cvuVar = this.b;
        if (!cvuVar.p) {
            return new apc(this.a, cvuVar, this.c);
        }
        throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
    }
}
