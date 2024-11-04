package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbs implements ComponentCallbacks2 {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bbs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.b != 0) {
            return;
        }
        ((bym) this.a).f();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (this.b != 0) {
            return;
        }
        ((bym) this.a).f();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (this.b != 0) {
            if (i >= 40) {
                aqr aqrVar = (aqr) this.a;
                if (!aqrVar.e) {
                    aqrVar.c.a();
                    Object obj = this.a;
                    ((aqr) obj).a.getViewTreeObserver().addOnPreDrawListener(new bot(obj, 1));
                    ((aqr) this.a).e = true;
                    return;
                }
                return;
            }
            return;
        }
        ((bym) this.a).f();
    }
}
