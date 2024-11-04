package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjy {
    public boolean b;
    public Bundle c;
    public boolean d;
    private cju f;
    public final qd a = new qd();
    public boolean e = true;

    public final Bundle a(String str) {
        if (this.d) {
            Bundle bundle = this.c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void b(String str, cjx cjxVar) {
        cjxVar.getClass();
        if (((cjx) this.a.f(str, cjxVar)) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void c(Class cls) {
        if (this.e) {
            cju cjuVar = this.f;
            if (cjuVar == null) {
                cjuVar = new cju(this);
            }
            this.f = cjuVar;
            try {
                cls.getDeclaredConstructor(null);
                cju cjuVar2 = this.f;
                if (cjuVar2 != null) {
                    String name = cls.getName();
                    name.getClass();
                    cjuVar2.a.add(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final cjx d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Map.Entry next = ((qb) it).next();
            next.getClass();
            pz pzVar = (pz) next;
            cjx cjxVar = (cjx) pzVar.b;
            if (amr.i((String) pzVar.a, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return cjxVar;
            }
        }
        return null;
    }
}
