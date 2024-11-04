package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gae {
    private final jer a = jdl.a;
    private final jer b = jer.i(-1);

    public final boolean equals(Object obj) {
        if (obj instanceof gae) {
            gae gaeVar = (gae) obj;
            if (this.a.equals(gaeVar.a) && this.b.equals(gaeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return ((Integer) ((jeu) this.b).a).toString();
    }
}
