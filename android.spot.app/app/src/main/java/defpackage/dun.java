package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dun {
    public final String a;

    public dun(String str) {
        hwx.K(!TextUtils.isEmpty(str), "accountName cannot be empty");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return amr.g(this.a, ((dun) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        jeq p = ivc.p(getClass());
        p.b("accountName", this.a);
        return p.toString();
    }
}
