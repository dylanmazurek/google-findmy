package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jej implements Serializable, jei {
    private static final long serialVersionUID = 0;
    private final Object a;

    public jej(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        return this.a;
    }

    @Override // defpackage.jei
    public final boolean equals(Object obj) {
        if (obj instanceof jej) {
            return amr.g(this.a, ((jej) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + String.valueOf(this.a) + ")";
    }
}
