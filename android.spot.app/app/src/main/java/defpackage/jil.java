package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jil implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public jil(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new jim(this.a.clone());
    }
}
