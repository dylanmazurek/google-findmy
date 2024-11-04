package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irg {
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public boolean c;
    public boolean d;
    public hrc e;

    public final void a() {
        if (this.e != null) {
            new HashSet(this.b);
        }
    }

    public final boolean b(iro iroVar) {
        Integer valueOf = Integer.valueOf(iroVar.getId());
        if (this.b.contains(valueOf)) {
            return false;
        }
        Map map = this.a;
        int i = -1;
        if (this.c && !this.b.isEmpty()) {
            i = ((Integer) this.b.iterator().next()).intValue();
        }
        iro iroVar2 = (iro) map.get(Integer.valueOf(i));
        if (iroVar2 != null) {
            c(iroVar2, false);
        }
        boolean add = this.b.add(valueOf);
        if (!iroVar.isChecked()) {
            iroVar.setChecked(true);
        }
        return add;
    }

    public final boolean c(iro iroVar, boolean z) {
        Integer valueOf = Integer.valueOf(iroVar.getId());
        if (!this.b.contains(valueOf)) {
            return false;
        }
        if (z && this.b.size() == 1 && this.b.contains(valueOf)) {
            iroVar.setChecked(true);
            return false;
        }
        boolean remove = this.b.remove(valueOf);
        if (iroVar.isChecked()) {
            iroVar.setChecked(false);
        }
        return remove;
    }
}
