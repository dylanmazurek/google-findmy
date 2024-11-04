package defpackage;

import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hmu implements hmt {
    private final hnb a;
    private final mko b;
    private final mko c;
    private final mko d;
    private final ktn e;

    public hmu(hnb hnbVar, mko mkoVar, mko mkoVar2, mko mkoVar3, jer jerVar, ktn ktnVar) {
        this.a = hnbVar;
        this.b = mkoVar;
        this.c = mkoVar2;
        this.d = mkoVar3;
        this.e = ktnVar;
        if (!((Boolean) jerVar.e(Boolean.FALSE)).booleanValue()) {
            ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 109, "PrimesApiImpl.java")).r("Primes instant initialization");
            try {
                WeakHashMap weakHashMap = jbu.a;
                Iterator it = ((lsp) mkoVar).a().iterator();
                while (it.hasNext()) {
                    ((hpg) it.next()).Y();
                }
            } catch (RuntimeException e) {
                ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 'u', "PrimesApiImpl.java")).r("Primes failed to initialize");
                hnb hnbVar2 = this.a;
                if (!hnbVar2.a) {
                    hnbVar2.a = true;
                    ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).r("Shutdown ...");
                }
            }
        }
    }

    @Override // defpackage.hmt
    public final void a() {
        this.e.g();
    }

    @Override // defpackage.hmt
    public final void b(hsb hsbVar) {
        ((hsg) this.d).a().a(hsbVar);
    }

    @Override // defpackage.hmt
    public final void c() {
        ((hrr) this.c.a()).a();
    }
}
