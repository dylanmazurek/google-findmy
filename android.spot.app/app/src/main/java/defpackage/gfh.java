package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfh {
    public final String a;
    public final String b;

    public gfh() {
        throw null;
    }

    public static gfh a(Context context) {
        return new gfh(context.getPackageName());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfh) {
            gfh gfhVar = (gfh) obj;
            if (this.a.equals(gfhVar.a) && this.b.equals(gfhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ApplicationId{packageName=" + this.a + ", moduleName=null, instanceId=" + this.b + "}";
    }

    public gfh(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = "OneGoogle";
    }
}
