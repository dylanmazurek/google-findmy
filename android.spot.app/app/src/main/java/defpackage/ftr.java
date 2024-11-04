package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftr {
    public final int a;
    public final int b;

    public ftr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftr)) {
            return false;
        }
        ftr ftrVar = (ftr) obj;
        if (this.a == ftrVar.a && this.b == ftrVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        return "UwbComplexChannel{channel=" + this.a + ", preambleIndex=" + this.b + "}";
    }
}
