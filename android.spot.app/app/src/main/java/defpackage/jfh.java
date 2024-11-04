package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfh implements Serializable, jfe {
    private static final long serialVersionUID = 0;
    public final Object a;

    public jfh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.jfe
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jfh) {
            return amr.g(this.a, ((jfh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ")";
    }
}
