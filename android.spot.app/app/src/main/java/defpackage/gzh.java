package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzh implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        gzm.a.clear();
        gzm.b.clear();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
