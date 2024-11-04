package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bg extends cgk {
    public static final cgn a = new chc(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public bg(boolean z) {
        this.e = z;
    }

    public final void a(ag agVar, boolean z) {
        if (be.Z(3)) {
            Objects.toString(agVar);
        }
        b(agVar.l, z);
    }

    public final void b(String str, boolean z) {
        bg bgVar = (bg) this.c.get(str);
        if (bgVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(bgVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    bgVar.b((String) arrayList.get(i), true);
                }
            }
            bgVar.c();
            this.c.remove(str);
        }
        ddh ddhVar = (ddh) this.d.get(str);
        if (ddhVar != null) {
            ddhVar.p();
            this.d.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        if (be.Z(3)) {
            toString();
        }
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ag agVar) {
        if (!this.g && this.b.remove(agVar.l) != null && be.Z(2)) {
            Objects.toString(agVar);
        }
    }

    public final boolean e(ag agVar) {
        if (this.b.containsKey(agVar.l) && this.e) {
            return this.f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bg bgVar = (bg) obj;
            if (this.b.equals(bgVar.b) && this.c.equals(bgVar.c) && this.d.equals(bgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
