package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cge {
    public static final cgt a = new cgc();
    public static final cgt b = new cgc();
    public static final cgt c = new cgc();

    public static final cfz a(cgu cguVar) {
        cgf cgfVar;
        Bundle bundle;
        cjz cjzVar = (cjz) cguVar.a(a);
        if (cjzVar != null) {
            cgq cgqVar = (cgq) cguVar.a(b);
            if (cgqVar != null) {
                Bundle bundle2 = (Bundle) cguVar.a(c);
                String str = (String) cguVar.a(cgo.d);
                if (str != null) {
                    cjx d = cjzVar.R().d();
                    if (d instanceof cgf) {
                        cgfVar = (cgf) d;
                    } else {
                        cgfVar = null;
                    }
                    if (cgfVar != null) {
                        cgg b2 = b(cgqVar);
                        cfz cfzVar = (cfz) b2.a.get(str);
                        if (cfzVar == null) {
                            Class[] clsArr = cfz.a;
                            cgfVar.b();
                            Bundle bundle3 = cgfVar.a;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = cgfVar.a;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = cgfVar.a;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                cgfVar.a = null;
                            }
                            cfz b3 = btg.b(bundle, bundle2);
                            b2.a.put(str, b3);
                            return b3;
                        }
                        return cfzVar;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final cgg b(cgq cgqVar) {
        return (cgg) ((eld) new ddh(cgqVar, new cgd()).a).f(moz.c(cgg.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(cjz cjzVar) {
        cew cewVar = cjzVar.N().b;
        if (cewVar != cew.INITIALIZED && cewVar != cew.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (cjzVar.R().d() == null) {
            cgf cgfVar = new cgf(cjzVar.R(), (cgq) cjzVar);
            cjzVar.R().b("androidx.lifecycle.internal.SavedStateHandlesProvider", cgfVar);
            cjzVar.N().a(new cga(cgfVar, 0));
        }
    }
}
