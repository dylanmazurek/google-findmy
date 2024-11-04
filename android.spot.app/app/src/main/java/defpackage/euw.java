package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euw {
    public final Drawable a;
    public final int b;
    public final Optional c;
    public final Optional d;

    public euw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euw) {
            euw euwVar = (euw) obj;
            if (this.a.equals(euwVar.a) && this.b == euwVar.b && this.c.equals(euwVar.c) && this.d.equals(euwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        return "IconDrawable{drawable=" + String.valueOf(this.a) + ", diameter=" + this.b + ", tintColor=" + String.valueOf(optional2) + ", saturation=" + String.valueOf(optional) + "}";
    }

    public euw(Drawable drawable, int i, Optional optional, Optional optional2) {
        this.a = drawable;
        this.b = i;
        this.c = optional;
        this.d = optional2;
    }
}
