package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ews {
    public final String a;
    public final jer b;
    public final int c;
    public final Boolean d;
    public final Boolean e;
    public final View.OnClickListener f;
    public final int g;

    public ews() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ews) {
            ews ewsVar = (ews) obj;
            String str = this.a;
            if (str != null ? str.equals(ewsVar.a) : ewsVar.a == null) {
                if (this.b.equals(ewsVar.b) && this.c == ewsVar.c && ((bool = this.d) != null ? bool.equals(ewsVar.d) : ewsVar.d == null) && this.e.equals(ewsVar.e) && this.f.equals(ewsVar.f)) {
                    int i = this.g;
                    int i2 = ewsVar.g;
                    if (i != 0) {
                        if (i == i2) {
                            return true;
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i2 = this.c;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        int hashCode3 = ((((((((hashCode2 * 1000003) ^ i2) * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        int i3 = this.g;
        a.N(i3);
        return hashCode3 ^ i3;
    }

    public final String toString() {
        String str;
        int i = this.g;
        View.OnClickListener onClickListener = this.f;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(onClickListener);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "PROMOTION";
                    }
                } else {
                    str = "HINT";
                }
            } else {
                str = "WARNING";
            }
        } else {
            str = "ERROR";
        }
        Boolean bool = this.e;
        Boolean bool2 = this.d;
        int i2 = this.c;
        return "SuggestedActionCardValues{title=" + this.a + ", subtitle=" + valueOf + ", icon=" + i2 + ", showIconInRoundBackground=" + bool2 + ", showArrow=" + bool + ", onClickListener=" + valueOf2 + ", cardType=" + str + "}";
    }

    public ews(String str, jer jerVar, int i, Boolean bool, Boolean bool2, View.OnClickListener onClickListener, int i2) {
        this.a = str;
        this.b = jerVar;
        this.c = i;
        this.d = bool;
        this.e = bool2;
        this.f = onClickListener;
        this.g = i2;
    }
}
