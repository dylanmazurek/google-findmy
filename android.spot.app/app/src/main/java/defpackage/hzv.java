package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzv implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ijs.c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ijs.c();
        hzu.b = i;
        Iterator it = hzu.a.iterator();
        while (it.hasNext()) {
            ((hzt) it.next()).b(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
