package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evn {
    public final int a;
    public final View.OnClickListener b;

    public evn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evn) {
            evn evnVar = (evn) obj;
            if (this.a == evnVar.a && this.b.equals(evnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SnackbarAction{actionStringId=" + this.a + ", action=" + this.b.toString() + "}";
    }

    public evn(int i, View.OnClickListener onClickListener) {
        this.a = i;
        this.b = onClickListener;
    }
}
