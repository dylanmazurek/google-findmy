package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghp {
    public final int a;
    public final String b;
    public final goa c;
    public final List d;
    public final lgz e;
    public final Intent f;
    public final gxh g;
    public final boolean h;
    public final ghr i;
    public final int j;
    private final lfq k;

    public ghp() {
        throw null;
    }

    public static gho a() {
        gho ghoVar = new gho();
        ghoVar.c = new ArrayList();
        ghoVar.e(lgz.f);
        ghoVar.d(gxh.b);
        gji gjiVar = new gji();
        gjiVar.d(lct.REMOVE_REASON_UNKNOWN);
        ghoVar.f = gjiVar.c();
        ghoVar.c(false);
        return ghoVar;
    }

    public final boolean equals(Object obj) {
        String str;
        goa goaVar;
        Intent intent;
        lfq lfqVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ghp)) {
            return false;
        }
        ghp ghpVar = (ghp) obj;
        int i = this.j;
        int i2 = ghpVar.j;
        if (i != 0) {
            if (i2 == 1 && this.a == ghpVar.a && ((str = this.b) != null ? str.equals(ghpVar.b) : ghpVar.b == null) && ((goaVar = this.c) != null ? goaVar.equals(ghpVar.c) : ghpVar.c == null) && this.d.equals(ghpVar.d) && this.e.equals(ghpVar.e) && ((intent = this.f) != null ? intent.equals(ghpVar.f) : ghpVar.f == null) && this.g.equals(ghpVar.g) && ((lfqVar = this.k) != null ? lfqVar.equals(ghpVar.k) : ghpVar.k == null) && this.h == ghpVar.h && this.i.equals(ghpVar.i)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int i2;
        int i3;
        a.N(this.j);
        String str = this.b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = this.a;
        goa goaVar = this.c;
        if (goaVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = goaVar.hashCode();
        }
        int hashCode4 = ((((hashCode ^ ((i5 ^ (-722379962)) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ this.d.hashCode();
        lgz lgzVar = this.e;
        if (lgzVar.y()) {
            i = lgzVar.i();
        } else {
            int i6 = lgzVar.y;
            if (i6 == 0) {
                i6 = lgzVar.i();
                lgzVar.y = i6;
            }
            i = i6;
        }
        int i7 = ((hashCode4 * 1000003) ^ i) * 1000003;
        Intent intent = this.f;
        if (intent == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = intent.hashCode();
        }
        int i8 = (i7 ^ hashCode3) * 1000003;
        gxh gxhVar = this.g;
        if (gxhVar.y()) {
            i2 = gxhVar.i();
        } else {
            int i9 = gxhVar.y;
            if (i9 == 0) {
                i9 = gxhVar.i();
                gxhVar.y = i9;
            }
            i2 = i9;
        }
        int i10 = (i8 ^ i2) * 1000003;
        lfq lfqVar = this.k;
        if (lfqVar != null) {
            if (lfqVar.y()) {
                i4 = lfqVar.i();
            } else {
                i4 = lfqVar.y;
                if (i4 == 0) {
                    i4 = lfqVar.i();
                    lfqVar.y = i4;
                }
            }
        }
        int i11 = (i10 ^ i4) * 1000003;
        if (true != this.h) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        return ((i11 ^ i3) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String str;
        if (this.j != 1) {
            str = "null";
        } else {
            str = "SYSTEM_TRAY";
        }
        int i = this.a;
        String str2 = this.b;
        goa goaVar = this.c;
        List list = this.d;
        lgz lgzVar = this.e;
        Intent intent = this.f;
        gxh gxhVar = this.g;
        lfq lfqVar = this.k;
        boolean z = this.h;
        ghr ghrVar = this.i;
        return "NotificationEvent{source=" + str + ", type=" + i + ", actionId=" + str2 + ", account=" + String.valueOf(goaVar) + ", threads=" + String.valueOf(list) + ", threadStateUpdate=" + String.valueOf(lgzVar) + ", intent=" + String.valueOf(intent) + ", localThreadState=" + String.valueOf(gxhVar) + ", action=" + String.valueOf(lfqVar) + ", activityLaunched=" + z + ", removalInfo=" + String.valueOf(ghrVar) + "}";
    }

    public ghp(int i, String str, goa goaVar, List list, lgz lgzVar, Intent intent, gxh gxhVar, lfq lfqVar, boolean z, ghr ghrVar) {
        this.j = 1;
        this.a = i;
        this.b = str;
        this.c = goaVar;
        this.d = list;
        this.e = lgzVar;
        this.f = intent;
        this.g = gxhVar;
        this.k = lfqVar;
        this.h = z;
        this.i = ghrVar;
    }
}
