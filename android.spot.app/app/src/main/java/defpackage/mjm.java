package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjm {
    public final String a;
    public final Map b;

    public mjm(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mjm) {
            mjm mjmVar = (mjm) obj;
            if (this.a.equals(mjmVar.a) && this.b.equals(mjmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("policyName", this.a);
        q.b("rawConfigValue", this.b);
        return q.toString();
    }
}
