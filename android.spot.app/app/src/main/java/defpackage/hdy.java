package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdy {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final cfk g;
    public final boolean h;
    public final hdv i;
    public final jer j;
    public final jer k;

    public hdy() {
        throw null;
    }

    public static hdw a() {
        hdw hdwVar = new hdw((byte[]) null);
        hdwVar.e(R.id.og_ai_custom_action);
        hdwVar.i(false);
        hdwVar.h(90541);
        hdwVar.d(-1);
        hdwVar.b(hdv.CUSTOM);
        return hdwVar;
    }

    public final hdy b(View.OnClickListener onClickListener) {
        hdw hdwVar = new hdw(this);
        hdwVar.g(onClickListener);
        return hdwVar.a();
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        cfk cfkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdy) {
            hdy hdyVar = (hdy) obj;
            if (this.a == hdyVar.a && ((drawable = this.b) != null ? drawable.equals(hdyVar.b) : hdyVar.b == null) && this.c == hdyVar.c && this.d.equals(hdyVar.d) && this.e == hdyVar.e && this.f.equals(hdyVar.f) && ((cfkVar = this.g) != null ? cfkVar.equals(hdyVar.g) : hdyVar.g == null) && this.h == hdyVar.h && this.i.equals(hdyVar.i) && this.j.equals(hdyVar.j) && this.k.equals(hdyVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Drawable drawable = this.b;
        int i2 = 0;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int hashCode2 = ((((((((hashCode ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        cfk cfkVar = this.g;
        if (cfkVar != null) {
            i2 = cfkVar.hashCode();
        }
        int i3 = hashCode2 * (-721379959);
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((((i3 ^ i2) * (-721379959)) ^ i) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.k;
        jer jerVar2 = this.j;
        hdv hdvVar = this.i;
        cfk cfkVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "ActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + String.valueOf(onClickListener) + ", visibilityHandler=null, trailingTextContentLiveData=" + String.valueOf(cfkVar) + ", highlightTextRetriever=null, visibleOnIncognito=" + this.h + ", actionType=" + String.valueOf(hdvVar) + ", availabilityChecker=" + String.valueOf(jerVar2) + ", customLabelContentDescription=" + String.valueOf(jerVar) + "}";
    }

    public hdy(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, cfk cfkVar, boolean z, hdv hdvVar, jer jerVar, jer jerVar2) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = cfkVar;
        this.h = z;
        this.i = hdvVar;
        this.j = jerVar;
        this.k = jerVar2;
    }
}
