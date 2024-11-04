package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdp {
    public final Drawable a;
    public final int b;
    public final jer c;
    private final boolean d;

    public hdp() {
        throw null;
    }

    public static hdo b(Drawable drawable) {
        hdo hdoVar = new hdo((byte[]) null);
        hdoVar.d = drawable;
        hdoVar.b(-1);
        hdoVar.c(false);
        return hdoVar;
    }

    public static hdp c(Drawable drawable) {
        hdo b = b(drawable);
        b.c(true);
        return b.a();
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = cu.c(context, this.b);
        }
        if (this.d) {
            return hog.N(drawable, i);
        }
        return drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdp) {
            hdp hdpVar = (hdp) obj;
            Drawable drawable = this.a;
            if (drawable != null ? drawable.equals(hdpVar.a) : hdpVar.a == null) {
                if (this.b == hdpVar.b && this.d == hdpVar.d && this.c.equals(hdpVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Drawable drawable = this.a;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i2 = this.b;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        jer jerVar = this.c;
        return "TintAwareIcon{icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", useTint=" + this.d + ", iconContentDescription=" + String.valueOf(jerVar) + "}";
    }

    public hdp(Drawable drawable, int i, boolean z, jer jerVar) {
        this.a = drawable;
        this.b = i;
        this.d = z;
        this.c = jerVar;
    }
}
