package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jib extends jic implements jls {
    public Collection b(Object obj) {
        throw null;
    }

    protected abstract jls c();

    @Override // defpackage.jls
    public final int e() {
        throw null;
    }

    @Override // defpackage.jls
    public final boolean equals(Object obj) {
        if (obj != this && !c().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jic
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // defpackage.jls
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // defpackage.jls
    public void l() {
        throw null;
    }

    @Override // defpackage.jls
    public final boolean n(Object obj) {
        throw null;
    }

    @Override // defpackage.jls
    public boolean o(Object obj, Object obj2) {
        return c().o(obj, obj2);
    }

    @Override // defpackage.jls
    public Collection p() {
        return c().p();
    }

    @Override // defpackage.jls
    public Map q() {
        return c().q();
    }

    @Override // defpackage.jls
    public Set r() {
        return c().r();
    }

    @Override // defpackage.jls
    public final boolean s(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.jls
    public boolean u(Object obj, Object obj2) {
        throw null;
    }
}
