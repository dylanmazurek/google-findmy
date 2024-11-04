package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jjm extends jgl implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient jiy map;
    public final transient int size;

    public jjm(jiy jiyVar, int i) {
        this.map = jiyVar;
        this.size = i;
    }

    @Override // defpackage.jls
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.jgh, defpackage.jls
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jjr r() {
        return this.map.keySet();
    }

    @Override // defpackage.jls
    public final int e() {
        return this.size;
    }

    @Override // defpackage.jgh
    public final /* synthetic */ Collection f() {
        return new jjj(this);
    }

    @Override // defpackage.jgh
    public final /* synthetic */ Collection g() {
        return new jjl(this);
    }

    @Override // defpackage.jgh
    public final /* bridge */ /* synthetic */ Iterator h() {
        throw null;
    }

    @Override // defpackage.jgh
    public final Map j() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.jgh
    public final Set k() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.jls
    @Deprecated
    public final void l() {
        throw null;
    }

    @Override // defpackage.jls
    public final boolean n(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // defpackage.jgh, defpackage.jls
    @Deprecated
    public final boolean o(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jgh, defpackage.jls
    public final /* bridge */ /* synthetic */ Collection p() {
        return (jih) super.p();
    }

    @Override // defpackage.jgh, defpackage.jls
    public /* synthetic */ Map q() {
        return this.map;
    }

    @Override // defpackage.jgh, defpackage.jls
    @Deprecated
    public final boolean u(Object obj, Object obj2) {
        throw null;
    }
}
