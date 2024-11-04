package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlv extends jlr {
    public final jls a;

    public jlv(jls jlsVar) {
        this.a = jlsVar;
    }

    @Override // defpackage.jlr
    public final Set b() {
        return new jlu(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        jks jksVar = (jks) this.a;
        jksVar.a = null;
        jksVar.b = null;
        jksVar.d.clear();
        jksVar.e = 0;
        jksVar.f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.n(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return new jkk((jks) this.a, obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (((jks) this.a).a == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jlr, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.r();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((jks) this.a).i(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.r().size();
    }
}
