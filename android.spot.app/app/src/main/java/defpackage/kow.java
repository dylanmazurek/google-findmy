package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kow extends bme implements ScheduledFuture {
    private final ScheduledFuture c;

    public kow(kov kovVar) {
        this.c = kovVar.a(new njz(this, null));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override // defpackage.bme
    protected final void d() {
        Object obj = this.value;
        boolean z = false;
        if ((obj instanceof blw) && ((blw) obj).c) {
            z = true;
        }
        this.c.cancel(z);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }
}
