package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgu {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final jer g;

    public hgu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hgu) {
            hgu hguVar = (hgu) obj;
            if (this.a == hguVar.a && ((drawable = this.b) != null ? drawable.equals(hguVar.b) : hguVar.b == null) && this.c == hguVar.c && this.d.equals(hguVar.d) && this.e == hguVar.e && this.f.equals(hguVar.f) && this.g.equals(hguVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Drawable drawable = this.b;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return ((((((((((hashCode ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "SimpleActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + String.valueOf(onClickListener) + ", availabilityChecker=" + String.valueOf(jerVar) + "}";
    }

    public hgu(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, jer jerVar) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = jerVar;
    }
}
