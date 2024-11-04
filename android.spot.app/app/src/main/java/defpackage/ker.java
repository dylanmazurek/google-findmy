package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ker {
    public static final byte[] a = new byte[0];

    public static keq a(kdt kdtVar) {
        kag kagVar = kdtVar.f;
        if (kagVar instanceof kbd) {
            return new keo((kbd) kagVar);
        }
        if (kagVar instanceof kat) {
            return new kep((kat) kagVar, 1);
        }
        if (kagVar instanceof kdh) {
            return new kep((kdh) kagVar, 0);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(String.valueOf(kagVar))));
    }
}
