package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hni {
    public int a = 1;

    public abstract void i(hmq hmqVar);

    public abstract void j(hmq hmqVar);

    public final void k(hmq hmqVar) {
        if (this.a == 3) {
            ((jni) ((jni) hmz.a.d()).j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).r("Already in the background, not transitioning");
        } else {
            this.a = 3;
            i(hmqVar);
        }
    }

    public final void l(hmq hmqVar) {
        if (this.a == 2) {
            ((jni) ((jni) hmz.a.d()).j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).r("Already in the foreground, not transitioning");
        } else {
            this.a = 2;
            j(hmqVar);
        }
    }
}
