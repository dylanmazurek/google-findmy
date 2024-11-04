package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jee extends jef implements Serializable {
    private static final long serialVersionUID = 0;
    final jef a;

    public jee(jef jefVar) {
        this.a = jefVar;
    }

    @Override // defpackage.jef
    protected final Object b(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.jef
    protected final Object c(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.jef
    public final Object d(Object obj) {
        return this.a.e(obj);
    }

    @Override // defpackage.jef
    public final Object e(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.jei
    public final boolean equals(Object obj) {
        if (obj instanceof jee) {
            return this.a.equals(((jee) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
