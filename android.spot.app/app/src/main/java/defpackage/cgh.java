package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgh extends cgp implements cgn {
    private Application a;
    private final cgn b;
    private Bundle c;
    private cex d;
    private cjy e;

    public cgh() {
        this.b = new cgm();
    }

    @Override // defpackage.cgn
    public final cgk a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.cgn
    public final cgk b(Class cls, cgu cguVar) {
        Constructor b;
        String str = (String) cguVar.a(cgo.d);
        if (str != null) {
            if (cguVar.a(cge.a) != null && cguVar.a(cge.b) != null) {
                Application application = (Application) cguVar.a(cgm.b);
                boolean isAssignableFrom = cef.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    b = cgi.b(cls, cgi.a);
                } else {
                    b = cgi.b(cls, cgi.b);
                }
                if (b == null) {
                    return this.b.b(cls, cguVar);
                }
                if (isAssignableFrom && application != null) {
                    return cgi.a(cls, b, application, cge.a(cguVar));
                }
                return cgi.a(cls, b, cge.a(cguVar));
            }
            if (this.d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // defpackage.cgn
    public final /* synthetic */ cgk c(mql mqlVar, cgu cguVar) {
        return btx.b(this, mqlVar, cguVar);
    }

    public final cgk d(String str, Class cls) {
        Constructor b;
        cgk a;
        Application application;
        cex cexVar = this.d;
        if (cexVar != null) {
            boolean isAssignableFrom = cef.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.a != null) {
                b = cgi.b(cls, cgi.a);
            } else {
                b = cgi.b(cls, cgi.b);
            }
            if (b == null) {
                if (this.a != null) {
                    return this.b.a(cls);
                }
                if (cgo.c == null) {
                    cgo.c = new cgo();
                }
                cgo.c.getClass();
                return bvn.d(cls);
            }
            cjy cjyVar = this.e;
            cjyVar.getClass();
            Bundle bundle = this.c;
            Bundle a2 = cjyVar.a(str);
            Class[] clsArr = cfz.a;
            cgb cgbVar = new cgb(str, btg.b(a2, bundle));
            cgbVar.b(cjyVar, cexVar);
            bst.d(cjyVar, cexVar);
            if (isAssignableFrom && (application = this.a) != null) {
                a = cgi.a(cls, b, application, cgbVar.a);
            } else {
                a = cgi.a(cls, b, cgbVar.a);
            }
            a.r("androidx.lifecycle.savedstate.vm.tag", cgbVar);
            return a;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.cgp
    public final void e(cgk cgkVar) {
        cex cexVar = this.d;
        if (cexVar != null) {
            cjy cjyVar = this.e;
            cjyVar.getClass();
            bst.c(cgkVar, cjyVar, cexVar);
        }
    }

    public cgh(Application application, cjz cjzVar, Bundle bundle) {
        cgm cgmVar;
        this.e = cjzVar.R();
        this.d = cjzVar.N();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (cgm.a == null) {
                cgm.a = new cgm(application);
            }
            cgmVar = cgm.a;
            cgmVar.getClass();
        } else {
            cgmVar = new cgm();
        }
        this.b = cgmVar;
    }
}
