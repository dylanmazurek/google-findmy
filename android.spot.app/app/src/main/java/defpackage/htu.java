package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htu {
    private static final hts d = hts.a(Integer.MAX_VALUE);
    public volatile htz a = hty.a;
    public volatile boolean b = true;
    public volatile hts c = d;

    public htu(final Context context, final Executor executor, final hty htyVar, final lqz lqzVar, boolean z, jer jerVar, mko mkoVar) {
        final mko mkoVar2 = jerVar.g() ? null : mkoVar;
        b(new Runnable() { // from class: htt
            @Override // java.lang.Runnable
            public final void run() {
                htu htuVar = htu.this;
                lqz lqzVar2 = lqzVar;
                Context context2 = context;
                if (gad.d(context2)) {
                    htuVar.a(lqzVar2);
                } else {
                    gad.b(context2, new hlt(htuVar, lqzVar2, executor, 2));
                }
                if (htuVar.b) {
                    mko mkoVar3 = mkoVar2;
                    hty htyVar2 = htyVar;
                    if (mkoVar3 == null) {
                        ljh k = nfd.d.k();
                        if (!k.b.y()) {
                            k.t();
                        }
                        nfd nfdVar = (nfd) k.b;
                        nfdVar.c = 2;
                        nfdVar.a |= 4;
                        htuVar.a = htyVar2.a((nfd) k.q());
                        return;
                    }
                    try {
                        htuVar.a = htyVar2.a((nfd) mkoVar3.a());
                    } catch (Throwable th) {
                        ((jni) ((jni) ((jni) hmz.a.g()).i(th)).j("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", '|', "Sampler.java")).r("Couldn't get sampling strategy");
                        ljh k2 = nfd.d.k();
                        if (!k2.b.y()) {
                            k2.t();
                        }
                        ljn ljnVar = k2.b;
                        nfd nfdVar2 = (nfd) ljnVar;
                        nfdVar2.a = 2 | nfdVar2.a;
                        nfdVar2.b = 1L;
                        if (!ljnVar.y()) {
                            k2.t();
                        }
                        nfd nfdVar3 = (nfd) k2.b;
                        nfdVar3.c = 3;
                        nfdVar3.a |= 4;
                        htuVar.a = htyVar2.a((nfd) k2.q());
                    }
                }
            }
        }, executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final void a(lqz lqzVar) {
        try {
            hoc hocVar = (hoc) lqzVar.a();
            this.b = hocVar.b();
            this.c = hts.a(hocVar.a());
        } catch (Throwable th) {
            ((jni) ((jni) ((jni) hmz.a.g()).i(th)).j("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'g', "Sampler.java")).r("Couldn't get config");
            this.b = false;
        }
    }
}
