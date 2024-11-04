package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class die extends dic {
    public final Drawable a;
    private final dih b;

    public die(dih dihVar) {
        dihVar.getClass();
        this.b = dihVar;
        this.a = null;
        int ordinal = dihVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new mku();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // defpackage.dic
    public final dih a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof die)) {
            return false;
        }
        die dieVar = (die) obj;
        if (this.b != dieVar.b) {
            return false;
        }
        Drawable drawable = dieVar.a;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return "Placeholder(status=" + this.b + ", placeholder=null)";
    }
}
