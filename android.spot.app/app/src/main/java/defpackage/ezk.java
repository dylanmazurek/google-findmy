package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezk {
    public final CharSequence a;
    public final Drawable b;

    public ezk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ezk) {
            ezk ezkVar = (ezk) obj;
            if (this.a.equals(ezkVar.a) && this.b.equals(ezkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Drawable drawable = this.b;
        return "SwitchProfileButtonIconAndText{text=" + this.a.toString() + ", icon=" + drawable.toString() + "}";
    }

    public ezk(CharSequence charSequence, Drawable drawable) {
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.a = charSequence;
        if (drawable != null) {
            this.b = drawable;
            return;
        }
        throw new NullPointerException("Null icon");
    }
}
