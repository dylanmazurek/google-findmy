package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class cei {
    final int a;
    final Method b;

    public cei(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cei)) {
            return false;
        }
        cei ceiVar = (cei) obj;
        if (this.a == ceiVar.a && this.b.getName().equals(ceiVar.b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
