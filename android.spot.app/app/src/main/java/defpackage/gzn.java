package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzn implements Comparable {
    public final Drawable a;
    public final String b;
    public final int c;

    public gzn() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return frx.aw(this.c).compareTo(frx.aw(((gzn) obj).c));
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gzn) {
            gzn gznVar = (gzn) obj;
            if (this.a.equals(gznVar.a) && ((str = this.b) != null ? str.equals(gznVar.b) : gznVar.b == null) && this.c == gznVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = this.c;
        a.N(i);
        return (((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.c;
        String obj = this.a.toString();
        switch (i) {
            case 1:
                str = "APP_CUSTOM";
                break;
            case 2:
                str = "YELLOW_ALERT";
                break;
            case 3:
                str = "RED_ALERT";
                break;
            case 4:
                str = "UPLOAD_ARROW";
                break;
            case 5:
                str = "PAUSED_UPLOAD_ARROW";
                break;
            case 6:
                str = "COMPLETED_CHECKMARK";
                break;
            case 7:
                str = "SYNCING_OFF";
                break;
            default:
                str = "OBAKE";
                break;
        }
        return "BadgeContent{data=" + obj + ", contentDescription=" + this.b + ", badgeType=" + str + "}";
    }

    public gzn(Drawable drawable, String str, int i) {
        if (drawable == null) {
            throw new NullPointerException("Null data");
        }
        this.a = drawable;
        this.b = str;
        this.c = i;
    }
}
