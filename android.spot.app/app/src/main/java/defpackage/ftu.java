package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftu {
    public static final jis a;
    public final int b;
    public final int c;
    private final int d;

    static {
        int i = jis.d;
        a = jis.m(0, 1, 2, 3);
    }

    public ftu() {
        hwx.K(a.contains(1), "Invalid/unsupported range data notification config");
        hwx.K(true, "Proximity near cannot be greater than proximity far");
        hwx.K(true, "Proximity near and far distances are not set to default");
        this.b = 1;
        this.d = 0;
        this.c = 20000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftu)) {
            return false;
        }
        ftu ftuVar = (ftu) obj;
        int i = ftuVar.b;
        int i2 = ftuVar.d;
        int i3 = ftuVar.c;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, 0, 20000});
    }

    public final String toString() {
        return "UwbRangeDataNtfConfig{mRangeDataNtfConfigType=1, mNtfProximityNear=0, mNtfProximityFar=20000}";
    }
}
