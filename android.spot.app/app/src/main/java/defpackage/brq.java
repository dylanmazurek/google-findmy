package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brq {
    public static final brq a = new brq(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private brq(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static brq b(brq brqVar, brq brqVar2) {
        return d(Math.max(brqVar.b, brqVar2.b), Math.max(brqVar.c, brqVar2.c), Math.max(brqVar.d, brqVar2.d), Math.max(brqVar.e, brqVar2.e));
    }

    public static brq c(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static brq d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 == 0) {
                    if (i4 != 0) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        return a;
                    }
                } else {
                    i2 = 0;
                }
            }
        }
        return new brq(i, i2, i3, i4);
    }

    public static brq e(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return d(i, i2, i3, i4);
    }

    public final Insets a() {
        return brp.a(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        brq brqVar = (brq) obj;
        if (this.e == brqVar.e && this.b == brqVar.b && this.d == brqVar.d && this.c == brqVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
