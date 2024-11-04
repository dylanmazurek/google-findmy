package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heh {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final cfn g;
    public final jer h;

    public heh() {
        throw null;
    }

    public static heg a() {
        heg hegVar = new heg(null);
        hegVar.a = R.id.og_ai_custom_action;
        hegVar.d = 90541;
        hegVar.c = -1;
        hegVar.g = (byte) 7;
        hegVar.f = new cfn();
        return hegVar;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof heh) {
            heh hehVar = (heh) obj;
            if (this.a == hehVar.a && ((drawable = this.b) != null ? drawable.equals(hehVar.b) : hehVar.b == null) && this.c == hehVar.c && this.d.equals(hehVar.d) && this.e == hehVar.e && this.f.equals(hehVar.f) && this.g.equals(hehVar.g) && this.h.equals(hehVar.h)) {
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
        return ((((((((((((hashCode ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * (-721379959)) ^ this.g.hashCode()) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.h;
        cfn cfnVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "CustomActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + String.valueOf(onClickListener) + ", visibilityHandler=null, trailingTextLiveData=" + String.valueOf(cfnVar) + ", highlightTextRetriever=null, availabilityChecker=" + String.valueOf(jerVar) + "}";
    }

    public heh(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, cfn cfnVar, jer jerVar) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = cfnVar;
        this.h = jerVar;
    }
}
