package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoe {
    public final kyj a;
    public final int b;
    private final int c;
    private final boolean d;

    public eoe(kyj kyjVar, int i, int i2, boolean z) {
        this.a = kyjVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final Drawable a(Context context) {
        context.getClass();
        Drawable drawable = context.getDrawable(this.c);
        if (drawable != null) {
            drawable.setAutoMirrored(this.d);
            return drawable;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoe)) {
            return false;
        }
        eoe eoeVar = (eoe) obj;
        if (this.a == eoeVar.a && this.b == eoeVar.b && this.c == eoeVar.c && this.d == eoeVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + a.i(this.d);
    }

    public final String toString() {
        return "SpotCategory(deviceType=" + this.a + ", categoryNameResourceId=" + this.b + ", categoryIconResourceId=" + this.c + ", isCategoryIconAutoMirrored=" + this.d + ")";
    }
}
