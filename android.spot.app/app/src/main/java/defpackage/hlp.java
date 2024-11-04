package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hlp implements Parcelable {
    public final boolean a;
    public final Parcelable b;

    public hlp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hlp) {
            hlp hlpVar = (hlp) obj;
            if (this.a == hlpVar.a && this.b.equals(hlpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "State{isPortraitInFullScreen=" + this.a + ", parentState=" + this.b.toString() + "}";
    }

    public hlp(boolean z, Parcelable parcelable) {
        this.a = z;
        if (parcelable == null) {
            throw new NullPointerException("Null parentState");
        }
        this.b = parcelable;
    }
}
