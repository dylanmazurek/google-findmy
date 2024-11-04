package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bl {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public bg d;

    public final Bundle a(String str, Bundle bundle) {
        if (bundle != null) {
            return (Bundle) this.c.put(str, bundle);
        }
        return (Bundle) this.c.remove(str);
    }

    public final ag b(String str) {
        fil filVar = (fil) this.b.get(str);
        if (filVar != null) {
            return (ag) filVar.c;
        }
        return null;
    }

    public final ag c(String str) {
        for (fil filVar : this.b.values()) {
            if (filVar != null) {
                Object obj = filVar.c;
                ag agVar = (ag) obj;
                if (!str.equals(agVar.l)) {
                    obj = agVar.C.a.c(str);
                }
                if (obj != null) {
                    return (ag) obj;
                }
            }
        }
        return null;
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        for (fil filVar : this.b.values()) {
            if (filVar != null) {
                arrayList.add(filVar);
            }
        }
        return arrayList;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (fil filVar : this.b.values()) {
            if (filVar != null) {
                arrayList.add(filVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(ag agVar) {
        if (!this.a.contains(agVar)) {
            synchronized (this.a) {
                this.a.add(agVar);
            }
            agVar.r = true;
            return;
        }
        Objects.toString(agVar);
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(agVar)));
    }

    public final void h() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public final void i(ag agVar) {
        synchronized (this.a) {
            this.a.remove(agVar);
        }
        agVar.r = false;
    }

    public final boolean j(String str) {
        if (this.b.get(str) != null) {
            return true;
        }
        return false;
    }

    public final fil k(String str) {
        return (fil) this.b.get(str);
    }

    public final void l(fil filVar) {
        Object obj = filVar.c;
        ag agVar = (ag) obj;
        if (!j(agVar.l)) {
            this.b.put(agVar.l, filVar);
            boolean z = agVar.K;
            if (be.Z(2)) {
                Objects.toString(obj);
            }
        }
    }

    public final void m(fil filVar) {
        Object obj = filVar.c;
        ag agVar = (ag) obj;
        if (agVar.J) {
            this.d.d(agVar);
        }
        if (this.b.get(agVar.l) == filVar && ((fil) this.b.put(agVar.l, null)) != null && be.Z(2)) {
            Objects.toString(obj);
        }
    }
}
