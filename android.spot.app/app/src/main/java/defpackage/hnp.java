package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnp extends hni {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.hni
    public final void i(hmq hmqVar) {
        ((jni) ((jni) hmz.a.d()).j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 148, "ForegroundTracker.java")).r("App transition to background");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hnl) it.next()).i(hmqVar);
        }
    }

    @Override // defpackage.hni
    public final void j(hmq hmqVar) {
        ((jni) ((jni) hmz.a.d()).j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 140, "ForegroundTracker.java")).r("App transition to foreground");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hnl) it.next()).j(hmqVar);
        }
    }
}
