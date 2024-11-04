package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fgn implements fxr {
    private final /* synthetic */ int a;

    public /* synthetic */ fgn(int i) {
        this.a = i;
    }

    @Override // defpackage.fxr
    public final fxs a(Object obj) {
        if (this.a != 0) {
            Bundle bundle = (Bundle) obj;
            if (fgk.d(bundle)) {
                return fma.o(null);
            }
            return fma.o(bundle);
        }
        return fma.o(null);
    }
}
