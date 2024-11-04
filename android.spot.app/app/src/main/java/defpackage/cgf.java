package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgf implements cjx {
    public Bundle a;
    private final cjy b;
    private boolean c;
    private final mkt d;

    public cgf(cjy cjyVar, cgq cgqVar) {
        this.b = cjyVar;
        this.d = new mla(new azp(cgqVar, 16));
    }

    private final cgg c() {
        return (cgg) this.d.a();
    }

    @Override // defpackage.cjx
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((cfz) entry.getValue()).f.a();
            if (!amr.i(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.c = false;
        return bundle;
    }

    public final void b() {
        if (!this.c) {
            Bundle a = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.a;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a != null) {
                bundle.putAll(a);
            }
            this.a = bundle;
            this.c = true;
            c();
        }
    }
}
