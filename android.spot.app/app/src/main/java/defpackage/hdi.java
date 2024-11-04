package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdi {
    public final int a;
    public final int b;
    public final int c;

    public hdi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdi) {
            hdi hdiVar = (hdi) obj;
            if (this.a == hdiVar.a && this.b == hdiVar.b && this.c == hdiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "CardVisualElementsInfo{cardCellId=" + this.a + ", cardMainActionId=" + this.b + ", cardSecondaryActionId=" + this.c + "}";
    }

    public hdi(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
