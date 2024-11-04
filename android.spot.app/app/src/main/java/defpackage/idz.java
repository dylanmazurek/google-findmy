package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idz {
    public final idt a;

    public idz(idt idtVar) {
        this.a = idtVar;
    }

    public final jyz a() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof idz) {
            return Objects.equals(this.a, ((idz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
