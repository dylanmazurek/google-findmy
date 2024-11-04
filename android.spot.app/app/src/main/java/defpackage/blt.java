package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blt implements blr {
    private final float[] a;
    private final float[] b;

    public blt(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length) {
            this.a = fArr;
            this.b = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero");
    }

    @Override // defpackage.blr
    public final float a(float f) {
        return beg.e(f, this.b, this.a);
    }

    @Override // defpackage.blr
    public final float b(float f) {
        return beg.e(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof blt)) {
            return false;
        }
        blt bltVar = (blt) obj;
        if (Arrays.equals(this.a, bltVar.a) && Arrays.equals(this.b, bltVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
