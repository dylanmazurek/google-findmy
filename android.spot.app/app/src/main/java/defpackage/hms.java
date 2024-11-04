package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hms {
    public static final /* synthetic */ int b = 0;
    private static final hms c;
    private static volatile boolean d;
    private static volatile hms e;
    public final hmt a;

    static {
        hms hmsVar = new hms(new hmr());
        c = hmsVar;
        d = true;
        e = hmsVar;
    }

    public hms(hmt hmtVar) {
        this.a = hmtVar;
    }

    public static hms a() {
        jok jokVar;
        if (e == c && d) {
            d = false;
            jni jniVar = (jni) hmz.a.g();
            if (Math.random() < 0.01d) {
                jokVar = jok.FULL;
            } else {
                jokVar = jok.NONE;
            }
            ((jni) ((jni) jniVar.k(jokVar)).j("com/google/android/libraries/performance/primes/Primes", "get", 186, "Primes.java")).r("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b(hms hmsVar) {
        synchronized (hms.class) {
            if (e != c) {
                ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/Primes", "cache", 146, "Primes.java")).r("Primes cached more than once. This call will be ignored.");
            } else {
                e = hmsVar;
            }
        }
    }

    public final void c(hsb hsbVar) {
        this.a.b(hsbVar);
    }
}
