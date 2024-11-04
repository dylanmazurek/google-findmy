package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jij implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public jij(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new jik(this.a);
    }
}
