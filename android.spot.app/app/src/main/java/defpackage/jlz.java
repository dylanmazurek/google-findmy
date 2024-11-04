package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class jlz extends jib implements Serializable {
    private static final long serialVersionUID = 0;
    final jls a;
    transient Collection b;
    transient Set c;
    transient Map d;

    public jlz(jls jlsVar) {
        this.a = jlsVar;
    }

    @Override // defpackage.jib, defpackage.jls
    public Collection b(Object obj) {
        return hzc.z(((jhy) this.a).b(obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jib, defpackage.jic
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public jls g() {
        return this.a;
    }

    @Override // defpackage.jib, defpackage.jls
    public final void l() {
        throw null;
    }

    @Override // defpackage.jib, defpackage.jls
    public final boolean o(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jib, defpackage.jls
    public final Collection p() {
        Collection collection = this.b;
        if (collection == null) {
            jlp jlpVar = new jlp(DesugarCollections.unmodifiableCollection(this.a.p()));
            this.b = jlpVar;
            return jlpVar;
        }
        return collection;
    }

    @Override // defpackage.jib, defpackage.jls
    public final Map q() {
        Map map = this.d;
        if (map == null) {
            Map unmodifiableMap = DesugarCollections.unmodifiableMap(hzc.E(this.a.q(), new ihq(7)));
            this.d = unmodifiableMap;
            return unmodifiableMap;
        }
        return map;
    }

    @Override // defpackage.jib, defpackage.jls
    public final Set r() {
        Set set = this.c;
        if (set == null) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(this.a.r());
            this.c = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @Override // defpackage.jib, defpackage.jls
    public final boolean u(Object obj, Object obj2) {
        throw null;
    }
}
