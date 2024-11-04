package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbb {
    int a;
    final int b;
    jbb c;
    final Map d = new HashMap(0);

    public jbb(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return "Node" + System.identityHashCode(this);
    }
}
