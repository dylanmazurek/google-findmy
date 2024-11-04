package defpackage;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdj implements Runnable {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ mdp f;

    public mdj(mdp mdpVar, lzj lzjVar, boolean z) {
        long b;
        this.f = mdpVar;
        this.a = z;
        if (lzjVar == null) {
            this.b = false;
            b = 0;
        } else {
            this.b = true;
            b = lzjVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mca a() {
        String str;
        double longValue;
        long abs = Math.abs(this.c) / TimeUnit.SECONDS.toNanos(1L);
        long abs2 = Math.abs(this.c) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        if (true != this.a) {
            str = "CallOptions";
        } else {
            str = "Context";
        }
        sb.append(str);
        sb.append(" deadline exceeded after ");
        if (this.c < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        Long l = (Long) this.f.g.e(lyy.f);
        Locale locale = Locale.US;
        if (l == null) {
            longValue = 0.0d;
        } else {
            longValue = l.longValue() / mdp.a;
        }
        sb.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(longValue)));
        if (this.f.h != null) {
            mfm mfmVar = new mfm();
            this.f.h.g(mfmVar);
            sb.append(" ");
            sb.append(mfmVar);
        }
        return mca.e.d(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.h.h(a());
    }
}
