package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbr implements ComponentCallbacks2 {
    final /* synthetic */ Configuration a;
    final /* synthetic */ bet b;

    public bbr(Configuration configuration, bet betVar) {
        this.a = configuration;
        this.b = betVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.updateFrom(configuration);
        Iterator it = ((HashMap) this.b.a).entrySet().iterator();
        while (it.hasNext()) {
            if (((bel) ((WeakReference) ((Map.Entry) it.next()).getValue()).get()) == null) {
                it.remove();
            } else {
                throw null;
            }
        }
        this.a.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.b.c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.c();
    }
}
