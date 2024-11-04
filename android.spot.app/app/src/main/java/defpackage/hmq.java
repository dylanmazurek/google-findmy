package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmq {
    public final String a;

    public hmq(String str) {
        this.a = str;
    }

    public static hmq a(hmq hmqVar, hmq... hmqVarArr) {
        return new hmq(String.valueOf(hmqVar.a).concat(new jen("").c(hzc.K(Arrays.asList(hmqVarArr), new hkn(6)))));
    }

    public static hmq b(Class cls) {
        if (!ivc.o(null)) {
            return new hmq("null".concat(String.valueOf(cls.getSimpleName())));
        }
        return new hmq(cls.getSimpleName());
    }

    public static String c(hmq hmqVar) {
        if (hmqVar == null) {
            return null;
        }
        return hmqVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hmq) {
            return this.a.equals(((hmq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
