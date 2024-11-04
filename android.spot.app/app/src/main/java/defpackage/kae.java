package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kae {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static kad a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            kad kadVar = (kad) it.next();
            if (kadVar.a()) {
                return kadVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
