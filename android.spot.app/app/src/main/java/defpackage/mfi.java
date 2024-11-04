package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfi {
    final int a;
    final long b;
    final Set c;

    public mfi(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = jjr.m(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mfi mfiVar = (mfi) obj;
            if (this.a == mfiVar.a && this.b == mfiVar.b && amr.g(this.c, mfiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.d("maxAttempts", this.a);
        q.e("hedgingDelayNanos", this.b);
        q.b("nonFatalStatusCodes", this.c);
        return q.toString();
    }
}
