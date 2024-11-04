package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glq {
    public final String a;
    public final String b;
    public final int c;

    public glq() {
        throw null;
    }

    public final lbz a() {
        lby lbyVar;
        ljh k = lbz.e.k();
        if (!k.b.y()) {
            k.t();
        }
        String str = this.a;
        ljn ljnVar = k.b;
        lbz lbzVar = (lbz) ljnVar;
        str.getClass();
        lbzVar.a |= 1;
        lbzVar.b = str;
        int i = this.c;
        if (i != 0) {
            switch (i - 1) {
                case 1:
                    lbyVar = lby.IMPORTANCE_DEFAULT;
                    break;
                case 2:
                    lbyVar = lby.IMPORTANCE_HIGH;
                    break;
                case 3:
                    lbyVar = lby.IMPORTANCE_LOW;
                    break;
                case 4:
                    lbyVar = lby.IMPORTANCE_MIN;
                    break;
                case 5:
                    lbyVar = lby.IMPORTANCE_MAX;
                    break;
                case 6:
                    lbyVar = lby.IMPORTANCE_NONE;
                    break;
                default:
                    lbyVar = lby.IMPORTANCE_UNSPECIFIED;
                    break;
            }
            if (!ljnVar.y()) {
                k.t();
            }
            lbz lbzVar2 = (lbz) k.b;
            lbzVar2.d = lbyVar.h;
            lbzVar2.a |= 4;
            if (!TextUtils.isEmpty(this.b)) {
                String str2 = this.b;
                if (!k.b.y()) {
                    k.t();
                }
                lbz lbzVar3 = (lbz) k.b;
                str2.getClass();
                lbzVar3.a |= 2;
                lbzVar3.c = str2;
            }
            return (lbz) k.q();
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glq) {
            glq glqVar = (glq) obj;
            if (this.a.equals(glqVar.a) && this.b.equals(glqVar.b)) {
                int i = this.c;
                int i2 = glqVar.c;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.N(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        switch (this.c) {
            case 1:
                str = "IMPORTANCE_UNSPECIFIED";
                break;
            case 2:
                str = "IMPORTANCE_DEFAULT";
                break;
            case 3:
                str = "IMPORTANCE_HIGH";
                break;
            case 4:
                str = "IMPORTANCE_LOW";
                break;
            case 5:
                str = "IMPORTANCE_MIN";
                break;
            case 6:
                str = "IMPORTANCE_MAX";
                break;
            case 7:
                str = "IMPORTANCE_NONE";
                break;
            default:
                str = "null";
                break;
        }
        String str2 = this.b;
        return "ChimeNotificationChannel{id=" + this.a + ", group=" + str2 + ", importance=" + str + "}";
    }

    public glq(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
