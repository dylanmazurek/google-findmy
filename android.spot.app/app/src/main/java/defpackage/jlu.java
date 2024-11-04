package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlu extends jlk {
    public final /* synthetic */ jlv a;

    public jlu(jlv jlvVar) {
        this.a = jlvVar;
    }

    @Override // defpackage.jlk
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set r = this.a.a.r();
        return new jlg(r.iterator(), new iig(this, 5));
    }

    @Override // defpackage.jlk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        jlv jlvVar = this.a;
        jlvVar.a.r().remove(entry.getKey());
        return true;
    }
}
